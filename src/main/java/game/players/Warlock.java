package game.players;

import game.enums.DefenceType;
import game.enums.SpellType;
import game.interfaces.IAttack;

public class Warlock extends Player implements IAttack {

    private SpellType spell;
    private DefenceType defence;

    public Warlock() {
        this.spell = SpellType.FIREBALL;
        this.defence = DefenceType.DRAGON;
    }
    public int attack() {
        return spell.getPoints();
    }
    public int defence() {
        return defence.getPoints();
    }
}
