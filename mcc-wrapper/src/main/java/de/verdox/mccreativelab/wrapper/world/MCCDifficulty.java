package de.verdox.mccreativelab.wrapper.world;

/**
 * The difficulty of a world on a minecraft server
 */
public enum MCCDifficulty {
    PEACEFUL(0, "peaceful"),
    EASY(1, "easy"),
    NORMAL(2, "normal"),
    HARD(3, "hard"),
    ;
    private final int id;
    private final String name;

    MCCDifficulty(int id, String name){
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
