package bin.main.classes;

import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ControlView {
    String[] rooms_available;
    DefaultListModel room_model = new DefaultListModel();
    MapModel map;
    JList room_list;
    JPanel curr_room_panel;
    RoomListModel rlm = new RoomListModel();

    public ControlView(MapModel map_model) {
        map = map_model;
    }
    //Returns the game control panel as JPanel
    //Future iteration: parameter for an array with the rooms available
    public JPanel display() {
        JPanel control_view = new JPanel();
        control_view.setBorder(BorderFactory.createLineBorder(Color.black, 5));
        control_view.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        c.anchor = GridBagConstraints.NORTHWEST;

        rlm.setCurrentRoom("ECS 308");
        Room curr_room = rlm.getCurrentRoom();
        //System.out.println(curr_room.room_name + " "); 
        rooms_available = curr_room.getRoomAdj(); //works
        
        //Packs all the action buttons in a JPanel using a GridLayout as well as its respective GridBagConstraints
        JPanel act_buttons = new JPanel(new GridLayout(3, 1, 0, 5));
        c.insets = new Insets(10, 10, 10, 10);
        c.ipadx = c.ipady = 10;

        //Draw Card Button (currently disabled)
        JButton draw_button = new JButton("Draw Card");
        draw_button.setEnabled(false);
        
        //Adds players and puts them  into the default room (Currently ECS 308)
        PlayerModel pm1 = new PlayerModel("Amanda", true);
        JLabel p1 = pm1.getPlayer();
        PlayerModel pm2 = new PlayerModel("Matt", false);
        JLabel p2 = pm2.getPlayer();
        PlayerModel pm3 = new PlayerModel("Karen", false);
        JLabel p3 = pm3.getPlayer();
        curr_room_panel = map.getRoomMap().get("ECS 308");
        curr_room_panel.add(p1);
        curr_room_panel.add(p2);
        curr_room_panel.add(p3);

        //Move Button
        JButton move_button = new JButton("Move");
        move_button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //Updates the room list after a move
                movePlayer(updateRoomList(), p1);
                //Moves the player on the game board visually
            }
        });

        //Play Card Button (currently disabled)
        JButton play_button = new JButton("Play Card");
        play_button.setEnabled(false);

        act_buttons.add(draw_button);
        act_buttons.add(move_button);
        act_buttons.add(play_button);
        control_view.add(act_buttons, c);

        //Rooms available scrollable list
        for(int i = 0; i < rooms_available.length; i++) {
            room_model.addElement(rooms_available[i]);
        }
        room_list = new JList(room_model);
        room_list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        room_list.setLayoutOrientation(JList.VERTICAL);
        room_list.setVisibleRowCount(8);
        JScrollPane room_list_scroller = new JScrollPane(room_list);
        room_list_scroller.setPreferredSize(new Dimension(100, 100));
        room_list_scroller.setMinimumSize(new Dimension(100, 80));
        c.gridy = 1;
        control_view.add(room_list_scroller, c);
   
        //Display current card
        JPanel current_card = new JPanel();
        JTextArea card_placeholder = new JTextArea("This will contain a card.");
        current_card.setBorder(BorderFactory.createLineBorder(Color.black));
        current_card.add(card_placeholder);
        c.fill = GridBagConstraints.VERTICAL;
        c.gridx = 1;
        c.gridy = 0;
        c.insets = new Insets(10, 20, 10, 20);
        c.weightx = 0.5;
        control_view.add(current_card, c);
        
        //For future iteration
        /*
        //Displays current statistics of the players (currently doesn't work as not needed for first iteration)
        JTextArea current_stats = new JTextArea(
            "\tLearning\tCraft\tIntegrity\tQuality Points\n" + 
            "Matt\t6\t6\t6\t0\n" + 
            "Amanda\t6\t6\t6\t0\n" +
            "Habib\t6\t6\t6\t0\n\n" +
            "Cards in deck:\t50" +
            "\tDiscards out of play: \t0\n" +
            "You are Amanda and you are in the " + curr_room.room_name 
        );
        current_stats.setEditable(false);
        current_stats.setBorder(BorderFactory.createLineBorder(Color.black));
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 2;
        c.gridy = 0;
        //c.ipadx = c.ipady = 20;
        c.insets = new Insets(10, 10, 10, 10);
        c.weightx = 0.5;
        control_view.add(current_stats, c);

        JTextArea game_log = new JTextArea("Human player is Amanda");
        game_log.setBorder(BorderFactory.createLineBorder(Color.black)); 
        game_log.setEditable(false);
        //c.gridheight = 1;
        c.gridy = 1;
        c.weightx = 0;
        control_view.add(game_log, c);
    */    
        return control_view;
    }

    //Updates the room list after every move
    public String updateRoomList() {
        String room_moved = (String)room_list.getSelectedValue(); 
        rlm.setCurrentRoom(room_moved);
        Room curr_room = rlm.getCurrentRoom();
        rooms_available = curr_room.getRoomAdj();
        room_model.removeAllElements();
        for(int i = 0; i < rooms_available.length; i++) {
            room_model.addElement(rooms_available[i]);
        }
        return room_moved;
    }

    public void movePlayer(String room, JLabel p1) {
        System.out.println(room);
        curr_room_panel.remove(p1); //removes human player, currently set to p1
        curr_room_panel = map.getRoomMap().get(room);
        curr_room_panel.add(p1);
        
        curr_room_panel.repaint();
        curr_room_panel.revalidate();
    }
}