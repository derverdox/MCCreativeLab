package de.verdox.mccreativelab.generator.resourcepack.types.hud.renderer;

import de.verdox.mccreativelab.generator.resourcepack.types.hud.ActiveHud;
import de.verdox.mccreativelab.generator.resourcepack.types.hud.CustomHud;
import net.kyori.adventure.audience.Audience;
import java.util.logging.Logger;

public interface HudRenderer {
    Logger LOGGER = Logger.getLogger(HudRenderer.class.getName());
    ActiveHud getActiveHud(Audience player, CustomHud customHud);
    ActiveHud getOrStartActiveHud(Audience player, CustomHud customHud);
    boolean stopActiveHud(Audience player, CustomHud customHud);
    void forceUpdate(Audience player);
}
