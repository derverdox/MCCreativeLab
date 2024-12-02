package de.verdox.mccreativelab;

import com.google.common.reflect.TypeToken;
import de.verdox.mccreativelab.conversion.ConversionService;
import de.verdox.mccreativelab.wrapper.block.MCCBlockState;
import de.verdox.mccreativelab.wrapper.entity.MCCEntity;
import de.verdox.mccreativelab.wrapper.entity.MCCPlayer;
import de.verdox.mccreativelab.wrapper.item.MCCItemStack;
import de.verdox.mccreativelab.wrapper.item.MCCItemType;
import de.verdox.mccreativelab.wrapper.platform.MCCPlatform;
import org.bukkit.Material;
import org.bukkit.block.data.BlockData;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class BukkitAdapter {
    private static final ConversionService conversionService = MCCPlatform.getInstance().getConversionService();
    
    public static MCCItemType toItemType(Material material){
        return conversionService.wrap(material, new TypeToken<>() {});
    }

    public static MCCPlayer to(Player player){
        return conversionService.wrap(player, new TypeToken<>() {});
    }

    public static MCCItemStack to(ItemStack itemStack){
        return conversionService.wrap(itemStack, new TypeToken<>() {});
    }

    public static MCCBlockState to(BlockData blockData){
        return conversionService.wrap(blockData, new TypeToken<>() {});
    }

    public static ItemStack from(MCCItemStack stack){
        return conversionService.unwrap(stack, new TypeToken<>() {});
    }

    public static BlockData from(MCCBlockState blockState){
        return conversionService.unwrap(blockState, new TypeToken<>() {});
    }

    public static Entity from(MCCEntity mccEntity){
        return conversionService.unwrap(mccEntity, new TypeToken<>() {});
    }

    public static Player from(MCCPlayer mccPlayer){
        return conversionService.unwrap(mccPlayer, new TypeToken<>() {});
    }
}
