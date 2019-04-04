package game.enums;

public enum DefenceType {
    ARMOR(10),
    DRAGON(10),
    HELMET(10),
    OGRE(10),
    SHIELD(10);

    private final int points;

    DefenceType(int points) {
        this.points = points;
    }


    public int getPoints() {
        return this.points;
    }
}
