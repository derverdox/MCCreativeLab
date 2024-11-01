package de.verdox.mccreativelab.generator.resourcepack.types.rendered;

import de.verdox.mccreativelab.generator.resourcepack.types.rendered.element.HudElement;
import net.kyori.adventure.audience.Audience;

import java.util.function.BiConsumer;

public interface RenderedElementBehavior<V extends ActiveComponentRendered<V,?>, T extends HudElement.Rendered<?>> {
    default void onOpen(V parentElement, T element, Audience audience){}
    default void whileOpen(V parentElement, T element, Audience audience){}

    static <V extends ActiveComponentRendered<V,?>, T extends HudElement.Rendered<?>> RenderedElementBehavior<V, T> createWhileOpen(BiConsumer<V, T> function){
        return new RenderedElementBehavior<>() {
            @Override
            public void whileOpen(V parentElement, T element, Audience audience) {
                function.accept(parentElement, element);
            }
        };
    }

    static <V extends ActiveComponentRendered<V,?>, T extends HudElement.Rendered<?>> RenderedElementBehavior<V, T> createOnOpen(BiConsumer<V, T> function){
        return new RenderedElementBehavior<>() {
            @Override
            public void onOpen(V parentElement, T element, Audience audience) {
                function.accept(parentElement, element);
            }
        };
    }
}
