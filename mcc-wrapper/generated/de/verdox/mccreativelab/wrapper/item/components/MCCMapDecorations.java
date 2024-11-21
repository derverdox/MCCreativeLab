package de.verdox.mccreativelab.wrapper.item.components;

import de.verdox.mccreativelab.wrapper.registry.MCCReference;
import java.util.Map;
import net.minecraft.world.level.saveddata.maps.MapDecorationType;
import java.lang.String;
import de.verdox.mccreativelab.wrapper.item.components.MCCMapDecorations;

public interface MCCMapDecorations extends MCCItemComponent  {

	public MCCMapDecorations.MCCEntry createMCCEntry();

	public Map<String, MCCMapDecorations.MCCEntry> getDecorations();

	public MCCMapDecorations withDecorations(Map<String, MCCMapDecorations.MCCEntry> decorations);


	public static interface MCCEntry  {
	
		public MCCReference<MapDecorationType> getType();
	
		public MCCMapDecorations.MCCEntry withType(MCCReference<MapDecorationType> type);
	
		public double getX();
	
		public MCCMapDecorations.MCCEntry withX(double x);
	
		public double getZ();
	
		public MCCMapDecorations.MCCEntry withZ(double z);
	
		public float getRotation();
	
		public MCCMapDecorations.MCCEntry withRotation(float rotation);
	
	}
}
