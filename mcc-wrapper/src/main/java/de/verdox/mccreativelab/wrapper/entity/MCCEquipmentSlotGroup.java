package de.verdox.mccreativelab.wrapper.entity;

import java.util.function.Predicate;

public enum MCCEquipmentSlotGroup {
    ANY(0, "any", slot -> true),
    MAINHAND(1, "mainhand", MCCEquipmentSlot.MAINHAND),
    OFFHAND(2, "offhand", MCCEquipmentSlot.OFFHAND),
    HAND(3, "hand", slot -> slot.getType() == MCCEquipmentSlot.Type.HAND),
    FEET(4, "feet", MCCEquipmentSlot.FEET),
    LEGS(5, "legs", MCCEquipmentSlot.LEGS),
    CHEST(6, "chest", MCCEquipmentSlot.CHEST),
    HEAD(7, "head", MCCEquipmentSlot.HEAD),
    ARMOR(8, "armor", MCCEquipmentSlot::isArmor),
    BODY(9, "body", MCCEquipmentSlot.BODY);

    private final int id;
    private final String key;
    private final Predicate<MCCEquipmentSlot> predicate;

    private MCCEquipmentSlotGroup(final int id, final String name, final Predicate<MCCEquipmentSlot> slotPredicate) {
        this.id = id;
        this.key = name;
        this.predicate = slotPredicate;
    }

    private MCCEquipmentSlotGroup(final int id, final String name, final MCCEquipmentSlot slot) {
        this(id, name, slotx -> slotx == slot);
    }

    public int getId() {
        return id;
    }

    public String getKey() {
        return key;
    }

    public boolean test(MCCEquipmentSlot slot) {
        return this.predicate.test(slot);
    }
}
