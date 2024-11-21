package de.verdox.mccreativelab.impl.vanilla.wrapper.item.components;

import de.verdox.mccreativelab.impl.vanilla.platform.NMSHandle;
import java.util.HashSet;
import java.util.List;
import de.verdox.mccreativelab.wrapper.item.components.MCCLockCode;
import de.verdox.mccreativelab.wrapper.platform.MCCPlatform;
import de.verdox.mccreativelab.conversion.converter.MCCConverter;
import net.minecraft.world.LockCode;
import de.verdox.mccreativelab.impl.vanilla.wrapper.item.components.NMSLockCode;
import java.util.Set;
import com.google.common.reflect.TypeToken;
import java.lang.String;
import java.util.ArrayList;

public class NMSLockCode extends NMSHandle<LockCode> implements MCCLockCode  {

	public static final MCCConverter<LockCode, NMSLockCode> CONVERTER  = converter(NMSLockCode.class, LockCode.class, NMSLockCode::new, NMSHandle::getHandle);

	public NMSLockCode (LockCode handle){
		super(handle);
	}

	public String getKey(){
		var nms = getKeyFromImpl();
		return nms;
	}

	private String getKeyFromImpl(){
		return handle == null ? null : handle.key();
	}

	public MCCLockCode withKey(String key){
		var param0 = key;
		return new NMSLockCode(new LockCode(param0));
	}

}
