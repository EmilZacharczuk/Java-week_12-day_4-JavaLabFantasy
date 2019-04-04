package game.players;

import game.enums.DefenceType;
import game.enums.WeaponType;
import game.interfaces.IAttack;

public class Dwarf extends Player implements IAttack {

    private WeaponType weapon;
    private DefenceType defence;

    public Dwarf() {
        this.weapon = WeaponType.AXE;
        this.defence = DefenceType.HELMET;
    }
    public int attack() {
        return weapon.getPoints();
    }
    public int defence() {
        return defence.getPoints();
    }
}
