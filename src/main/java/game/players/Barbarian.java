package game.players;

import game.enums.DefenceType;
import game.enums.HealType;
import game.enums.WeaponType;
import game.interfaces.IAttack;

public class Barbarian extends Player implements IAttack {

    private WeaponType weapon;
    private DefenceType defence;

    public Barbarian() {
        this.weapon = WeaponType.CLUB;
        this.defence = DefenceType.SHIELD;
    }
    public int attack() {
        return weapon.getPoints();
    }
    public int defence() {
        return defence.getPoints();
    }
}
