package game.players;

import game.enums.DefenceType;
import game.enums.SpellType;
import game.interfaces.IAttack;

public class Wizard extends Player implements IAttack {

    private SpellType spell;
    private DefenceType defence;

    public Wizard() {
        this.spell = SpellType.LIGHTNINGSTRIKE;
        this.defence = DefenceType.OGRE;
    }
    public int attack() {
        return spell.getPoints();
    }
    public int defence() {
        return defence.getPoints();
    }
}

