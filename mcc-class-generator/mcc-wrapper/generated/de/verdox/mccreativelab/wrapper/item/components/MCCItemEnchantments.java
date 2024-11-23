package de.verdox.mccreativelab.wrapper.item.components;

import it.unimi.dsi.fastutil.objects.Object2IntAVLTreeMap;
import net.kyori.adventure.key.Key;
import java.lang.Void;
public interface MCCItemEnchantments extends MCCItemComponentType{

	public MCCItemEnchantments withEnchantments (Object2IntAVLTreeMap<Key> enchantments);
	public boolean getShowInTooltip ();
	public Object2IntAVLTreeMap<Key> getEnchantments ();
	public MCCItemEnchantments withShowInTooltip (boolean showInTooltip);
	public interface Mutable extends MCCItemComponentType{

		public void setShowInTooltip (boolean showInTooltip);
		public Object2IntAVLTreeMap<Key> getEnchantments ();
		public boolean getShowInTooltip ();
		public Mutable withEnchantments (Object2IntAVLTreeMap<Key> enchantments);
}
}
