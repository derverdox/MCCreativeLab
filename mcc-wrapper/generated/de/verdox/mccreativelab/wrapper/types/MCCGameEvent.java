package de.verdox.mccreativelab.wrapper.types;

import de.verdox.mccreativelab.wrapper.entity.MCCEntity;
import de.verdox.mccreativelab.wrapper.registry.MCCReference;
import net.minecraft.world.phys.Vec3;
import de.verdox.mccreativelab.wrapper.block.MCCBlockState;
import net.minecraft.world.level.gameevent.GameEventListener;
import de.verdox.mccreativelab.wrapper.MCCWrapped;
import de.verdox.mccreativelab.wrapper.types.MCCGameEvent;

public interface MCCGameEvent extends MCCWrapped  {

	public int getNotificationRadius();


	public static interface ListenerInfo  {
	
		public MCCReference<MCCGameEvent> getArg0();
	
		public Vec3 getArg1();
	
		public MCCGameEvent.Context getArg2();
	
		public GameEventListener getArg3();
	
		public Vec3 getArg4();
	
	}

	public static interface Context  {
	
		public MCCEntity getSourceEntity();
	
		public MCCBlockState getAffectedState();
	
	}
}
