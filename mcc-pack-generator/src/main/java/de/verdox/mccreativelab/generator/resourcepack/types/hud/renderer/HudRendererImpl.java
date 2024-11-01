package de.verdox.mccreativelab.generator.resourcepack.types.hud.renderer;

import de.verdox.mccreativelab.generator.resourcepack.types.hud.ActiveHud;
import de.verdox.mccreativelab.generator.resourcepack.types.hud.CustomHud;
import net.kyori.adventure.audience.Audience;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.logging.Level;

public class HudRendererImpl extends Thread implements HudRenderer {
    private final Map<Audience, PlayerHudRendererData> renderingDataCache = new ConcurrentHashMap<>();
    private final LinkedBlockingQueue<TickData> ticksToProcess = new LinkedBlockingQueue<>();
    private boolean isRunning = true;

    public HudRendererImpl() {
        super(null, null, "HudRendererThread");
    }

    public void printLastRender(Audience player){
        if(renderingDataCache.containsKey(player))
            LOGGER.info(renderingDataCache.get(player).getLastRendered().compact().toString());
    }

    @Override
    public ActiveHud getActiveHud(Audience player, CustomHud customHud) {
        PlayerHudRendererData playerHudRendererData = getRendererData(player);
        return playerHudRendererData.getActiveHud(customHud);
    }

    @Override
    public ActiveHud getOrStartActiveHud(Audience player, CustomHud customHud) {
        PlayerHudRendererData playerHudRendererData = getRendererData(player);
        return playerHudRendererData.getOrStartActiveHud(customHud);
    }

    public boolean stopActiveHud(Audience player, CustomHud customHud) {
        return getRendererData(player).removeFromRendering(customHud);
    }

    @Override
    public void forceUpdate(Audience player) {
        getRendererData(player).forceUpdate();
    }

    public void addTickToRenderQueue(Collection<? extends Audience> serverPlayers) {
        ticksToProcess.offer(new TickData(Set.copyOf(serverPlayers)));
    }

    private PlayerHudRendererData getRendererData(Audience player) {
        return renderingDataCache.computeIfAbsent(player, player1 -> new PlayerHudRendererData(player));
    }

    @Override
    public void interrupt() {
        isRunning = false;
        super.interrupt();
    }

    @Override
    public void run() {
        while(isRunning){

            try {
                var list = ticksToProcess.take().serverPlayers;
                for (Audience player : list) {
                    getRendererData(player).sendUpdate();
                }
                for (Audience player : renderingDataCache.keySet()) {
                    if(!list.contains(player))
                        renderingDataCache.remove(player);
                }
            } catch (Throwable e) {
                LOGGER.log(Level.SEVERE, "An error occured in the HudRenderer", e);
            }
        }
    }

    public record TickData(Set<Audience> serverPlayers) {

    }
}
