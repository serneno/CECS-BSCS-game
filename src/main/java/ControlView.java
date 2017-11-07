package bin.main.classes;

import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ControlView {
    String[] rooms_available;
    DefaultListModel room_model; //used to dynamically change room list
    MapModel map;
    JList room_list; //displays the rooms available to move
    JPanel curr_room_panel; //current panel the human player is in
    Container game_frame;
    PlayerModel[] players;
    RoomListModel rlm;
    final static int MAX_MOVE = 3; //maximum number of moves

    public ControlView(MapModel map_model, Container frame) {
        map = map_model;
        game_frame = frame;
        room_model = new DefaultListModel();
        rlm = new RoomListModel();
        rlm.setCurrentRoom("ECS 308"); //sets default room players start in
        rooms_available = rlm.getCurrentRoom().getRoomAdj();
        curr_room_panel = map.getRoomMap().get("ECS 308");
    }

    //Returns the game control panel as JPanel
    public JPanel display() {
        player_init(); //initializes players

        JPanel control_view = new JPanel();
        control_view.setBorder(BorderFactory.createLineBorder(Color.black, 5));
        control_view.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        //c.fill = GridBagConstraints.HORIZONTAL;
        c.anchor = GridBagConstraints.NORTHWEST;
        
        //Packs all the action buttons in a JPanel using a GridLayout as well as its respective GridBagConstraints
        JPanel act_buttons = new JPanel(new GridLayout(3, 1, 0, 5));
        c.gridx = c.gridy = 0;
        c.insets = new Insets(10, 10, 10, 10);
        c.ipadx = c.ipady = 10;
        c.weightx = 0.1;

        //Draw Card Button (currently disabled)
        JButton draw_button = new JButton("Draw Card");
        draw_button.setEnabled(false);
        
        //Move Button
        JButton move_button = new JButton("Move");
        move_button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //Updates the room list after a move
                //Moves the player on the game board visually
                String room_moved = updateRoomList();
                if(!room_moved.equals("")) {
                    movePlayer(room_moved, players[0].getPlayer());
                    //Moves the AI
                    moveAI();
                }
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
        c.insets = new Insets(0, 10, 0, 10);
        c.gridy = 1;
        control_view.add(room_list(), c);
   
        //Display current card
        JPanel current_card = new JPanel();
        JTextArea card_placeholder = new JTextArea("This will contain a card.");
        current_card.setBorder(BorderFactory.createLineBorder(Color.black));
        current_card.add(card_placeholder);
        c.fill = GridBagConstraints.VERTICAL;
        c.gridx = 1;
        c.gridy = 0;
        c.insets = new Insets(10, 10, 10, 10);
        c.weightx = 0.1;
        control_view.add(current_card, c);     
        
        //For future iteration
        
        //Displays current statistics of the players (currently doesn't work as not needed for first iteration)
        JTextArea current_stats = new JTextArea(
            "\tLearning\tCraft\tIntegrity\tQuality Points\n" + 
            players[0].getPlayer().getText() + "\t6\t6\t6\t0\n" + 
            players[1].getPlayer().getText() + "\t6\t6\t6\t0\n" +
            players[2].getPlayer().getText() + "\t6\t6\t6\t0\n\n" +
            "Cards in deck:\t50" +
            "\tDiscards out of play: \t0\n" +
            "You are " + players[0].getPlayer().getText() +" and you are in the " + players[0].getCurrentRoom().getName() 
        );
        current_stats.setEditable(false);
        current_stats.setBorder(BorderFactory.createLineBorder(Color.black));
        c.fill = GridBagConstraints.BOTH;
        c.gridx = 2;
        c.gridy = 0;
        c.ipadx = c.ipady = 20;
        c.insets = new Insets(10, 10, 10, 10);
        c.weightx = 0.8;
        control_view.add(current_stats, c);

        JTextArea current_play = new JTextArea("Human player is" + players[0].getPlayer().getText());
        current_play.setBorder(BorderFactory.createLineBorder(Color.black)); 
        current_play.setEditable(false);
        JScrollPane current_play_scroll = new JScrollPane(current_play);
        c.gridy = 1;

        control_view.add(current_play, c);    
        return control_view;
    }

    //Initializes players
    //Will include in the future parameter for number of players and chooses a human player randomly
    public void player_init() {
        players = new PlayerModel[3];
        players[0] = new PlayerModel("Amanda", true);
        players[1] = new PlayerModel("Matt", false);
        players[2] = new PlayerModel("Karen", false);

        for(int i = 0; i < players.length; i++) {
            players[i].setCurrentRoom("ECS 308");
            curr_room_panel.add(players[i].getPlayer());
        }
    }

    //Updates the room list after every move
    //Returns the room to be moved too
    public String updateRoomList() {
        String selected_room = (String)room_list.getSelectedValue();
        if(selected_room == null) { //null pointer exception
            JOptionPane.showMessageDialog(game_frame,
            "Please select a room.",
            "",
            JOptionPane.WARNING_MESSAGE);
        }
        else {
            String room_moved = selected_room;
            rlm.setCurrentRoom(room_moved);
            Room curr_room = rlm.getCurrentRoom();
            rooms_available = curr_room.getRoomAdj();
            room_model.removeAllElements();
            for(int i = 0; i < rooms_available.length; i++) {
                room_model.addElement(rooms_available[i]);
            }
            return room_moved;
        }
        return "";
    }

    //Moves the Human player
    public void movePlayer(String room, JLabel p1) {
        curr_room_panel.remove(p1); //removes human player, currently set to p1
        curr_room_panel.repaint();
        curr_room_panel.validate();

        curr_room_panel = map.getRoomMap().get(room);
        curr_room_panel.add(p1);
        curr_room_panel.repaint();
        curr_room_panel.validate();
    }

    //Moves the players
    public void moveAI() {   
        for(PlayerModel p : players) {
            if(p.isHuman) {
                
            }
            else {
                String curr_room = p.getCurrentRoom().getName();
                String[] room_adj = p.room_list.get(curr_room).getRoomAdj();
                int room_adj_length = room_adj.length;
                int new_room_ind = (int) (Math.random() * room_adj_length);
                String new_room = room_adj[new_room_ind];
                p.setCurrentRoom(new_room);
                Container ai_curr_room = p.getPlayer().getParent();
                ai_curr_room.remove(p.getPlayer());
                ai_curr_room.repaint();
                ai_curr_room.validate();

                ai_curr_room = map.getRoomMap().get(new_room);
                ai_curr_room.add(p.getPlayer());
                ai_curr_room.repaint();
                ai_curr_room.validate();
            }
        }
    }

    //Returns available rooms to move list
    public JScrollPane room_list() {
        for(int i = 0; i < rooms_available.length; i++) {
            room_model.addElement(rooms_available[i]);
        }
        room_list = new JList(room_model);
        room_list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        room_list.setLayoutOrientation(JList.VERTICAL);
        room_list.setVisibleRowCount(8);
        JScrollPane room_list_scroller = new JScrollPane(room_list);
        room_list_scroller.setPreferredSize(new Dimension(200, 150));
        room_list_scroller.setMinimumSize(new Dimension(100, 80));

        return room_list_scroller;
    }
}