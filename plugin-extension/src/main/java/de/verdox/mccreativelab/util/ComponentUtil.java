package de.verdox.mccreativelab.util;

import de.verdox.mccreativelab.MCCreativeLabExtension;
import de.verdox.mccreativelab.generator.resourcepack.types.lang.LanguageInfo;
import de.verdox.mccreativelab.generator.resourcepack.types.lang.Translatable;
import net.kyori.adventure.text.Component;

import java.util.concurrent.TimeUnit;

public class ComponentUtil {
    public static final Translatable SECONDS = new Translatable("time.unit.seconds.name")
        .withAdditionalTranslation(LanguageInfo.GERMAN, "Sekunden")
        .withAdditionalTranslation(LanguageInfo.ENGLISH_US, "Seconds");
    public static final Translatable SECONDS_SHORT = new Translatable("time.unit.seconds.short")
        .withAdditionalTranslation(LanguageInfo.GERMAN, "s")
        .withAdditionalTranslation(LanguageInfo.ENGLISH_US, "s");
    public static final Translatable MINUTES = new Translatable("time.unit.minutes.name")
        .withAdditionalTranslation(LanguageInfo.GERMAN, "Minuten")
        .withAdditionalTranslation(LanguageInfo.ENGLISH_US, "Minutes");
    public static final Translatable MINUTES_SHORT = new Translatable("time.unit.minutes.short")
        .withAdditionalTranslation(LanguageInfo.GERMAN, "m")
        .withAdditionalTranslation(LanguageInfo.ENGLISH_US, "m");
    public static final Translatable HOURS = new Translatable("time.unit.hours.name")
        .withAdditionalTranslation(LanguageInfo.GERMAN, "Stunden")
        .withAdditionalTranslation(LanguageInfo.ENGLISH_US, "Hours");
    public static final Translatable HOURS_SHORT = new Translatable("time.unit.hours.short")
        .withAdditionalTranslation(LanguageInfo.GERMAN, "h")
        .withAdditionalTranslation(LanguageInfo.ENGLISH_US, "h");
    public static final Translatable DAYS = new Translatable("time.unit.days.name")
        .withAdditionalTranslation(LanguageInfo.GERMAN, "Tage")
        .withAdditionalTranslation(LanguageInfo.ENGLISH_US, "Days");
    public static final Translatable DAYS_SHORT = new Translatable("time.unit.days.short")
        .withAdditionalTranslation(LanguageInfo.GERMAN, "t")
        .withAdditionalTranslation(LanguageInfo.ENGLISH_US, "d");

    public static Component formatTime(long time, TimeUnit timeUnit) {
        long seconds = timeUnit.toSeconds(time);

        if (seconds < 60) {
            return Component
                .text(seconds)
                .append(SECONDS_SHORT.asTranslatableComponent());
        }

        long minutes = TimeUnit.SECONDS.toMinutes(seconds);
        if (minutes < 60) {
            long remainingSeconds = seconds % 60;
            return Component
                .text(minutes)
                .append(Component.text(":"))
                .append(Component.text(String.format("%02d", remainingSeconds)))
                .append(MINUTES_SHORT.asTranslatableComponent());
        }

        long hours = TimeUnit.SECONDS.toHours(seconds);
        if (hours < 24) {
            long remainingMinutes = (seconds % 3600) / 60;
            long remainingSeconds = seconds % 60;
            return Component
                .text(hours)
                .append(Component.text(":"))
                .append(Component.text(String.format("%02d", remainingMinutes)))
                .append(Component.text(":"))
                .append(Component.text(String.format("%02d", remainingSeconds)))
                .append(HOURS_SHORT.asTranslatableComponent());
        }

        long days = TimeUnit.SECONDS.toDays(seconds);
        long remainingHours = (seconds % 86400) / 3600;
        long remainingMinutes = (seconds % 3600) / 60;
        long remainingSeconds = seconds % 60;

        return Component
            .text(days)
            .append(Component.text(":"))
            .append(Component.text(String.format("%02d", remainingHours)))
            .append(Component.text(":"))
            .append(Component.text(String.format("%02d", remainingMinutes)))
            .append(HOURS_SHORT.asTranslatableComponent())
            .append(Component.text(":"))
            .append(Component.text(String.format("%02d", remainingSeconds)))
            .append(HOURS_SHORT.asTranslatableComponent());
    }

    public static void install() {
        MCCreativeLabExtension.getCustomResourcePack().getLanguageStorage().addTranslation(SECONDS);
        MCCreativeLabExtension.getCustomResourcePack().getLanguageStorage().addTranslation(SECONDS_SHORT);
        MCCreativeLabExtension.getCustomResourcePack().getLanguageStorage().addTranslation(MINUTES);
        MCCreativeLabExtension.getCustomResourcePack().getLanguageStorage().addTranslation(MINUTES_SHORT);
        MCCreativeLabExtension.getCustomResourcePack().getLanguageStorage().addTranslation(HOURS);
        MCCreativeLabExtension.getCustomResourcePack().getLanguageStorage().addTranslation(HOURS_SHORT);
        MCCreativeLabExtension.getCustomResourcePack().getLanguageStorage().addTranslation(DAYS);
        MCCreativeLabExtension.getCustomResourcePack().getLanguageStorage().addTranslation(DAYS_SHORT);
    }
}
