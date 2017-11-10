package bin.main.classes;
import java.util.*;

//Creates all the available rooms in the game
public class RoomListModel {
    Map<String, Room> room_list = new HashMap<String, Room>();
    Room curr_room; //current room

    public RoomListModel() {
        genRoomList();
    }

    //Generates all the rooms available
    public void genRoomList() {
        Room BratwurstHall = new Room("Bratwurst Hall", new String[] {"East Walkway", "LA5"});
        room_list.put("Bratwurst Hall", BratwurstHall);
        Room CECSConference = new Room("CECS Conference", new String[] {"South Hall"});
        room_list.put("CECS Conference", CECSConference);
        Room ComputerLab = new Room("Computer Lab", new String[] {"North Hall"});
        room_list.put("Computer Lab", ComputerLab);
        Room EastWalkway = new Room("East Walkway", new String[] {"Bratwurst Hall", "Forbidden Parking", "South Hall"});
        room_list.put("East Walkway", EastWalkway);
        Room EatClub = new Room("Eat Club", new String[] {"South Hall"});
        room_list.put("Eat Club", EatClub);
        Room ECS302 = new Room("ECS 302", new String[] {"North Hall", "South Hall"});
        room_list.put("ECS 302", ECS302);
        Room ECS308 = new Room("ECS 308", new String[] {"South Hall"});
        room_list.put("ECS 308", ECS308);
        Room Elevators = new Room("Elevators", new String[] {"LA 5", "North Hall"});
        room_list.put("Elevators", Elevators);
        Room ForbiddenParking = new Room("Forbidden Parking", new String[] {"East Walkway", "REC Center", "Student Parking"});
        room_list.put("Forbidden Parking", ForbiddenParking);
        Room GeorgeAllenField = new Room("George Allen Field", new String[] {"Japanese Garden", "Pyramid", "REC Center", "West Walkway"});
        room_list.put("George Allen Field", GeorgeAllenField);
        Room JapaneseGarden = new Room("Japanese Garden", new String[] {"George Allen Field", "Pyramid", "Student Parking"});
        room_list.put("Japanese Garden", JapaneseGarden);
        Room LA5 = new Room("LA 5", new String[] {"Bratwurst Hall", "Elevators", "Library"});
        room_list.put("LA 5", LA5);
        Room LactationLounge = new Room("Lactation Lounge", new String[] {"South Hall"});
        room_list.put("Lactation Lounge", LactationLounge);
        Room Library = new Room("Library", new String[] {"LA 5", "West Walkway"});
        room_list.put("Library", Library);
        Room NorthHall = new Room("North Hall", new String[] {"Computer Lab", "ECS 302", "Elevators", "Room Of Retirement", "South Hall", "West Walkway"});
        room_list.put("North Hall", NorthHall);
        Room Pyramid = new Room("Pyramid", new String[] {"George Allen Field", "Japanese Garden", "REC Center", "Student Parking"});
        room_list.put("Pyramid", Pyramid);
        Room RECCenter = new Room("REC Center", new String[] {"Forbidden Parking", "George Allen Field", "Pyramid", "Student Parking", "West Walkway"});
        room_list.put("REC Center", RECCenter);
        Room RoomOfRetirement = new Room("Room Of Retirement", new String[] {"North Hall"});
        room_list.put("Room Of Retirement", RoomOfRetirement);
        Room SouthHall = new Room("South Hall", new String[] {"CECS Conference", "East Walkway", "Eat Club", "ECS 302", "ECS 308", "Lactation Lounge", "North Hall"});
        room_list.put("South Hall", SouthHall);
        Room StudentParking = new Room("Student Parking", new String[] {"Forbidden Parking", "Japanese Garden", "Pyramid", "REC Center"});
        room_list.put("Student Parking", StudentParking);
        Room WestWalkway = new Room("West Walkway", new String[] {"George Allen Field", "Library", "North Hall", "REC Center"});
        room_list.put("West Walkway", WestWalkway);
    }

    public Room getCurrentRoom() {
        return curr_room;
    }

    public Room getRoom(String room) {
        return room_list.get(room);
    }

    public Map<String, Room> getRoomList() {
        return room_list;
    }

    public void setCurrentRoom(String room) {
        curr_room = room_list.get(room);
    }
}