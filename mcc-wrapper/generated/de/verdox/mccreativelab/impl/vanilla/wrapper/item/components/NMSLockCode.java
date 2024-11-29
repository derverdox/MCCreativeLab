package de.verdox.mccreativelab.impl.vanilla.wrapper.item.components;

import java.util.HashSet;
import de.verdox.mccreativelab.wrapper.platform.MCCHandle;
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

public class NMSLockCode extends MCCHandle<LockCode> implements MCCLockCode  {

	public static final MCCConverter<LockCode, NMSLockCode> CONVERTER  = converter(NMSLockCode.class, LockCode.class, NMSLockCode::new, MCCHandle::getHandle);

	public NMSLockCode(LockCode handle){
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
