package de.verdox.mccreativelab.impl.vanilla.types;

import de.verdox.mccreativelab.wrapper.entity.MCCEntity;
import de.verdox.mccreativelab.impl.vanilla.types.NMSGameEvent;
import de.verdox.mccreativelab.wrapper.platform.MCCPlatform;
import de.verdox.mccreativelab.wrapper.registry.MCCReference;
import de.verdox.mccreativelab.conversion.converter.MCCConverter;
import java.util.Set;
import net.minecraft.world.level.block.state.BlockState;
import de.verdox.mccreativelab.wrapper.types.MCCGameEvent;
import net.minecraft.world.level.gameevent.GameEvent;
import com.google.common.reflect.TypeToken;
import java.lang.reflect.Field;
import java.util.ArrayList;
import de.verdox.mccreativelab.impl.vanilla.platform.NMSHandle;
import java.util.HashSet;
import java.util.List;
import net.minecraft.core.Holder;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.phys.Vec3;
import de.verdox.mccreativelab.wrapper.block.MCCBlockState;
import net.minecraft.world.level.gameevent.GameEventListener;

public class NMSGameEvent extends NMSHandle<GameEvent> implements MCCGameEvent  {

	public static final MCCConverter<GameEvent, NMSGameEvent> CONVERTER  = converter(NMSGameEvent.class, GameEvent.class, NMSGameEvent::new, NMSHandle::getHandle);

	public NMSGameEvent (GameEvent handle){
		super(handle);
	}

	public int getNotificationRadius(){
		var nms = getNotificationRadiusFromImpl();
		return nms;
	}

	private int getNotificationRadiusFromImpl(){
		return handle == null ? 0 : handle.notificationRadius();
	}


	public static class NMSListenerInfo extends NMSHandle<GameEvent.ListenerInfo> implements MCCGameEvent.MCCListenerInfo  {
	
		public static final MCCConverter<GameEvent.ListenerInfo, NMSGameEvent.NMSListenerInfo> CONVERTER  = converter(NMSGameEvent.NMSListenerInfo.class, GameEvent.ListenerInfo.class, NMSGameEvent.NMSListenerInfo::new, NMSHandle::getHandle);

		public NMSListenerInfo (GameEvent.ListenerInfo handle){
			super(handle);
		}
	
		public MCCReference<MCCGameEvent> getArg0(){
			var nms = getArg0FromImpl();
			return MCCPlatform.getInstance().getConversionService().wrap(nms, new TypeToken<MCCReference<MCCGameEvent>>() {});
		}
	
		private Holder<GameEvent> getArg0FromImpl(){
			Holder<GameEvent> nms;
			if(handle==null) return null;
			try {
				Field nmsField = GameEvent.ListenerInfo.class.getDeclaredField("arg0");
				nmsField.setAccessible(true);
				nms = (Holder<GameEvent>) nmsField.get(handle);
			} catch (Throwable e) { throw new RuntimeException(e); }
			return nms;
		}
	
		public Vec3 getArg1(){
			var nms = getArg1FromImpl();
			return nms;
		}
	
		private Vec3 getArg1FromImpl(){
			Vec3 nms;
			if(handle==null) return null;
			try {
				Field nmsField = GameEvent.ListenerInfo.class.getDeclaredField("arg1");
				nmsField.setAccessible(true);
				nms = (Vec3) nmsField.get(handle);
			} catch (Throwable e) { throw new RuntimeException(e); }
			return nms;
		}
	
		public GameEvent.Context getArg2(){
			var nms = getArg2FromImpl();
			return nms;
		}
	
		private GameEvent.Context getArg2FromImpl(){
			GameEvent.Context nms;
			if(handle==null) return null;
			try {
				Field nmsField = GameEvent.ListenerInfo.class.getDeclaredField("arg2");
				nmsField.setAccessible(true);
				nms = (GameEvent.Context) nmsField.get(handle);
			} catch (Throwable e) { throw new RuntimeException(e); }
			return nms;
		}
	
		public GameEventListener getArg3(){
			var nms = getArg3FromImpl();
			return nms;
		}
	
		private GameEventListener getArg3FromImpl(){
			GameEventListener nms;
			if(handle==null) return null;
			try {
				Field nmsField = GameEvent.ListenerInfo.class.getDeclaredField("arg3");
				nmsField.setAccessible(true);
				nms = (GameEventListener) nmsField.get(handle);
			} catch (Throwable e) { throw new RuntimeException(e); }
			return nms;
		}
	
		public Vec3 getArg4(){
			var nms = getArg4FromImpl();
			return nms;
		}
	
		private Vec3 getArg4FromImpl(){
			Vec3 nms;
			if(handle==null) return null;
			try {
				Field nmsField = GameEvent.ListenerInfo.class.getDeclaredField("arg4");
				nmsField.setAccessible(true);
				nms = (Vec3) nmsField.get(handle);
			} catch (Throwable e) { throw new RuntimeException(e); }
			return nms;
		}
	
	}

	public static class NMSContext extends NMSHandle<GameEvent.Context> implements MCCGameEvent.MCCContext  {
	
		public static final MCCConverter<GameEvent.Context, NMSGameEvent.NMSContext> CONVERTER  = converter(NMSGameEvent.NMSContext.class, GameEvent.Context.class, NMSGameEvent.NMSContext::new, NMSHandle::getHandle);

		public NMSContext (GameEvent.Context handle){
			super(handle);
		}
	
		public MCCEntity getSourceEntity(){
			var nms = getSourceEntityFromImpl();
			return MCCPlatform.getInstance().getConversionService().wrap(nms, new TypeToken<MCCEntity>() {});
		}
	
		private Entity getSourceEntityFromImpl(){
			return handle == null ? null : handle.sourceEntity();
		}
	
		public MCCBlockState getAffectedState(){
			var nms = getAffectedStateFromImpl();
			return MCCPlatform.getInstance().getConversionService().wrap(nms, new TypeToken<MCCBlockState>() {});
		}
	
		private BlockState getAffectedStateFromImpl(){
			return handle == null ? null : handle.affectedState();
		}
	
	}
}
