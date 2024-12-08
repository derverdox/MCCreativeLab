package de.verdox.mccreativelab.impl.vanilla.block;

import com.google.common.reflect.TypeToken;
import de.verdox.mccreativelab.conversion.converter.MCCConverter;
import de.verdox.mccreativelab.wrapper.entity.types.MCCPlayer;
import de.verdox.mccreativelab.wrapper.platform.MCCHandle;
import de.verdox.mccreativelab.wrapper.block.MCCBlockState;
import de.verdox.mccreativelab.wrapper.block.MCCBlockType;
import de.verdox.mccreativelab.wrapper.entity.MCCEntity;
import de.verdox.mccreativelab.wrapper.item.MCCItemStack;
import de.verdox.mccreativelab.wrapper.platform.MCCPlatform;
import de.verdox.mccreativelab.wrapper.world.MCCLocation;
import net.kyori.adventure.key.Key;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class NMSBlockState extends MCCHandle<BlockState> implements MCCBlockState {
    public static final MCCConverter<BlockState, NMSBlockState> CONVERTER = converter(NMSBlockState.class, BlockState.class, NMSBlockState::new, MCCHandle::getHandle);

    public NMSBlockState(BlockState handle) {
        super(handle);
    }

    @Override
    public @NotNull MCCBlockType getBlockType() {
        return MCCPlatform.getInstance().getConversionService().wrap(handle.getBlock(), new TypeToken<>() {});
    }

    @Override
    public String toBlockDataString() {
        return handle.toString();
    }

    @Override
    public float getDestroySpeed(MCCPlayer player, MCCItemStack mccItemStack, boolean considerEnchants) {
        float speed = mccItemStack.getDestroySpeed(this);

        if(speed > 1.0 && considerEnchants){
            ItemStack nmsItemStack = MCCPlatform.getInstance().getConversionService().unwrap(mccItemStack, new TypeToken<>() {});
            final net.minecraft.core.Holder<net.minecraft.world.entity.ai.attributes.Attribute> attribute = net.minecraft.world.entity.ai.attributes.Attributes.MINING_EFFICIENCY;
            // Logic sourced from AttributeInstance#calculateValue
            final double initialBaseValue = attribute.value().getDefaultValue();
            final org.apache.commons.lang3.mutable.MutableDouble modifiedBaseValue = new org.apache.commons.lang3.mutable.MutableDouble(initialBaseValue);
            final org.apache.commons.lang3.mutable.MutableDouble baseValMul = new org.apache.commons.lang3.mutable.MutableDouble(1);
            final org.apache.commons.lang3.mutable.MutableDouble totalValMul = new org.apache.commons.lang3.mutable.MutableDouble(1);

            net.minecraft.world.item.enchantment.EnchantmentHelper.forEachModifier(
                nmsItemStack, net.minecraft.world.entity.EquipmentSlot.MAINHAND, (attributeHolder, attributeModifier) -> {
                    switch (attributeModifier.operation()) {
                        case ADD_VALUE -> modifiedBaseValue.add(attributeModifier.amount());
                        case ADD_MULTIPLIED_BASE -> baseValMul.add(attributeModifier.amount());
                        case ADD_MULTIPLIED_TOTAL -> totalValMul.setValue(totalValMul.doubleValue() * (1D + attributeModifier.amount()));
                    }
                }
            );

            final double actualModifier = modifiedBaseValue.doubleValue() * baseValMul.doubleValue() * totalValMul.doubleValue();

            speed += (float) attribute.value().sanitizeValue(actualModifier);
        }

        return speed;
    }

    @Override
    public @NotNull List<MCCItemStack> getDrops(@NotNull MCCLocation mccLocation, @Nullable MCCEntity entity, @Nullable MCCItemStack tool) {
        ItemStack nms = conversionService.unwrap(tool, new TypeToken<>() {});

        ServerLevel serverLevel = conversionService.unwrap(mccLocation.world(), new TypeToken<>() {});
        BlockPos pos = new BlockPos(mccLocation.blockX(), mccLocation.blockY(), mccLocation.blockZ());
        Entity nmsEntity = conversionService.unwrap(entity, new TypeToken<>() {});

        if (tool == null || isPreferredTool(tool)) {
            return Block.getDrops(handle, serverLevel, pos, serverLevel.getBlockEntity(pos), nmsEntity, nms).stream().map(itemStack -> conversionService.wrap(itemStack, new TypeToken<MCCItemStack>() {})).collect(Collectors.toList());
        } else {
            return Collections.emptyList();
        }
    }

    @Override
    public boolean isRandomlyTicking() {
        return handle.isRandomlyTicking();
    }

    @Override
    public boolean requiresCorrectToolForDrops() {
        return handle.requiresCorrectToolForDrops();
    }

    @Override
    public @NotNull Key key() {
        return getBlockType().key();
    }
}
