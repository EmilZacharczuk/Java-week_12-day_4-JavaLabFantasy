package game.enums;

public enum HealType {
    POTION(10),
    HERBS(10);

    private final int points;

    HealType(int points) {
        this.points = points;
    }

    public int getPoints() {
        return this.points;
    }
}
