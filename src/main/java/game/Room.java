package game;

import game.enemies.Enemy;
import game.players.Player;
import game.treasures.Treasure;

import java.util.ArrayList;

public class Room {

    private ArrayList<Player> players;
    private Treasure treasure;
    private Enemy enemy;

    public Room(Player ... args) {
        players = new ArrayList<>();
        for (Player arg: args)
        this.players.add(arg);
    }

    public Treasure getTreasure() {
        return treasure;
    }

    public void setTreasure(Treasure treasure) {
        this.treasure = treasure;
    }

    public Enemy getEnemy() {
        return enemy;
    }

    public void setEnemy(Enemy enemy) {
        this.enemy = enemy;
    }

    public void addPlayer(Player newPlayer) {
        players.add(newPlayer);
    }

    public Player removerPlayer(Player player) {
        this.players.remove(player);
        return player;
    }


}

