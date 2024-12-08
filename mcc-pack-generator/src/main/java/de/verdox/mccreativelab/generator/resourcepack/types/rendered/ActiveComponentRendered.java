package de.verdox.mccreativelab.generator.resourcepack.types.rendered;

import de.verdox.mccreativelab.generator.resourcepack.types.rendered.element.HudElement;
import de.verdox.mccreativelab.generator.resourcepack.types.rendered.element.single.SingleHudText;
import de.verdox.mccreativelab.util.io.StringAlign;
import net.kyori.adventure.audience.Audience;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.Style;
import org.apache.commons.lang3.function.TriConsumer;
import org.jetbrains.annotations.Nullable;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Consumer;
import java.util.function.Function;

/**
 * @param <T> - Self reference
 */
public abstract class ActiveComponentRendered<T extends ActiveComponentRendered<T, C>, C extends ComponentRendered<C, T>> {
    private final Map<String, HudElement.Rendered<?>> renderedElements = new LinkedHashMap<>();
    private final Map<HudElement, HudElement.Rendered<?>> hudElementToRenderedElementMapping = new HashMap<>();
    private final C componentRendered;
    private final List<HudElement.Rendered<?>> sorted;
    private Component lastRendered;
    private boolean needsUpdate = true;
    protected final Set<Audience> viewers = ConcurrentHashMap.newKeySet();
    public final Map<String, Object> tempData = new HashMap<>();

    public ActiveComponentRendered(C componentRendered) {
        this.componentRendered = componentRendered;
        componentRendered.getElements().forEach((s, hudElement) -> registerElement(s, hudElement, hudElement.toRenderedElement()));

        this.sorted = List.copyOf(renderedElements.values()).stream().sorted(Comparator.comparingInt(rendered -> {
            if (rendered instanceof SingleHudText.RenderedSingleHudText renderedSingleHudText) {
                StringAlign.Alignment alignment = renderedSingleHudText.getHudElement().alignment();
                if (alignment == null)
                    alignment = StringAlign.Alignment.LEFT;
                // We want to sort them by alignment -> Else we get weird spacing behaviour
                return switch (alignment) {
                    case LEFT -> -1;
                    case CENTER -> 0;
                    case RIGHT -> 1;
                };
            }
            return -1;
        })).toList();

        forEachElementBehavior((activeHudRenderedHudElementBehavior, rendered, audience) -> activeHudRenderedHudElementBehavior.onOpen((T) this, rendered, audience), true);
    }

    public Component getLastRendered() {
        return lastRendered;
    }

    public <R> ActiveComponentRendered<T, C> addTemporaryData(String key, @Nullable R value) {
        if (value == null)
            tempData.remove(key);
        else
            tempData.put(key, value);
        return this;
    }

    public void copyTemporaryDataFromGUI(ActiveComponentRendered<T, C> activeGUI) {
        this.tempData.putAll(activeGUI.tempData);
    }

    @Nullable
    public <R> R getTemporaryDataOrDefault(String key, Class<? extends R> type, R defaultVal) {
        return type.cast(tempData.getOrDefault(key, defaultVal));
    }

    public final void forEachElementBehavior(TriConsumer<RenderedElementBehavior<T, HudElement.Rendered<?>>, HudElement.Rendered<?>, Audience> forEach, boolean forceUpdate) {
        for (HudElement.Rendered<?> rendered : this.sorted) {
            HudElement hudElement = rendered.getHudElement();
            RenderedElementBehavior<T, HudElement.Rendered<?>> behavior = (RenderedElementBehavior<T, HudElement.Rendered<?>>) componentRendered
                .getBehaviors().getOrDefault(hudElement, null);
            if (behavior != null) {
                viewers.forEach(audience -> forEach.accept(behavior, rendered, audience));
            }
        }
        if (forceUpdate)
            forceUpdate();
    }

    public final void forEachElementBehavior(TriConsumer<RenderedElementBehavior<T, HudElement.Rendered<?>>, HudElement.Rendered<?>, Audience> forEach, boolean forceUpdate, Audience audience) {
        for (HudElement.Rendered<?> rendered : this.sorted) {
            HudElement hudElement = rendered.getHudElement();
            RenderedElementBehavior<T, HudElement.Rendered<?>> behavior = (RenderedElementBehavior<T, HudElement.Rendered<?>>) componentRendered
                .getBehaviors().getOrDefault(hudElement, null);
            if (behavior != null) {
                forEach.accept(behavior, rendered, audience);
            }
        }
        if (forceUpdate)
            forceUpdate();
    }

    public final void hideAll() {
        renderedElements.forEach((s, renderedElement) -> renderedElement.setVisible(false));
        forceUpdate();
    }

    public final void showAll() {
        renderedElements.forEach((s, renderedElement) -> renderedElement.setVisible(true));
        forceUpdate();
    }

    public final void forceUpdate() {
        if (viewers.isEmpty())
            return;
        doUpdate();
        this.needsUpdate = true;
    }

    protected abstract void doUpdate();

    public final C getComponentRendered() {
        return componentRendered;
    }

    public final Component render() {
        if (needsUpdate) {
            Component component = Component.empty();

            for (HudElement.Rendered<?> element : sorted) {
                if (!element.isVisible())
                    continue;
                // Last Element does not need any spacing
                component = component.append(element.render(this));
            }


            lastRendered = component.style(Style.empty());
            needsUpdate = false;
        }
        return lastRendered;
    }

    public final <H extends HudElement.Rendered<?>> boolean editRenderedElement(String id, Class<? extends H> type, Consumer<H> execution) {
        return edit(id, renderedElements, type, h -> {
            h.setVisible(true);
            execution.accept(h);
        });
    }

    protected final <H> boolean edit(String id, Map<String, ? super H> map, Class<? extends H> type, Consumer<H> execution) {
        var element = map.getOrDefault(id, null);
        if (element != null && type.isAssignableFrom(element.getClass())) {
            execution.accept(type.cast(element));
            forceUpdate();
            return true;
        }
        return false;
    }

    public final <H extends HudElement.Rendered<?>, R> R readOnElementOrDefault(String id, Class<? extends H> type, Function<H, R> execution, R defaultValue) {
        var element = renderedElements.getOrDefault(id, null);
        if (element != null && type.isAssignableFrom(element.getClass())) {
            element.setVisible(true);
            return execution.apply(type.cast(element));
        }
        return defaultValue;
    }

    private void registerElement(String id, HudElement hudElement, HudElement.Rendered<?> renderedElement) {
        if (renderedElements.containsKey(id))
            throw new IllegalArgumentException("Id " + id + " already registered in active hud " + getComponentRendered().key());
        if (hudElementToRenderedElementMapping.containsKey(hudElement))
            throw new IllegalArgumentException("Hud element " + hudElement + " already registered in active hud for " + getComponentRendered().key());
        this.renderedElements.put(id, renderedElement);
        this.hudElementToRenderedElementMapping.put(hudElement, renderedElement);
    }

    public Set<Audience> getViewers() {
        return Set.copyOf(viewers);
    }
}
