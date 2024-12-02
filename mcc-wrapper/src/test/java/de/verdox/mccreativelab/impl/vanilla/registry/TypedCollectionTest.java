package de.verdox.mccreativelab.impl.vanilla.registry;

import com.google.common.reflect.Reflection;
import de.verdox.mccreativelab.TestBase;
import de.verdox.mccreativelab.wrapper.block.MCCBlock;
import de.verdox.mccreativelab.wrapper.entity.MCCAttribute;
import de.verdox.mccreativelab.wrapper.registry.MCCReference;
import de.verdox.mccreativelab.wrapper.registry.MCCTag;
import de.verdox.mccreativelab.wrapper.registry.MCCTypedKey;
import de.verdox.mccreativelab.wrapper.typed.*;
import net.minecraft.world.level.block.Blocks;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.platform.commons.util.ReflectionUtils;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Stream;

public class TypedCollectionTest extends TestBase {
    private static final List<MCCReference<?>> collectedReferences = new LinkedList<>();
    private static final List<MCCTag<?>> collectedTags = new LinkedList<>();
    private static final List<MCCTypedKey<?>> collectedTypedKeys = new LinkedList<>();

    @BeforeAll
    public static void setup() {
        for (Class<?> aClass : ReflectionUtils.findAllClassesInPackage(MCCBlocks.class.getPackageName(), aClass -> !aClass.isSynthetic() && !aClass.isAnonymousClass(), s -> true)) {
            addAllFields(aClass);
        }
    }

    private static void addAllFields(Class<?> typedClass) {
        for (Field declaredField : typedClass.getDeclaredFields()) {
            if (!Modifier.isStatic(declaredField.getModifiers())) {
                continue;
            }
            if (!Modifier.isFinal(declaredField.getModifiers())) {
                continue;
            }
            try {
                Object object = declaredField.get(null);
                if (object instanceof MCCReference<?> reference) {
                    collectedReferences.add(reference);
                } else if (object instanceof MCCTag<?> tag) {
                    collectedTags.add(tag);
                } else if (object instanceof MCCTypedKey<?> typedKey) {
                    collectedTypedKeys.add(typedKey);
                }
            } catch (IllegalAccessException e) {

            }
        }
    }

    static Stream<MCCReference<?>> provideReferences() {
        return collectedReferences.stream();
    }

    static Stream<MCCTag<?>> provideTags() {
        return collectedTags.stream();
    }

    static Stream<MCCTypedKey<?>> provideTypedKeys() {
        return collectedTypedKeys.stream();
    }

    @ParameterizedTest
    @MethodSource("provideReferences")
    void testGetCorrect(MCCReference<?> reference) {
        MCCTypedKey<?> typedKey = reference.unwrapKey().get();


    }

    @ParameterizedTest
    @MethodSource("provideReferences")
    void testReferenceGetObjectNoThrows(MCCReference<?> reference) {
        Assertions.assertDoesNotThrow(reference::get);
    }

    @ParameterizedTest
    @MethodSource("provideReferences")
    void testReferenceGetUnwrapKeyNoThrows(MCCReference<?> reference) {
        Assertions.assertDoesNotThrow(() -> reference.unwrapKey().get());
    }

    @ParameterizedTest
    @MethodSource("provideTags")
    void testTagsGetRegistryKeysNoThrows(MCCTag<?> reference) {
        Assertions.assertDoesNotThrow(() -> reference.getRegistryKey().get());
    }

    @ParameterizedTest
    @MethodSource("provideTags")
    void testTagsGetRegistryNoThrows(MCCTag<?> reference) {
        Assertions.assertDoesNotThrow(reference::getRegistry);
    }

    @ParameterizedTest
    @MethodSource("provideTags")
    void testTagsGetValuesNoThrows(MCCTag<?> reference) {
        Assertions.assertDoesNotThrow(reference::getValues);
    }

    @ParameterizedTest
    @MethodSource("provideTypedKeys")
    void testKeyGetNoThrows(MCCTypedKey<?> reference) {
        Assertions.assertDoesNotThrow(reference::get);
    }

    @ParameterizedTest
    @MethodSource("provideTypedKeys")
    void testKeyGetRegistryKeyNoThrows(MCCTypedKey<?> reference) {
        Assertions.assertDoesNotThrow(reference::getRegistryKey);
    }

    @ParameterizedTest
    @MethodSource("provideTypedKeys")
    void testKeyGetAsReferenceNoThrows(MCCTypedKey<?> reference) {
        Assertions.assertDoesNotThrow(reference::getAsReference);
    }
}
