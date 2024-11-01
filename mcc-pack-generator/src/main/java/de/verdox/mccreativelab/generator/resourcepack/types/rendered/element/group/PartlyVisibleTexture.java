package de.verdox.mccreativelab.generator.resourcepack.types.rendered.element.group;

import de.verdox.mccreativelab.generator.resourcepack.types.rendered.util.ScreenPosition;
import de.verdox.mccreativelab.generator.resourcepack.types.rendered.ActiveComponentRendered;
import de.verdox.mccreativelab.generator.resourcepack.types.rendered.element.HudElementGroup;
import de.verdox.mccreativelab.generator.resourcepack.types.rendered.element.single.SingleHudTexture;
import net.kyori.adventure.text.Component;

import java.util.List;
import java.util.logging.Logger;
import java.util.stream.Collectors;

public record PartlyVisibleTexture(List<SingleHudTexture> hudTextures) implements HudElementGroup<SingleHudTexture> {
    public static final Logger LOGGER = Logger.getLogger(PartlyVisibleTexture.class.getName());
    @Override
    public ScreenPosition screenPosition() {
        return hudTextures.get(0).screenPosition();
    }

    @Override
    public RenderedGroup<SingleHudTexture, ? extends HudElementGroup<SingleHudTexture>, ?> toRenderedElement() {
        return new RenderedPartlyVisibleTexture(this, hudTextures.stream().map(SingleHudTexture::toRenderedElement)
            .map(renderedSingle -> ((SingleHudTexture.RenderedSingleHudTexture) renderedSingle))
            .collect(Collectors.toList()));
    }

    public static class RenderedPartlyVisibleTexture extends RenderedGroup<SingleHudTexture, PartlyVisibleTexture, SingleHudTexture.RenderedSingleHudTexture> {
        private int currentShown = -1;
        private SingleHudTexture.RenderedSingleHudTexture currentShownTexture = null;

        public RenderedPartlyVisibleTexture(PartlyVisibleTexture hudElementGroup, List<SingleHudTexture.RenderedSingleHudTexture> groupedRenderedElements) {
            super(hudElementGroup, groupedRenderedElements);
        }

        public void show(int partToShow) {
            if (partToShow < 0 || partToShow > getGroupedRenderedElements().size()) {
                LOGGER.warning("Trying to show the texture part " + partToShow + " that does not exist! Available range from " + 0 + " to " + (getGroupedRenderedElements().size() - 1));
                return;
            }

            this.setVisible(true);

            var part = getGroupedRenderedElements().get(partToShow);

            if (currentShown != -1 && currentShown != partToShow)
                getGroupedRenderedElements().get(currentShown).setVisible(false);

            part.setVisible(true);
            currentShown = partToShow;
            currentShownTexture = part;
        }

        @Override
        protected Component doRendering(ActiveComponentRendered<?, ?> activeComponentRendered) {
            if (currentShownTexture == null)
                return Component.empty();
            return currentShownTexture.render(activeComponentRendered);
        }
    }
}
