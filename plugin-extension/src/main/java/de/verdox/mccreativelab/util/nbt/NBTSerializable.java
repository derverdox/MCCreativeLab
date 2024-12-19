package de.verdox.mccreativelab.util.nbt;

/**
 * Please use {@link Serializable}
 */
@Deprecated
public interface NBTSerializable {
    void saveNBTData(NBTContainer storage);
    void loadNBTData(NBTContainer storage);

}
