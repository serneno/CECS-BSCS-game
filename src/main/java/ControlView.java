package classes;

import java.util.*;
import java.awt.*;
import javax.swing.*;

public class ControlView {
    //Returns the game control panel as JPanel
    //Future iteration: parameter for an array with the rooms available
    public JPanel display() {
        JPanel control_view = new JPanel();
        control_view.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        c.fill = GridBagConstraints.HORIZONTAL;
        //c.anchor = GridBagConstraints.NORTHWEST;

        String[] rooms_available = {"Computer Lab", "Eat Club", "CECS Conference Room", "North Hall", "South Hall"};
        
        JButton draw_button = new JButton("Draw Card");
        c.gridx = c.gridy = 0;
        c.insets = new Insets(0, 0, 10, 0);
        control_view.add(draw_button, c);
        
        JButton move_button = new JButton("Move");
        c.gridy = 1;
        control_view.add(move_button, c);

        JButton play_button = new JButton("Play Card");
        c.gridy = 2;
        control_view.add(play_button, c);

        //Rooms available scrollable list
        JList<String> room_list = new JList<>(rooms_available);
        room_list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        room_list.setLayoutOrientation(JList.VERTICAL);
        room_list.setVisibleRowCount(8);
        JScrollPane room_list_scroller = new JScrollPane(room_list);
        room_list_scroller.setPreferredSize(new Dimension(250, 80));
        c.gridy = 3;
        c.insets = new Insets(0, 0, 0, 0);
        control_view.add(room_list_scroller, c);

        //Display current card
        JPanel current_card = new JPanel();
        c.gridx = 1;
        c.gridy = 0;
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
        c.gridx = 3;
        c.gridy = 0;
        control_view.add(current_stats, c);

        JTextArea game_log = new JTextArea("Human player is Amanda"); 
        game_log.setEditable(false);
        c.gridy = 1;
        control_view.add(game_log, c);
        return control_view;
    }
}