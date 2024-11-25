package de.verdox.mccreativelab.wrapper.entity;

public enum MCCEquipmentSlot {
    MAINHAND(Type.HAND, 0, 0, "mainhand"),
    OFFHAND(Type.HAND, 1, 5, "offhand"),
    FEET(Type.HUMANOID_ARMOR, 0, 1, 1, "feet"),
    LEGS(Type.HUMANOID_ARMOR, 1, 1, 2, "legs"),
    CHEST(Type.HUMANOID_ARMOR, 2, 1, 3, "chest"),
    HEAD(Type.HUMANOID_ARMOR, 3, 1, 4, "head"),
    BODY(Type.ANIMAL_ARMOR, 0, 1, 6, "body"),
    ;

    public static final int NO_COUNT_LIMIT = 0;
    private final MCCEquipmentSlot.Type type;
    private final int index;
    private final int countLimit;
    private final int filterFlag;
    private final String name;

    MCCEquipmentSlot(final MCCEquipmentSlot.Type type, final int entityId, final int maxCount, final int armorStandId, final String name) {
        this.type = type;
        this.index = entityId;
        this.countLimit = maxCount;
        this.filterFlag = armorStandId;
        this.name = name;
    }

    MCCEquipmentSlot(final MCCEquipmentSlot.Type type, final int entityId, final int armorStandId, final String name) {
        this(type, entityId, 0, armorStandId, name);
    }

    public boolean isArmor() {
        return this.type == MCCEquipmentSlot.Type.HUMANOID_ARMOR || this.type == MCCEquipmentSlot.Type.ANIMAL_ARMOR;
    }

    public MCCEquipmentSlot.Type getType() {
        return type;
    }

    public int getIndex() {
        return index;
    }

    public int getMaxCount() {
        return countLimit;
    }

    public int getArmorStandId() {
        return filterFlag;
    }

    public String getName() {
        return name;
    }

    public enum Type {
        HAND,
        HUMANOID_ARMOR,
        ANIMAL_ARMOR;
    }
}
