package game.enemies;

import game.enums.HealType;
import game.interfaces.IAttack;

public abstract class Enemy implements IAttack {

    private int healthPoints;
    private int strikePoints;

    public Enemy(int healthPoints, int strikePoints) {
        this.healthPoints = healthPoints;
        this.strikePoints = strikePoints;
    }
}
