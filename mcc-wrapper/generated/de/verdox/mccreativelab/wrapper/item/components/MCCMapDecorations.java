package de.verdox.mccreativelab.wrapper.item.components;

import de.verdox.mccreativelab.wrapper.registry.MCCReference;
import java.util.Map;
import net.minecraft.world.level.saveddata.maps.MapDecorationType;
import java.lang.String;
import de.verdox.mccreativelab.wrapper.item.components.MCCMapDecorations;

public interface MCCMapDecorations extends MCCItemComponent  {

	public MCCMapDecorations.Entry createEntry();

	public Map<String, MCCMapDecorations.Entry> getDecorations();

	public MCCMapDecorations withDecorations(Map<String, MCCMapDecorations.Entry> decorations);


	public static interface Entry  {
	
		public MCCReference<MapDecorationType> getType();
	
		public MCCMapDecorations.Entry withType(MCCReference<MapDecorationType> type);
	
		public double getX();
	
		public MCCMapDecorations.Entry withX(double x);
	
		public double getZ();
	
		public MCCMapDecorations.Entry withZ(double z);
	
		public float getRotation();
	
		public MCCMapDecorations.Entry withRotation(float rotation);
	
	}
}
