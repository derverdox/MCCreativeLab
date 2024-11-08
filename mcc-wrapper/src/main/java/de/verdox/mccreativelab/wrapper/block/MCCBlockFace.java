package de.verdox.mccreativelab.wrapper.block;

import de.verdox.mccreativelab.wrapper.MCCWrapped;
import org.jetbrains.annotations.NotNull;
import org.joml.Vector3d;

/**
 * Describes a Block Face
 */
public enum MCCBlockFace implements MCCWrapped {
    NORTH(0, 0, -1),
    EAST(1, 0, 0),
    SOUTH(0, 0, 1),
    WEST(-1, 0, 0),
    UP(0, 1, 0),
    DOWN(0, -1, 0),
    NORTH_EAST(NORTH, EAST),
    NORTH_WEST(NORTH, WEST),
    SOUTH_EAST(SOUTH, EAST),
    SOUTH_WEST(SOUTH, WEST),
    WEST_NORTH_WEST(WEST, NORTH_WEST),
    NORTH_NORTH_WEST(NORTH, NORTH_WEST),
    NORTH_NORTH_EAST(NORTH, NORTH_EAST),
    EAST_NORTH_EAST(EAST, NORTH_EAST),
    EAST_SOUTH_EAST(EAST, SOUTH_EAST),
    SOUTH_SOUTH_EAST(SOUTH, SOUTH_EAST),
    SOUTH_SOUTH_WEST(SOUTH, SOUTH_WEST),
    WEST_SOUTH_WEST(WEST, SOUTH_WEST),
    SELF(0, 0, 0);

    private final int modX;
    private final int modY;
    private final int modZ;

    private MCCBlockFace(final int modX, final int modY, final int modZ) {
        this.modX = modX;
        this.modY = modY;
        this.modZ = modZ;
    }

    private MCCBlockFace(final MCCBlockFace face1, final MCCBlockFace face2) {
        this.modX = face1.getModX() + face2.getModX();
        this.modY = face1.getModY() + face2.getModY();
        this.modZ = face1.getModZ() + face2.getModZ();
    }

    /**
     * Get the amount of X-coordinates to modify to get the represented block
     *
     * @return Amount of X-coordinates to modify
     */
    public int getModX() {
        return modX;
    }

    /**
     * Get the amount of Y-coordinates to modify to get the represented block
     *
     * @return Amount of Y-coordinates to modify
     */
    public int getModY() {
        return modY;
    }

    /**
     * Get the amount of Z-coordinates to modify to get the represented block
     *
     * @return Amount of Z-coordinates to modify
     */
    public int getModZ() {
        return modZ;
    }

    /**
     * Gets the normal vector corresponding to this block face.
     *
     * @return the normal vector
     */
    @NotNull
    public Vector3d getDirection() {
        Vector3d direction = new Vector3d(modX, modY, modZ);
        if (modX != 0 || modY != 0 || modZ != 0) {
            direction.normalize();
        }
        return direction;
    }

    /**
     * Returns true if this face is aligned with one of the unit axes in 3D
     * Cartesian space (ie NORTH, SOUTH, EAST, WEST, UP, DOWN).
     *
     * @return Cartesian status
     */
    public boolean isCartesian() {
        switch (this) {
            case NORTH:
            case SOUTH:
            case EAST:
            case WEST:
            case UP:
            case DOWN:
                return true;
            default:
                return false;
        }
    }

    @NotNull
    public MCCBlockFace getOppositeFace() {
        switch (this) {
            case NORTH:
                return MCCBlockFace.SOUTH;

            case SOUTH:
                return MCCBlockFace.NORTH;

            case EAST:
                return MCCBlockFace.WEST;

            case WEST:
                return MCCBlockFace.EAST;

            case UP:
                return MCCBlockFace.DOWN;

            case DOWN:
                return MCCBlockFace.UP;

            case NORTH_EAST:
                return MCCBlockFace.SOUTH_WEST;

            case NORTH_WEST:
                return MCCBlockFace.SOUTH_EAST;

            case SOUTH_EAST:
                return MCCBlockFace.NORTH_WEST;

            case SOUTH_WEST:
                return MCCBlockFace.NORTH_EAST;

            case WEST_NORTH_WEST:
                return MCCBlockFace.EAST_SOUTH_EAST;

            case NORTH_NORTH_WEST:
                return MCCBlockFace.SOUTH_SOUTH_EAST;

            case NORTH_NORTH_EAST:
                return MCCBlockFace.SOUTH_SOUTH_WEST;

            case EAST_NORTH_EAST:
                return MCCBlockFace.WEST_SOUTH_WEST;

            case EAST_SOUTH_EAST:
                return MCCBlockFace.WEST_NORTH_WEST;

            case SOUTH_SOUTH_EAST:
                return MCCBlockFace.NORTH_NORTH_WEST;

            case SOUTH_SOUTH_WEST:
                return MCCBlockFace.NORTH_NORTH_EAST;

            case WEST_SOUTH_WEST:
                return MCCBlockFace.EAST_NORTH_EAST;

            case SELF:
                return MCCBlockFace.SELF;
        }

        return MCCBlockFace.SELF;
    }
}
