package de.verdox.mccreativelab.util;

import java.util.concurrent.TimeUnit;

public class CropUtil {
    public static float calculatePercentageMalus(int randomTickSpeed, int cropAges, TimeUnit estimatedGrowthDuration, long time) {
        float bestCropChance = 0.33f;
        var wantedTimeInTicks = estimatedGrowthDuration.toSeconds(time) * 20;

        var result = (cropAges * 4096) / bestCropChance * randomTickSpeed * wantedTimeInTicks;
        if (result < 0)
            result = 0;
        if (result > 1)
            result = 1;
        return result;
    }
}
