package bin.main.classes;
//Room interface
public class Room {
    public String room_name; //Name of Room
    public String[] room_adjacency; //rooms adjacent to this room
    //public static PlayerModel[] player_list; //all the players in the game

    Room() {
        room_name = "";
        room_adjacency = null;
    }

    Room(String name, String[] room_adj) {
        room_name = name;
        room_adjacency = room_adj;
    }

    public String[] getRoomAdj() {
        return room_adjacency;
    }

    public String getName() {
        return room_name;
    }
    
}