package de.verdox.mccreativelab.generator.resourcepack.types.lang;

import de.verdox.vserializer.SerializableField;
import de.verdox.vserializer.generic.Serializer;
import de.verdox.vserializer.generic.SerializerBuilder;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Translatable implements GameTranslation{
    public static final Serializer<Translatable> TRANSLATABLE_NO_KEY = SerializerBuilder.create("translatable", Translatable.class)
        .constructor(
            new SerializableField<>("translations", Serializer.Collection.create(Translation.SERIALIZER_NO_KEY, HashSet::new), Translatable::getTranslations),
                Translatable::new
        )
        .build();

    private final Map<LanguageInfo, Translation> cache = new HashMap<>();
    private String key;

    public Translatable(LanguageInfo languageInfo, String key, String content){
        this.key = key;
        withAdditionalTranslation(languageInfo, content);
    }

    private Translatable(Set<Translation> translations){
        translations.forEach(translation -> this.cache.put(translation.languageInfo(), translation));
    }

    public String getTranslation(LanguageInfo languageInfo){
        if(!cache.containsKey(languageInfo))
            return "";
        return cache.get(languageInfo).content();
    }

    public void changeTranslationKey(String key) {
        this.key = key;
        Map<LanguageInfo, Translation> copy = Map.copyOf(cache);
        this.cache.clear();
        copy.forEach((languageInfo, translation) -> {
            this.cache.put(languageInfo, new Translation(translation.languageInfo(), key, translation.content()));
        });
    }

    public Translatable(String key){
        this.key = key;
    }

    public Map<LanguageInfo, Translation> getCache() {
        return Map.copyOf(cache);
    }

    public Translatable withAdditionalTranslation(LanguageInfo languageInfo, String content){
        this.cache.put(languageInfo, new Translation(languageInfo, key, content));
        return this;
    }

    public Set<Translation> getTranslations(){
        return Set.copyOf(cache.values());
    }

    @Override
    public String key(){
        return this.key;
    }

    public static class Builder {
        private final Map<LanguageInfo, String> cache = new HashMap<>();

        public Builder withAdditionalTranslation(LanguageInfo languageInfo, String content){
            this.cache.put(languageInfo, content);
            return this;
        }

        public Translatable build(String key){
            Translatable translatable =  new Translatable(key);
            this.cache.forEach(translatable::withAdditionalTranslation);
            return translatable;
        }
    }
}
