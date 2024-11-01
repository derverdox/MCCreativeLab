package de.verdox.mccreativelab.generator.resourcepack.types.lang;

import de.verdox.mccreativelab.generator.resourcepack.CustomResourcePack;
import de.verdox.mccreativelab.platform.GeneratorPlatformHelper;
import de.verdox.mccreativelab.util.io.StringAlign;
import net.kyori.adventure.audience.Audience;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.TextComponent;
import net.kyori.adventure.text.TranslatableComponent;
import net.kyori.adventure.text.format.TextColor;
import net.kyori.adventure.text.format.TextDecoration;
import org.jetbrains.annotations.NotNull;

import java.util.LinkedList;
import java.util.List;
import java.util.UUID;
import java.util.function.Function;

public interface GameTranslation {
    String key();

    default String translate(Audience player) {
        GeneratorPlatformHelper platformHelper = GeneratorPlatformHelper.INSTANCE.get();
        UUID uuid = platformHelper.getUUIDOfAudienceOrThrow(player);
        CustomResourcePack customResourcePack = platformHelper.getLoadedResourcePack(uuid);
        if(customResourcePack == null)
            return key();
        return customResourcePack.getLanguageStorage().translate(key(), player);
    }

    default TextComponent translateToComponent(Audience player) {
        GeneratorPlatformHelper platformHelper = GeneratorPlatformHelper.INSTANCE.get();
        UUID uuid = platformHelper.getUUIDOfAudienceOrThrow(player);
        CustomResourcePack customResourcePack = platformHelper.getLoadedResourcePack(uuid);
        if(customResourcePack == null)
            return Component.text(key());
        return customResourcePack.getLanguageStorage().translateToComponent(key(), player);
    }

    default TranslatableComponent asTranslatableComponent() {
        return Component.translatable(key());
    }

    static List<Translatable> createTranslatableLines(String key, String content, int amountLines) {
        return createTranslatableLines(LanguageInfo.ENGLISH_US, key, content, amountLines);
    }

    static List<Translatable> createTranslatableLines(String key, String content) {
        return createTranslatableLines(LanguageInfo.ENGLISH_US, key, content, 20);
    }

    static List<Translatable> createTranslatableLines(LanguageInfo languageInfo, String key, String content, int amountLines) {
        List<Translatable> list = new LinkedList<>();
        List<TextComponent> loreLines = createLore(content, amountLines, textComponent -> textComponent);
        int counter = 0;
        for (TextComponent loreLine : loreLines) {
            list.add(new Translatable(languageInfo, key + ".lines." + counter, loreLine.content()));
            counter++;
        }
        return list;
    }

    static List<TranslatableComponent> toComponent(List<Translatable> list) {
        return list.stream().map(Translatable::asTranslatableComponent)
            .map(translatableComponent -> translatableComponent.decoration(TextDecoration.ITALIC, false))
            .map(translatableComponent -> translatableComponent.color(TextColor.color(255, 255, 255)))
            .toList();
    }

    static List<TextComponent> createLore(@NotNull String text, int linesPerRow, @NotNull Function<TextComponent, TextComponent> afterConversion) {
        List<String> formatted = StringAlign.formatStringToLines(text, linesPerRow, StringAlign.Alignment.LEFT);
        return formatted
            .stream()
            .map(Component::text)
            .map(textComponent -> textComponent.decoration(TextDecoration.ITALIC, false))
            .map(afterConversion)
            .toList();
    }
}
