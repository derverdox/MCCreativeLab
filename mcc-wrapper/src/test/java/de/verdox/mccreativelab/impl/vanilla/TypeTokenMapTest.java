package de.verdox.mccreativelab.impl.vanilla;

import com.google.common.reflect.TypeToken;
import de.verdox.mccreativelab.wrapper.map.TypeTokenMap;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Optional;

public class TypeTokenMapTest {

    private TypeTokenMap<String> typeTokenMap;

    // Beispielklassen zur Verwendung in TypeTokens
    static class KlasseA<T> {}
    static class KlasseB {}

    @BeforeEach
    public void setUp() {
        typeTokenMap = new TypeTokenMap<>();
    }

    @Test
    public void testPutAndExactGet() {
        typeTokenMap.put(new TypeToken<KlasseA<KlasseB>>() {}, "SpecificValue");

        Optional<String> result = typeTokenMap.get(new TypeToken<KlasseA<KlasseB>>() {});
        Assertions.assertTrue(result.isPresent(), "Result should be present for exact match");
        Assertions.assertEquals("SpecificValue", result.get(), "Expected exact value to be returned");
    }

    @Test
    public void testPutAndGeneralGet() {
        typeTokenMap.put(new TypeToken<KlasseA<?>>() {}, "GeneralValue");

        Optional<String> result = typeTokenMap.get(new TypeToken<KlasseA<KlasseB>>() {});
        Assertions.assertTrue(result.isPresent(), "Result should be present for general match");
        Assertions.assertEquals("GeneralValue", result.get(), "Expected general value to be returned");
    }

    @Test
    public void testSpecificityMatching() {
        typeTokenMap.put(new TypeToken<KlasseA<?>>() {}, "GeneralValue");
        typeTokenMap.put(new TypeToken<KlasseA<KlasseB>>() {}, "SpecificValue");

        // Test mit einem spezifischeren Typ
        Optional<String> result = typeTokenMap.get(new TypeToken<KlasseA<KlasseB>>() {});
        Assertions.assertTrue(result.isPresent(), "Result should be present for specific match");
        Assertions.assertEquals("SpecificValue", result.get(), "Expected specific value to be returned");

        // Test mit einem allgemeineren Typ
        result = typeTokenMap.get(new TypeToken<KlasseA<?>>() {});
        Assertions.assertTrue(result.isPresent(), "Result should be present for general match");
        Assertions.assertEquals("GeneralValue", result.get(), "Expected general value to be returned");
    }

    @Test
    public void testNoMatchingType() {
        typeTokenMap.put(new TypeToken<KlasseA<KlasseB>>() {}, "SpecificValue");

        Optional<String> result = typeTokenMap.get(new TypeToken<KlasseA<Integer>>() {});
        Assertions.assertFalse(result.isPresent(), "Result should not be present if no matching type exists");
    }

    @Test
    public void testCachingBehavior() {
        typeTokenMap.put(new TypeToken<KlasseA<?>>() {}, "GeneralValue");
        typeTokenMap.put(new TypeToken<KlasseA<KlasseB>>() {}, "SpecificValue");

        // Abruf und Überprüfung auf Caching-Effekte (Erwartung: spezifischer Eintrag wird zwischengespeichert)
        Optional<String> firstCall = typeTokenMap.get(new TypeToken<KlasseA<KlasseB>>() {});
        Optional<String> secondCall = typeTokenMap.get(new TypeToken<KlasseA<KlasseB>>() {});

        Assertions.assertEquals(firstCall, secondCall, "Cached result should match repeated retrievals");
        Assertions.assertTrue(firstCall.isPresent(), "First call result should be present");
        Assertions.assertEquals("SpecificValue", firstCall.get(), "Expected specific value in cache");
    }

    @Test
    public void testContainsExactMatch() {
        typeTokenMap.put(new TypeToken<KlasseA<KlasseB>>() {}, "SpecificValue");

        boolean result = typeTokenMap.contains(new TypeToken<KlasseA<KlasseB>>() {});
        Assertions.assertTrue(result, "Expected TypeTokenMap to contain an exact match");
    }

    @Test
    public void testContainsGeneralMatch() {
        typeTokenMap.put(new TypeToken<KlasseA<?>>() {}, "GeneralValue");

        boolean result = typeTokenMap.contains(new TypeToken<KlasseA<KlasseB>>() {});
        Assertions.assertTrue(result, "Expected TypeTokenMap to contain a general match for subclass TypeToken");
    }

    @Test
    public void testContainsWildcardType() {
        typeTokenMap.put(new TypeToken<KlasseA<?>>() {}, "GeneralValue");

        boolean result = typeTokenMap.contains(new TypeToken<KlasseA<?>>() {});
        Assertions.assertTrue(result, "Expected TypeTokenMap to contain the wildcard TypeToken");
    }

    @Test
    public void testContainsEmptyMap() {
        boolean result = typeTokenMap.contains(new TypeToken<KlasseA<KlasseB>>() {});
        Assertions.assertFalse(result, "Expected TypeTokenMap to be empty and contain no TypeTokens");
    }
}
