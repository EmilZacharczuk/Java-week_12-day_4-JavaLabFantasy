package game.players;

public abstract class Player {
    private int healthPoints = 100;

    public Player() {
        this.healthPoints = 100;
    }

    public int getPoints() {
        return this.healthPoints;
    }
}
