package de.verdox.mccreativelab.wrapper.entity.permission;

import org.jetbrains.annotations.NotNull;

import java.util.HashMap;
import java.util.Map;

public class MCCPermissionContainer {
    private final Map<String, Boolean> permissions = new HashMap<>();

    /**
     * Checks if this object has a permission set and, if it is set, the value of the permission.
     *
     * @param permission the permission to check
     * @return a tri-state of if the permission is set and, if it is set, it's value
     */
    public net.kyori.adventure.util.@NotNull TriState permissionValue(final @NotNull String permission) {
        if (permissions.containsKey(permission)) {
            return net.kyori.adventure.util.TriState.byBoolean(permissions.get(permission));
        }
        else {
            return net.kyori.adventure.util.TriState.NOT_SET;
        }
    }

}
