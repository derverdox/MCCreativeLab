package de.verdox.mccreativelab.wrapper.core;

/**
 * Describes a block position
 */
public record MCCBlockPos(int x, int y, int z) {

    /**
     * Returns the x coordinate of the block position
     *
     * @return the x coordinate
     */
    @Override
    public int x() {
        return x;
    }

    /**
     * Returns the y coordinate of the block position
     *
     * @return the y coordinate
     */
    @Override
    public int y() {
        return y;
    }

    /**
     * Returns the z coordinate of the block position
     *
     * @return the z coordinate
     */
    @Override
    public int z() {
        return z;
    }
}
