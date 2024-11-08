package de.verdox.mccreativelab.generator.resourcepack.types.lang;

import de.verdox.vserializer.SerializableField;
import de.verdox.vserializer.generic.Serializer;
import de.verdox.vserializer.generic.SerializerBuilder;
import org.jetbrains.annotations.NotNull;

import java.text.Collator;
import java.util.HashMap;

public record Translation(LanguageInfo languageInfo, String key, String content) implements Comparable<Translation>, GameTranslation {
    public static final Serializer<Translation> SERIALIZER = SerializerBuilder.create("translation", Translation.class)
        .constructor(
            new SerializableField<>("languageInfo", LanguageInfo.SERIALIZER, Translation::languageInfo),
            new SerializableField<>("key", Serializer.Primitive.STRING, Translation::key),
            new SerializableField<>("content", Serializer.Primitive.STRING, Translation::content),
            Translation::new
        )
        .build();

    public static final Serializer<Translation> SERIALIZER_NO_KEY = SerializerBuilder.create("translation", Translation.class)
        .constructor(
            new SerializableField<>("languageInfo", LanguageInfo.SERIALIZER, Translation::languageInfo),
            new SerializableField<>("content", Serializer.Primitive.STRING, Translation::content),
            (languageInfo1, s) -> new Translation(languageInfo1, null, s)
        )
        .build();

    @Override
    public int compareTo(@NotNull Translation o) {
        return Collator.getInstance().compare(o.key, this.key);
    }


}
