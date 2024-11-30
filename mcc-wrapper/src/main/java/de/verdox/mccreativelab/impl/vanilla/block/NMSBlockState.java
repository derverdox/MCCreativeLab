package de.verdox.mccreativelab.impl.vanilla.block;

import com.google.common.reflect.TypeToken;
import de.verdox.mccreativelab.conversion.converter.MCCConverter;
import de.verdox.mccreativelab.wrapper.entity.MCCPlayer;
import de.verdox.mccreativelab.wrapper.platform.MCCHandle;
import de.verdox.mccreativelab.wrapper.block.MCCBlockState;
import de.verdox.mccreativelab.wrapper.block.MCCBlockType;
import de.verdox.mccreativelab.wrapper.entity.MCCEntity;
import de.verdox.mccreativelab.wrapper.item.MCCItemStack;
import de.verdox.mccreativelab.wrapper.platform.MCCPlatform;
import net.kyori.adventure.key.Key;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Collection;
import java.util.List;

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
    public @NotNull List<MCCItemStack> getDrops(@Nullable MCCEntity entity, @Nullable MCCItemStack tool) {
        //TODO
        return List.of();
    }

    @Override
    public @NotNull Key key() {
        return getBlockType().key();
    }
}
