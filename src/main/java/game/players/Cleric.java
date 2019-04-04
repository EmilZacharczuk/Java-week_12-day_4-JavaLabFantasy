package game.players;

import game.enums.HealType;
import game.enums.WeaponType;

public class Cleric extends Player{

    private HealType heal;

    public Cleric() {
        this.heal = HealType.HERBS;
    }
    public void healPlayer(Player player) {

    }
}

