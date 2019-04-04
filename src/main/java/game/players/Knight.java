package game.players;

import game.enums.DefenceType;
import game.enums.WeaponType;
import game.interfaces.IAttack;

public class Knight extends Player implements IAttack {

    private WeaponType weapon;
    private DefenceType defence;

    public Knight() {
        this.weapon = WeaponType.SWORD;
        this.defence = DefenceType.ARMOR;
    }

    public int attack() {
        return weapon.getPoints();
    }
    public int defence() {
        return defence.getPoints();
    }
}
