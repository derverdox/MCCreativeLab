package de.verdox.mccreativelab.wrapper.inventory;

import de.verdox.mccreativelab.wrapper.inventory.types.menu.MCCSmithingContainerMenu;
import de.verdox.mccreativelab.wrapper.inventory.types.menu.MCCGrindstoneContainerMenu;
import de.verdox.mccreativelab.wrapper.inventory.types.menu.MCCLoomContainerMenu;
import de.verdox.mccreativelab.wrapper.inventory.types.menu.MCCEnchantingTableContainerMenu;
import de.verdox.mccreativelab.wrapper.inventory.types.menu.MCCCrafterContainerMenu;
import de.verdox.mccreativelab.wrapper.inventory.types.menu.MCCFurnaceContainerMenu;
import de.verdox.mccreativelab.wrapper.inventory.types.menu.MCCLecternContainerMenu;
import de.verdox.mccreativelab.wrapper.inventory.types.menu.MCCAnvilContainerMenu;
import de.verdox.mccreativelab.wrapper.inventory.types.menu.MCCHopperContainerMenu;
import de.verdox.mccreativelab.wrapper.inventory.types.menu.MCCDispenserContainerMenu;
import de.verdox.mccreativelab.wrapper.inventory.types.menu.MCCBeaconContainerMenu;
import de.verdox.mccreativelab.wrapper.inventory.types.menu.MCCChestContainerMenu;
import de.verdox.mccreativelab.wrapper.inventory.types.menu.MCCBrewingStandContainerMenu;
import de.verdox.mccreativelab.wrapper.inventory.types.menu.MCCWorkBenchContainerMenu;
import de.verdox.mccreativelab.wrapper.inventory.types.menu.MCCCartographyTableContainerMenu;
import de.verdox.mccreativelab.wrapper.inventory.types.menu.MCCMerchantContainerMenu;
import de.verdox.mccreativelab.wrapper.inventory.types.menu.MCCStonecutterContainerMenu;
import de.verdox.mccreativelab.wrapper.inventory.types.menu.MCCShulkerContainerMenu;
import net.kyori.adventure.key.Key;

public interface MCCMenuTypes  {

	public static final MCCMenuType<MCCChestContainerMenu> GENERIC_9x1  = new MCCMenuType<>(Key.key(Key.MINECRAFT_NAMESPACE, "generic_9x1"), 9);

	public static final MCCMenuType<MCCChestContainerMenu> GENERIC_9x2  = new MCCMenuType<>(Key.key(Key.MINECRAFT_NAMESPACE, "generic_9x2"), 18);

	public static final MCCMenuType<MCCChestContainerMenu> GENERIC_9x3  = new MCCMenuType<>(Key.key(Key.MINECRAFT_NAMESPACE, "generic_9x3"), 27);

	public static final MCCMenuType<MCCChestContainerMenu> GENERIC_9x4  = new MCCMenuType<>(Key.key(Key.MINECRAFT_NAMESPACE, "generic_9x4"), 36);

	public static final MCCMenuType<MCCChestContainerMenu> GENERIC_9x5  = new MCCMenuType<>(Key.key(Key.MINECRAFT_NAMESPACE, "generic_9x5"), 45);

	public static final MCCMenuType<MCCChestContainerMenu> GENERIC_9x6  = new MCCMenuType<>(Key.key(Key.MINECRAFT_NAMESPACE, "generic_9x6"), 54);

	public static final MCCMenuType<MCCDispenserContainerMenu> GENERIC_3x3  = new MCCMenuType<>(Key.key(Key.MINECRAFT_NAMESPACE, "generic_3x3"), 9);

	public static final MCCMenuType<MCCCrafterContainerMenu> CRAFTER_3x3  = new MCCMenuType<>(Key.key(Key.MINECRAFT_NAMESPACE, "crafter_3x3"), 9);

	public static final MCCMenuType<MCCAnvilContainerMenu> ANVIL  = new MCCMenuType<>(Key.key(Key.MINECRAFT_NAMESPACE, "anvil"), 3);

	public static final MCCMenuType<MCCBeaconContainerMenu> BEACON  = new MCCMenuType<>(Key.key(Key.MINECRAFT_NAMESPACE, "beacon"), 1);

	public static final MCCMenuType<MCCFurnaceContainerMenu> BLAST_FURNACE  = new MCCMenuType<>(Key.key(Key.MINECRAFT_NAMESPACE, "blast_furnace"), 3);

	public static final MCCMenuType<MCCBrewingStandContainerMenu> BREWING_STAND  = new MCCMenuType<>(Key.key(Key.MINECRAFT_NAMESPACE, "brewing_stand"), 5);

	public static final MCCMenuType<MCCWorkBenchContainerMenu> CRAFTING  = new MCCMenuType<>(Key.key(Key.MINECRAFT_NAMESPACE, "crafting"), 10);

	public static final MCCMenuType<MCCEnchantingTableContainerMenu> ENCHANTMENT  = new MCCMenuType<>(Key.key(Key.MINECRAFT_NAMESPACE, "enchantment"), 2);

	public static final MCCMenuType<MCCFurnaceContainerMenu> FURNACE  = new MCCMenuType<>(Key.key(Key.MINECRAFT_NAMESPACE, "furnace"), 3);

	public static final MCCMenuType<MCCGrindstoneContainerMenu> GRINDSTONE  = new MCCMenuType<>(Key.key(Key.MINECRAFT_NAMESPACE, "grindstone"), 3);

	public static final MCCMenuType<MCCHopperContainerMenu> HOPPER  = new MCCMenuType<>(Key.key(Key.MINECRAFT_NAMESPACE, "hopper"), 5);

	public static final MCCMenuType<MCCLecternContainerMenu> LECTERN  = new MCCMenuType<>(Key.key(Key.MINECRAFT_NAMESPACE, "lectern"), 1);

	public static final MCCMenuType<MCCLoomContainerMenu> LOOM  = new MCCMenuType<>(Key.key(Key.MINECRAFT_NAMESPACE, "loom"), 4);

	public static final MCCMenuType<MCCMerchantContainerMenu> MERCHANT  = new MCCMenuType<>(Key.key(Key.MINECRAFT_NAMESPACE, "merchant"), 3);

	public static final MCCMenuType<MCCShulkerContainerMenu> SHULKER_BOX  = new MCCMenuType<>(Key.key(Key.MINECRAFT_NAMESPACE, "shulker_box"), 27);

	public static final MCCMenuType<MCCSmithingContainerMenu> SMITHING  = new MCCMenuType<>(Key.key(Key.MINECRAFT_NAMESPACE, "smithing"), 4);

	public static final MCCMenuType<MCCFurnaceContainerMenu> SMOKER  = new MCCMenuType<>(Key.key(Key.MINECRAFT_NAMESPACE, "smoker"), 3);

	public static final MCCMenuType<MCCCartographyTableContainerMenu> CARTOGRAPHY_TABLE  = new MCCMenuType<>(Key.key(Key.MINECRAFT_NAMESPACE, "cartography_table"), 3);

	public static final MCCMenuType<MCCStonecutterContainerMenu> STONECUTTER  = new MCCMenuType<>(Key.key(Key.MINECRAFT_NAMESPACE, "stonecutter"), 2);

}
