package bin.main.classes;

import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ControlView {
    //Returns the game control panel as JPanel
    //Future iteration: parameter for an array with the rooms available
    public JPanel display() {
        JPanel control_view = new JPanel();
        control_view.setBorder(BorderFactory.createLineBorder(Color.black, 5));
        control_view.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        c.anchor = GridBagConstraints.NORTHWEST;

        String[] rooms_available = {"Computer Lab", "Eat Club", "CECS Conference Room", "North Hall", "South Hall"};
        
        //Packs all the action buttons in a JPanel using a GridLayout
        JPanel act_buttons = new JPanel(new GridLayout(3, 1, 0, 5));
        //Draw Card Button (currently disabled)
        JButton draw_button = new JButton("Draw Card");
        /*
        c.gridx = c.gridy = 0;
        c.insets = new Insets(0, 10, 10, 0);
        c.weightx = 0.25;
        */
        draw_button.setEnabled(false);
        //control_view.add(draw_button, c);
        
        //Move Button
        JButton move_button = new JButton("Move");
        move_button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //Moves the player to the room selected from the room list
            }
        });
        //c.gridy = 1;
        //control_view.add(move_button, c);

        //Play Card Button (currently disabled)
        JButton play_button = new JButton("Play Card");
        play_button.setEnabled(false);
        //c.gridy = 2;
        //control_view.add(play_button, c);
        act_buttons.add(draw_button);
        act_buttons.add(move_button);
        act_buttons.add(play_button);
        control_view.add(act_buttons, c);

        //Rooms available scrollable list
        JList<String> room_list = new JList<>(rooms_available);
        room_list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        room_list.setLayoutOrientation(JList.VERTICAL);
        room_list.setVisibleRowCount(8);
        JScrollPane room_list_scroller = new JScrollPane(room_list);
        room_list_scroller.setMinimumSize(new Dimension(200, 80));
        c.gridy = 3;
        //c.insets = new Insets(0, 10, 0, 0);
        control_view.add(room_list_scroller, c);

        
        //Display current card
        JPanel current_card = new JPanel();
        JTextArea card_placeholder = new JTextArea("This will contain a card.");
        current_card.setBorder(BorderFactory.createLineBorder(Color.black));
        current_card.add(card_placeholder);
        c.fill = GridBagConstraints.VERTICAL;
        c.gridx = 1;
        c.gridy = 0;
        c.insets = new Insets(0, 10, 0, 10);
        c.weightx = 5;
        control_view.add(current_card, c);
        
        //Displays current statistics of the players
        
        JTextArea current_stats = new JTextArea(
            "\tLearning\tCraft\tIntegrity\tQuality Points\n" + 
            "Matt\t6\t6\t6\t0\n" + 
            "Amanda\t6\t6\t6\t0\n" +
            "Habib\t6\t6\t6\t0\n\n" +
            "Cards in deck:\t50" +
            "\tDiscards out of play: \t0\n" +
            "You are Amanda and you are in the South Hall" 
        );
        current_stats.setEditable(false);
        current_stats.setBorder(BorderFactory.createLineBorder(Color.black));
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 2;
        c.gridy = 0;
        //c.gridheight = 2;
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
        
        return control_view;
    }
}