package de.verdox.mccreativelab.conversion;

import de.verdox.mccreativelab.TestBase;
import de.verdox.mccreativelab.conversion.converter.MCCConverter;
import de.verdox.mccreativelab.impl.vanilla.block.NMSBlockType;
import de.verdox.mccreativelab.impl.vanilla.item.NMSItemStack;
import de.verdox.mccreativelab.impl.vanilla.platform.converter.ResourceLocationConverter;
import de.verdox.mccreativelab.wrapper.block.MCCBlockType;
import de.verdox.mccreativelab.wrapper.inventory.MCCContainer;
import de.verdox.mccreativelab.wrapper.inventory.types.menu.MCCFurnaceContainerMenu;
import de.verdox.mccreativelab.wrapper.item.MCCItemStack;
import de.verdox.mccreativelab.wrapper.platform.MCCPlatform;
import net.kyori.adventure.key.Key;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.SimpleContainer;
import net.minecraft.world.inventory.SmokerMenu;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
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
                MCCPlatform.getInstance().getConversionService().registerPlatformType(apiType(), converter());
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
        testEntries.add(new TestEntry<>(Key.class, new ResourceLocationConverter(), Key.key("minecraft", "stone"), ResourceLocation.tryBuild("minecraft", "stone"), false));

        testEntries.add(new TestEntry<>(MCCItemStack.class, NMSItemStack.CONVERTER, new OnlyLogItemStack(log), log, false));

        for (TestEntry<?, ?, ?> testEntry : testEntries) {
            testEntry.register();
        }
    }

    @Test
    public void testNoNullEntriesInMapping() {

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

    @ParameterizedTest
    @MethodSource("testInputs")
    void testWrapClassType(TestEntry<?, ?, ?> testEntry) {

        var wrapped = MCCPlatform.getInstance().getConversionService().wrapClassType(testEntry.nativeObject().getClass());
        Assertions.assertEquals(testEntry.apiType, wrapped, "Entry: " + testEntry);
    }

    @Test
    public void findConverterForSpecificWhenOnlyInterfaceConverterIsKnown() {
        SimpleContainer simpleContainer = new SimpleContainer(3);
        Assertions.assertDoesNotThrow(() -> {
            MCCContainer mccContainer = MCCPlatform.getInstance().getConversionService().wrap(simpleContainer);
        });
    }

    @Test
    public void findConverterForSpecificWhenOnlyInterfaceConverterIsKnown2() {
        Class<?> wrappedType = MCCPlatform.getInstance().getConversionService().wrapClassType(SmokerMenu.class);
        Assertions.assertEquals(MCCFurnaceContainerMenu.class, wrappedType);
    }
}
