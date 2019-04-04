package game;

import game.players.Player;

import java.util.ArrayList;

public class Game {

    ArrayList<Room> rooms;

    public Game(Room ... args) {
        rooms = new ArrayList<>();
        for(Room arg : args) {
            this.rooms.add(arg);
        }
    }

    public ArrayList<Room> getRooms() {
        return rooms;
    }

    public void transferPlayer(Player player, Room oldRoom, Room newRoom) {
        oldRoom.removerPlayer(player);
        newRoom.addPlayer(player);
    }
}
