package de.verdox.mccreativelab.conversion;

import de.verdox.mccreativelab.TestBase;
import de.verdox.mccreativelab.conversion.converter.MCCConverter;
import de.verdox.mccreativelab.impl.vanilla.block.NMSBlockType;
import de.verdox.mccreativelab.impl.vanilla.item.NMSItemStack;
import de.verdox.mccreativelab.impl.vanilla.platform.NMSPlatform;
import de.verdox.mccreativelab.wrapper.block.MCCBlockType;
import de.verdox.mccreativelab.wrapper.item.MCCItemStack;
import de.verdox.mccreativelab.wrapper.platform.MCCPlatform;
import net.minecraft.SharedConstants;
import net.minecraft.core.Holder;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.server.Bootstrap;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.StonecutterBlock;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.*;
import java.util.stream.Stream;

public class ConverterTests extends TestBase {

    private record TestEntry<A, T extends A, F>(Class<A> apiType, MCCConverter<F, T> converter, T implObject,
                                                F nativeObject, boolean shouldRegister) {
        private void register() {
            if (shouldRegister) {
                MCCPlatform.getInstance().getConversionService().registerCustomPlatformType(apiType(), converter());
            }
        }

        @Override
        public String toString() {
            return "TestEntry{" +
                "apiType=" + apiType.getSimpleName() +
                ", implType=" + converter.apiImplementationClass().getSimpleName() +
                ", nativeType=" + converter.nativeMinecraftType().getSimpleName() +
                ", implObject=" + implObject +
                ", nativeObject=" + nativeObject +
                '}';
        }
    }

    private static List<TestEntry<?, ?, ?>> testEntries = new LinkedList<>();

    static Stream<TestEntry<?, ?, ?>> testInputs() {
        return testEntries.stream();
    }

    //TODO We also need tests for cases when we want to wrap classes that extend a registered native type.

    @BeforeAll
    public static void setupTestEntries() {
        testEntries.add(new TestEntry<>(MCCBlockType.class, TestBlockTypeImpl.CONVERTER, new TestBlockTypeImpl((StonecutterBlock) Blocks.STONECUTTER), (StonecutterBlock) Blocks.STONECUTTER, true));
        ItemStack stone = new ItemStack(Items.STONE);
        testEntries.add(new TestEntry<>(MCCItemStack.class, OnlyStoneItemStack.CONVERTER, new OnlyStoneItemStack(stone), stone, true));
        ItemStack log = new ItemStack(Items.ACACIA_LOG);
        testEntries.add(new TestEntry<>(MCCItemStack.class, OnlyLogItemStack.CONVERTER, new OnlyLogItemStack(log), log, true));
        StairBlock stairBlock = (StairBlock) Blocks.STONE_STAIRS;
        testEntries.add(new TestEntry<>(MCCBlockType.class, NMSBlockType.CONVERTER, new NMSBlockType(stairBlock), stairBlock, false));
        ResourceKey<Block> blockResourceKey = BuiltInRegistries.BLOCK.getResourceKey(Blocks.KELP).get();
        //testEntries.add(new TestEntry<>(MCCTypedKey.class, new ResourceKeyConverter(), new NMSTypedKey<>(blockResourceKey), blockResourceKey, false));
        Holder.Reference<Block> blockReference = BuiltInRegistries.BLOCK.getHolder(blockResourceKey).get();
        //testEntries.add(new TestEntry<>(MCCTypedKey.class, new HolderConverter(), new NMSTypedKey<>(blockResourceKey), blockReference, false));


        for (TestEntry<?, ?, ?> testEntry : testEntries) {
            testEntry.register();
        }
    }

    @Test
    void testFindNativeClassForPlatformType() {
        Set<Class<?>> implTypes = new HashSet<>();
        implTypes.add(NMSItemStack.class);
        testEntries.stream().filter(testEntry -> testEntry.apiType().equals(MCCItemStack.class)).map(testEntry -> testEntry.converter.apiImplementationClass()).forEach(implTypes::add);

        Set<Class<?>> foundImplTypes = MCCPlatform.getInstance().getConversionService().findAllPlatformTypesForApiType(MCCItemStack.class);
        Assertions.assertEquals(implTypes, foundImplTypes);
    }

    @ParameterizedTest
    @MethodSource("testInputs")
    void testFindAPIClassForImplClass(TestEntry<?, ?, ?> testEntry) {
        Class<?> apiClassForImpl = MCCPlatform.getInstance().getConversionService().findAPIClassForImplClass(testEntry.converter().apiImplementationClass());
        Assertions.assertEquals(testEntry.apiType(), apiClassForImpl, "Entry: " + testEntry);
    }

    @ParameterizedTest
    @MethodSource("testInputs")
    void testFindAPITypeForNativeClass(TestEntry<?, ?, ?> testEntry) {
        Class<?> apiClassForImpl = MCCPlatform.getInstance().getConversionService().findAPITypeForNativeClass(testEntry.converter().nativeMinecraftType());
        Assertions.assertEquals(testEntry.apiType(), apiClassForImpl, "Entry: " + testEntry);
    }

    @ParameterizedTest
    @MethodSource("testInputs")
    void findNativeClassForPlatformType(TestEntry<?, ?, ?> testEntry) {
        Class<?> nativeClassForAPIType = MCCPlatform.getInstance().getConversionService().findNativeClassForPlatformType(testEntry.converter().apiImplementationClass());
        Assertions.assertEquals(testEntry.converter().nativeMinecraftType(), nativeClassForAPIType, "Entry: " + testEntry);
    }

    @ParameterizedTest
    @MethodSource("testInputs")
    void testSimpleWrap(TestEntry<?, ?, ?> testEntry) {
        var wrapped = MCCPlatform.getInstance().getConversionService().wrap(testEntry.nativeObject(), testEntry.apiType());
        Assertions.assertEquals(testEntry.implObject(), wrapped, "Entry: " + testEntry);
    }

    @ParameterizedTest
    @MethodSource("testInputs")
    void testWrapWithoutProvidingTheApiType(TestEntry<?, ?, ?> testEntry) {
        var wrapped = MCCPlatform.getInstance().getConversionService().wrap(testEntry.nativeObject());
        Assertions.assertEquals(testEntry.implObject(), wrapped, "Entry: " + testEntry);
    }

    @ParameterizedTest
    @MethodSource("testInputs")
    void testSimpleUnWrap(TestEntry<?, ?, ?> testEntry) {
        var unwrapped = MCCPlatform.getInstance().getConversionService().unwrap(testEntry.implObject(), testEntry.converter().nativeMinecraftType());
        Assertions.assertEquals(testEntry.nativeObject(), unwrapped, "Entry: " + testEntry);
    }

    @ParameterizedTest
    @MethodSource("testInputs")
    void testSimpleUnWrapWithoutProvidingTheNativeType(TestEntry<?, ?, ?> testEntry) {
        var unwrapped = MCCPlatform.getInstance().getConversionService().unwrap(testEntry.implObject());
        Assertions.assertEquals(testEntry.nativeObject(), unwrapped, "Entry: " + testEntry);
    }

    @ParameterizedTest
    @MethodSource("testInputs")
    void testWrapOptional(TestEntry<?, ?, ?> testEntry) {
        var wrapped = MCCPlatform.getInstance().getConversionService().wrap(Optional.of(testEntry.nativeObject()), Optional.class);
        Assertions.assertEquals(Optional.of(testEntry.implObject()), wrapped, "Entry: " + testEntry);
    }

    @ParameterizedTest
    @MethodSource("testInputs")
    void testWrapOptionalWithoutProvidingTheNativeType(TestEntry<?, ?, ?> testEntry) {
        var wrapped = MCCPlatform.getInstance().getConversionService().wrap(Optional.of(testEntry.nativeObject()));
        Assertions.assertEquals(Optional.of(testEntry.implObject()), wrapped, "Entry: " + testEntry);
    }

    @ParameterizedTest
    @MethodSource("testInputs")
    void testUnwrapOptional(TestEntry<?, ?, ?> testEntry) {
        var wrapped = MCCPlatform.getInstance().getConversionService().unwrap(Optional.of(testEntry.implObject()), Optional.class);
        Assertions.assertEquals(Optional.of(testEntry.nativeObject()), wrapped, "Entry: " + testEntry);
    }

    @ParameterizedTest
    @MethodSource("testInputs")
    void testUnwrapOptionalWithoutProvidingTheNativeType(TestEntry<?, ?, ?> testEntry) {
        var wrapped = MCCPlatform.getInstance().getConversionService().unwrap(Optional.of(testEntry.implObject()));
        Assertions.assertEquals(Optional.of(testEntry.nativeObject()), wrapped, "Entry: " + testEntry);
    }
}
