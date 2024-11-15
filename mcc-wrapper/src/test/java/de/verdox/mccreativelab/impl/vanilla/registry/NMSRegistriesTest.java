package de.verdox.mccreativelab.impl.vanilla.registry;

import com.google.common.reflect.TypeToken;
import de.verdox.mccreativelab.TestBase;
import de.verdox.mccreativelab.wrapper.block.MCCBlockType;
import de.verdox.mccreativelab.wrapper.item.MCCItemType;
import de.verdox.mccreativelab.wrapper.platform.MCCPlatform;
import de.verdox.mccreativelab.wrapper.registry.MCCReference;
import de.verdox.mccreativelab.wrapper.registry.MCCRegistry;
import de.verdox.mccreativelab.wrapper.registry.MCCTypedKey;
import de.verdox.mccreativelab.wrapper.typed.MCCRegistries;
import net.kyori.adventure.key.Key;
import net.minecraft.core.Holder;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.*;
import java.util.stream.Stream;

public class NMSRegistriesTest extends TestBase {

    public record TestEntry<A, F>(Class<A> apiType, MCCTypedKey<MCCRegistry<A>> mccRegistry,
                                  ResourceKey<Registry<F>> nativeRegistryKey, MCCTypedKey<A> exampleElement) {

        private F getNativeObject() {
            ResourceKey<F> resourceKey = MCCPlatform.getInstance().getConversionService().unwrap(exampleElement, new TypeToken<>() {
            });
            Registry<F> nativeRegistry = getNativeRegistry();
            return nativeRegistry.getOrThrow(resourceKey);
        }

        private Registry<F> getNativeRegistry() {
            Registry<F> mccRegistry = (Registry<F>) BuiltInRegistries.REGISTRY.get(nativeRegistryKey().location());
            Assertions.assertNotNull(mccRegistry);
            return mccRegistry;
        }

        private MCCRegistry<A> getRegistry() {
            return mccRegistry.get();
        }

    }


    private static List<TestEntry<?, ?>> testEntries = new LinkedList<>();

    public static Stream<TestEntry<?, ?>> testInputs() {
        return testEntries.stream();
    }

    @BeforeAll
    public static void setupTestEntries() {
        testEntries.add(new TestEntry<>(MCCBlockType.class, MCCRegistries.BLOCK_REGISTRY, Registries.BLOCK, MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "stone"), Key.key("minecraft", "block"), new TypeToken<>() {
        })));
        testEntries.add(new TestEntry<>(MCCItemType.class, MCCRegistries.ITEM_REGISTRY, Registries.ITEM, MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "carrot"), Key.key("minecraft", "item"), new TypeToken<>() {
        })));
    }

    @ParameterizedTest
    @MethodSource("testInputs")
    public <A, F> void testHandleCorrect(TestEntry<A, F> testEntry) {
        Registry<F> nativeRegistry = testEntry.getNativeRegistry();
        Assertions.assertEquals(nativeRegistry, MCCPlatform.getInstance().getConversionService().unwrap(testEntry.getRegistry()));
    }

    @ParameterizedTest
    @MethodSource("testInputs")
    public <A, F> void testGetKey(TestEntry<A, F> testEntry) {
        ResourceKey<F> resourceKey = MCCPlatform.getInstance().getConversionService().unwrap(testEntry.exampleElement(), new TypeToken<>() {
        });
        Assertions.assertNotNull(resourceKey);

        A value = testEntry.getRegistry().get(testEntry.exampleElement());
        Key actual = testEntry.getRegistry().getKey(value);
        Assertions.assertEquals(testEntry.exampleElement().key(), actual, testEntry.toString());
    }

    @ParameterizedTest
    @MethodSource("testInputs")
    public <A, F> void testGetTypedKey(TestEntry<A, F> testEntry) {
        ResourceKey<F> resourceKey = MCCPlatform.getInstance().getConversionService().unwrap(testEntry.exampleElement(), new TypeToken<>() {
        });
        Assertions.assertNotNull(resourceKey);

        A value = testEntry.getRegistry().get(testEntry.exampleElement());
        MCCTypedKey<A> actual = testEntry.getRegistry().getTypedKey(value).get();
        Assertions.assertEquals(testEntry.exampleElement(), actual, testEntry.toString());
    }

    @ParameterizedTest
    @MethodSource("testInputs")
    public <A, F> void testGetId(TestEntry<A, F> testEntry) {
        ResourceKey<F> resourceKey = MCCPlatform.getInstance().getConversionService().unwrap(testEntry.exampleElement(), new TypeToken<>() {
        });
        Assertions.assertNotNull(resourceKey);

        F nativeValue = testEntry.getNativeObject();
        Registry<F> nativeRegistry = testEntry.getNativeRegistry();

        A value = testEntry.getRegistry().get(testEntry.exampleElement());
        int actual = testEntry.getRegistry().getId(value);
        Assertions.assertEquals(nativeRegistry.getId(nativeValue), actual, testEntry.toString());
    }

    @ParameterizedTest
    @MethodSource("testInputs")
    public <A, F> void testGet1(TestEntry<A, F> testEntry) {
        ResourceKey<F> resourceKey = MCCPlatform.getInstance().getConversionService().unwrap(testEntry.exampleElement(), new TypeToken<>() {
        });
        Assertions.assertNotNull(resourceKey);

        Registry<F> nativeRegistry = testEntry.getNativeRegistry();

        A actual = testEntry.getRegistry().get(testEntry.exampleElement());
        Assertions.assertEquals(nativeRegistry.get(resourceKey), MCCPlatform.getInstance().getConversionService().unwrap(actual), testEntry.toString());
    }

    @ParameterizedTest
    @MethodSource("testInputs")
    public <A, F> void testGet2(TestEntry<A, F> testEntry) {
        ResourceKey<F> resourceKey = MCCPlatform.getInstance().getConversionService().unwrap(testEntry.exampleElement(), new TypeToken<>() {
        });
        Assertions.assertNotNull(resourceKey);

        Registry<F> nativeRegistry = testEntry.getNativeRegistry();

        A actual = testEntry.getRegistry().get(testEntry.exampleElement().key());
        Assertions.assertEquals(nativeRegistry.get(resourceKey.location()), MCCPlatform.getInstance().getConversionService().unwrap(actual), testEntry.toString());
    }

    @ParameterizedTest
    @MethodSource("testInputs")
    public <A, F> void testGetOptional1(TestEntry<A, F> testEntry) {
        ResourceKey<F> resourceKey = MCCPlatform.getInstance().getConversionService().unwrap(testEntry.exampleElement(), new TypeToken<>() {
        });
        Assertions.assertNotNull(resourceKey);

        Registry<F> nativeRegistry = testEntry.getNativeRegistry();

        Optional<A> actual = testEntry.getRegistry().getOptional(testEntry.exampleElement());
        Assertions.assertEquals(nativeRegistry.getOptional(resourceKey), MCCPlatform.getInstance().getConversionService().unwrap(actual), testEntry.toString());
    }

    @ParameterizedTest
    @MethodSource("testInputs")
    public <A, F> void testGetOptional2(TestEntry<A, F> testEntry) {
        ResourceKey<F> resourceKey = MCCPlatform.getInstance().getConversionService().unwrap(testEntry.exampleElement(), new TypeToken<>() {
        });
        Assertions.assertNotNull(resourceKey);

        Registry<F> nativeRegistry = testEntry.getNativeRegistry();

        Optional<A> actual = testEntry.getRegistry().getOptional(testEntry.exampleElement().key());
        Assertions.assertEquals(nativeRegistry.getOptional(resourceKey.location()), MCCPlatform.getInstance().getConversionService().unwrap(actual), testEntry.toString());
    }

    @ParameterizedTest
    @MethodSource("testInputs")
    public <A, F> void testGetOrThrow(TestEntry<A, F> testEntry) {
        ResourceKey<F> resourceKey = MCCPlatform.getInstance().getConversionService().unwrap(testEntry.exampleElement(), new TypeToken<>() {
        });
        Assertions.assertNotNull(resourceKey);

        Registry<F> nativeRegistry = testEntry.getNativeRegistry();

        A actual = testEntry.getRegistry().getOrThrow(testEntry.exampleElement());
        Assertions.assertEquals(nativeRegistry.getOrThrow(resourceKey), MCCPlatform.getInstance().getConversionService().unwrap(actual), testEntry.toString());
    }

    @ParameterizedTest
    @MethodSource("testInputs")
    public <A, F> void testKeySet(TestEntry<A, F> testEntry) {
        ResourceKey<F> resourceKey = MCCPlatform.getInstance().getConversionService().unwrap(testEntry.exampleElement(), new TypeToken<>() {
        });
        Assertions.assertNotNull(resourceKey);

        Registry<F> nativeRegistry = testEntry.getNativeRegistry();

        Set<Key> actual = testEntry.getRegistry().keySet();


        Set<ResourceLocation> unwrappedActual = MCCPlatform.getInstance().getConversionService().unwrap(actual, new TypeToken<>() {
        });

        Set<ResourceLocation> nativeKeySet = nativeRegistry.keySet();

        Assertions.assertEquals(nativeKeySet, unwrappedActual);
    }

    @ParameterizedTest
    @MethodSource("testInputs")
    public <A, F> void testEntrySet(TestEntry<A, F> testEntry) {
        ResourceKey<F> resourceKey = MCCPlatform.getInstance().getConversionService().unwrap(testEntry.exampleElement(), new TypeToken<>() {
        });
        Assertions.assertNotNull(resourceKey);

        Registry<F> nativeRegistry = testEntry.getNativeRegistry();

        Set<Map.Entry<MCCTypedKey<A>, A>> actual = testEntry.getRegistry().entrySet();


        Set<Map.Entry<ResourceKey<F>, F>> unwrappedActual = MCCPlatform.getInstance().getConversionService().unwrap(actual, new TypeToken<>() {
        });

        Set<Map.Entry<ResourceKey<F>, F>> nativeKeySet = nativeRegistry.entrySet();

        Assertions.assertEquals(nativeKeySet, unwrappedActual);
    }

    @ParameterizedTest
    @MethodSource("testInputs")
    public <A, F> void testRegistryKeySet(TestEntry<A, F> testEntry) {
        ResourceKey<F> resourceKey = MCCPlatform.getInstance().getConversionService().unwrap(testEntry.exampleElement(), new TypeToken<>() {
        });
        Assertions.assertNotNull(resourceKey);

        Registry<F> nativeRegistry = testEntry.getNativeRegistry();

        Set<MCCTypedKey<A>> actual = testEntry.getRegistry().registryKeySet();

        Set<ResourceKey<F>> unwrappedActual = MCCPlatform.getInstance().getConversionService().unwrap(actual, new TypeToken<>() {
        });

        Set<ResourceKey<F>> nativeKeySet = nativeRegistry.registryKeySet();

        Assertions.assertEquals(nativeKeySet, unwrappedActual);
    }

    @ParameterizedTest
    @MethodSource("testInputs")
    public <A, F> void testContainsKey1(TestEntry<A, F> testEntry) {
        Assertions.assertTrue(testEntry.getRegistry().containsKey(testEntry.exampleElement().key()));
    }

    @ParameterizedTest
    @MethodSource("testInputs")
    public <A, F> void testContainsKey2(TestEntry<A, F> testEntry) {
        Assertions.assertTrue(testEntry.getRegistry().containsKey(testEntry.exampleElement()));
    }

    @ParameterizedTest
    @MethodSource("testInputs")
    public <A, F> void testGetReference1(TestEntry<A, F> testEntry) {
        ResourceKey<F> resourceKey = MCCPlatform.getInstance().getConversionService().unwrap(testEntry.exampleElement(), new TypeToken<>() {
        });
        Assertions.assertNotNull(resourceKey);

        Registry<F> nativeRegistry = testEntry.getNativeRegistry();

        Optional<MCCReference<A>> actual = testEntry.getRegistry().getReference(testEntry.exampleElement().key());


        Optional<Holder<F>> unwrappedActual = MCCPlatform.getInstance().getConversionService().unwrap(actual, new TypeToken<>() {
        });

        Optional<Holder.Reference<F>> nativeOptionalHolder = nativeRegistry.getHolder(MCCPlatform.getInstance().getConversionService().unwrap(testEntry.exampleElement().key(), new TypeToken<ResourceLocation>(){}));

        Assertions.assertEquals(nativeOptionalHolder, unwrappedActual);
    }

    @ParameterizedTest
    @MethodSource("testInputs")
    public <A, F> void testGetReference2(TestEntry<A, F> testEntry) {
        ResourceKey<F> resourceKey = MCCPlatform.getInstance().getConversionService().unwrap(testEntry.exampleElement(), new TypeToken<>() {
        });
        Assertions.assertNotNull(resourceKey);

        Registry<F> nativeRegistry = testEntry.getNativeRegistry();

        Optional<MCCReference<A>> actual = testEntry.getRegistry().getReference(testEntry.exampleElement());


        Optional<Holder<F>> unwrappedActual = MCCPlatform.getInstance().getConversionService().unwrap(actual, new TypeToken<>() {
        });

        Optional<Holder.Reference<F>> nativeOptionalHolder = nativeRegistry.getHolder(MCCPlatform.getInstance().getConversionService().unwrap(testEntry.exampleElement(), new TypeToken<ResourceKey<F>>(){}));

        Assertions.assertEquals(nativeOptionalHolder, unwrappedActual);
    }
}
