package game.enums;

public enum WeaponType {
    SWORD(10),
    AXE(7),
    CLUB(5);

    private final int points;

    WeaponType(int points) {
        this.points = points;
    }
}