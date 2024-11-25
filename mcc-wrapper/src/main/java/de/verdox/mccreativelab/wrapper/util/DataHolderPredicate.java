package de.verdox.mccreativelab.wrapper.util;

import de.verdox.mccreativelab.wrapper.entity.MCCEntity;
import de.verdox.mccreativelab.wrapper.platform.MCCPlatform;
import de.verdox.mccreativelab.wrapper.platform.TempDataHolder;
import de.verdox.mccreativelab.wrapper.world.MCCLocation;

import javax.annotation.Nullable;

public abstract class DataHolderPredicate<A extends TempDataHolder, T> {
    private final String key;

    public DataHolderPredicate(String key) {
        this.key = key;
    }

    public boolean isAllowed(A tempDataHolder) {
        T storedValue = getValue(tempDataHolder);
        T currentValue = getCurrentValue(tempDataHolder);

        return storedValue == null || test(storedValue, currentValue);
    }

    public void reset(A tempDataHolder) {
        tempDataHolder.getTempData().storeData(key, getCurrentValue(tempDataHolder));
    }

    @Nullable
    private T getValue(A tempDataHolder) {
        if (tempDataHolder.getTempData().containsData(key))
            return tempDataHolder.getTempData().getData(key);
        return null;
    }

    protected abstract T getCurrentValue(A entity);

    protected abstract boolean test(T storedValue, T currentValue);

    public static class TickDelay extends DataHolderPredicate<TempDataHolder, Integer> {
        private final int tickDelay;

        public TickDelay(String key, int tickDelay) {
            super(key);
            this.tickDelay = tickDelay;
        }

        @Override
        protected Integer getCurrentValue(TempDataHolder entity) {
            return MCCPlatform.getInstance().getPublicTick();
        }

        @Override
        protected boolean test(Integer storedValue, Integer currentValue) {
            return currentValue - storedValue >= tickDelay;
        }

        @Override
        public void reset(TempDataHolder entity) {
            super.reset(entity);
        }
    }

    public static class DistanceTravelled extends DataHolderPredicate<MCCEntity, MCCLocation> {
        private final double minDistance;

        public DistanceTravelled(String key, double minDistance) {
            super(key);
            this.minDistance = minDistance;
        }

        @Override
        protected MCCLocation getCurrentValue(MCCEntity entity) {
            return entity.getLocation();
        }

        @Override
        protected boolean test(MCCLocation storedValue, MCCLocation currentValue) {
            if(!storedValue.world().equals(currentValue.world())) {
                return true;
            }
            return storedValue.distanceSquared(currentValue) >= minDistance;
        }
    }
}
