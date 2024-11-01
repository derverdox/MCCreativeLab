package de.verdox.mccreativelab.generator.resourcepack.types.hud;

import de.verdox.mccreativelab.generator.resourcepack.types.hud.renderer.HudRenderer;
import de.verdox.mccreativelab.generator.resourcepack.types.rendered.ActiveComponentRendered;
import de.verdox.mccreativelab.platform.GeneratorPlatformHelper;
import net.kyori.adventure.audience.Audience;

public class ActiveHud extends ActiveComponentRendered<ActiveHud, CustomHud> {
    public ActiveHud(Audience player, CustomHud customHud){
        super(customHud);
        viewers.add(player);
    }

    @Override
    protected void doUpdate() {
        HudRenderer hudRenderer = GeneratorPlatformHelper.INSTANCE.get().getHudRenderer();
        for (Audience viewer : getViewers()) {
            if (hudRenderer.getActiveHud(viewer, getComponentRendered()) != null)
                hudRenderer.forceUpdate(viewer);
        }
    }
}
