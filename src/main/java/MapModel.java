package bin.main.classes;

import java.util.*;
import java.awt.*;
import javax.swing.*;

public class MapModel {
    private Map<String, JPanel> room_map = new HashMap<>();

    public MapModel() {
        generateMap();
    }

    public void generateMap() {
        //Sets up all the rooms
        JPanel GeorgeAllenField = new JPanel();
        GeorgeAllenField.setLayout(new BoxLayout(GeorgeAllenField, BoxLayout.PAGE_AXIS));
        GeorgeAllenField.setOpaque(false);
        GeorgeAllenField.setBounds(20, 70, 200, 150);
        room_map.put("George Allen Field", GeorgeAllenField);

        JPanel JapaneseGarden = new JPanel();
        JapaneseGarden.setLayout(new BoxLayout(JapaneseGarden, BoxLayout.PAGE_AXIS));
        JapaneseGarden.setOpaque(false);
        JapaneseGarden.setBounds(350, 10, 200, 150);
        room_map.put("Japanese Garden", JapaneseGarden);
        
        JPanel Pyramid = new JPanel();
        Pyramid.setLayout(new BoxLayout(Pyramid, BoxLayout.PAGE_AXIS));
        Pyramid.setOpaque(false);
        Pyramid.setBounds(350, 200, 200, 150);
        room_map.put("Pyramid", Pyramid);

        JPanel StudentParking = new JPanel();
        StudentParking.setLayout(new BoxLayout(StudentParking, BoxLayout.PAGE_AXIS));
        StudentParking.setOpaque(false);
        StudentParking.setBounds(720, 50, 200, 150);
        room_map.put("Student Parking", StudentParking);

        JPanel WestWalkway = new JPanel();
        WestWalkway.setLayout(new BoxLayout(WestWalkway, BoxLayout.PAGE_AXIS));
        WestWalkway.setOpaque(false);
        WestWalkway.setBounds(20, 460, 200, 150);
        room_map.put("West Walkway", WestWalkway);

        JPanel RECCenter = new JPanel();
        RECCenter.setLayout(new BoxLayout(RECCenter, BoxLayout.PAGE_AXIS));
        RECCenter.setOpaque(false);
        RECCenter.setBounds(350, 400, 200, 150);
        room_map.put("REC Center", RECCenter);

        JPanel ForbiddenParking = new JPanel();
        ForbiddenParking.setLayout(new BoxLayout(ForbiddenParking, BoxLayout.PAGE_AXIS));
        ForbiddenParking.setOpaque(false);
        ForbiddenParking.setBounds(750, 420, 200, 150);
        room_map.put("Forbidden Parking", ForbiddenParking);

        JPanel CECSConference = new JPanel();
        CECSConference.setLayout(new BoxLayout(CECSConference, BoxLayout.PAGE_AXIS));
        CECSConference.setOpaque(false);
        CECSConference.setBounds(890, 630, 150, 150);
        room_map.put("CECS Conference", CECSConference);

        JPanel ComputerLab = new JPanel();
        ComputerLab.setLayout(new BoxLayout(ComputerLab, BoxLayout.PAGE_AXIS));
        ComputerLab.setOpaque(false);
        ComputerLab.setBounds(130, 630, 200, 150);
        room_map.put("Computer Lab", ComputerLab);

        JPanel EastWalkway = new JPanel();
        EastWalkway.setLayout(new BoxLayout(EastWalkway, BoxLayout.PAGE_AXIS));
        EastWalkway.setOpaque(false);
        EastWalkway.setBounds(1045, 770, 150, 150);
        room_map.put("East Walkway", EastWalkway);

        JPanel EatClub = new JPanel();
        EatClub.setLayout(new BoxLayout(EatClub, BoxLayout.PAGE_AXIS));
        EatClub.setOpaque(false);
        EatClub.setBounds(735, 630, 150, 150);
        room_map.put("Eat Club", EatClub);

        JPanel ECS302 = new JPanel();
        ECS302.setLayout(new BoxLayout(ECS302, BoxLayout.PAGE_AXIS));
        ECS302.setOpaque(false);
        ECS302.setBounds(440, 630, 200, 150);
        room_map.put("ECS 302", ECS302);

        JPanel NorthHall = new JPanel();
        NorthHall.setLayout(new BoxLayout(NorthHall, BoxLayout.PAGE_AXIS));
        NorthHall.setOpaque(false);
        NorthHall.setBounds(130, 820, 400, 120);
        room_map.put("North Hall", NorthHall);

        JPanel RoomOfRetirement = new JPanel();
        RoomOfRetirement.setLayout(new BoxLayout(RoomOfRetirement, BoxLayout.PAGE_AXIS));
        RoomOfRetirement.setOpaque(false);
        RoomOfRetirement.setBounds(130, 960, 200, 150);
        room_map.put("Room Of Retirement", RoomOfRetirement);

        JPanel SouthHall = new JPanel();
        SouthHall.setLayout(new BoxLayout(SouthHall, BoxLayout.PAGE_AXIS));
        SouthHall.setOpaque(false);
        SouthHall.setBounds(590, 820, 400, 120);
        room_map.put("South Hall", SouthHall);

        JPanel Elevators = new JPanel();
        Elevators.setLayout(new BoxLayout(Elevators, BoxLayout.PAGE_AXIS));
        Elevators.setOpaque(false);
        Elevators.setBounds(440, 980, 120, 150);
        room_map.put("Elevators", Elevators);

        JPanel ECS308 = new JPanel();
        ECS308.setLayout(new BoxLayout(ECS308, BoxLayout.PAGE_AXIS));
        ECS308.setOpaque(false);
        ECS308.setBounds(610, 980, 200, 150);
        room_map.put("ECS 308", ECS308); 
        
        JPanel LactationLounge = new JPanel();
        LactationLounge.setLayout(new BoxLayout(LactationLounge, BoxLayout.PAGE_AXIS));
        LactationLounge.setOpaque(false);
        LactationLounge.setBounds(870, 995, 150, 150);
        room_map.put("Lactation Lounge", LactationLounge);  

        JPanel Library = new JPanel();
        Library.setLayout(new BoxLayout(Library, BoxLayout.PAGE_AXIS));
        Library.setOpaque(false);
        Library.setBounds(60, 1230, 200, 150);
        room_map.put("Library", Library);

        JPanel LA5 = new JPanel();
        LA5.setLayout(new BoxLayout(LA5, BoxLayout.PAGE_AXIS));
        LA5.setOpaque(false);
        LA5.setBounds(340, 1180, 300, 150);
        room_map.put("LA 5", LA5);

        JPanel BratwurstHall = new JPanel();
        BratwurstHall.setLayout(new BoxLayout(BratwurstHall, BoxLayout.PAGE_AXIS));
        BratwurstHall.setBounds(820, 1180, 300, 150);
        BratwurstHall.setOpaque(false);
        room_map.put("Bratwurst Hall", BratwurstHall);
    }

    public Map<String, JPanel> getRoomMap() {
        return room_map;
    }   
}