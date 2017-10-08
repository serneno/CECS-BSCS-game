package bin.main.classes;

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
        //c.fill = GridBagConstraints.HORIZONTAL;
        c.anchor = GridBagConstraints.NORTHWEST;

        String[] rooms_available = {"Computer Lab", "Eat Club", "CECS Conference Room", "North Hall", "South Hall"};
        
        JButton draw_button = new JButton("Draw Card");
        c.gridx = c.gridy = 0;
        c.insets = new Insets(0, 0, 10, 0);
        c.weightx = 0;
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
        JTextArea card_placeholder = new JTextArea("This will contain a card.");
        current_card.setBorder(BorderFactory.createLineBorder(Color.black));
        current_card.add(card_placeholder);
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 1;
        c.gridy = 0;
        c.gridheight = 3;
        control_view.add(current_card, c);

        JPanel placeholder = new JPanel();
        c.gridx = 1;
        c.gridy = 4;
        c.gridheight = 1;
        control_view.add(placeholder, c);
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
        c.gridx = 2;
        c.gridy = 0;
        c.gridheight = 2;
        c.ipadx = c.ipady = 20;
        c.insets = new Insets(10, 10, 10, 10);
        c.weightx = 0.4;
        control_view.add(current_stats, c);

        JTextArea game_log = new JTextArea("Human player is Amanda");
        game_log.setBorder(BorderFactory.createLineBorder(Color.black)); 
        game_log.setEditable(false);
        c.gridheight = 1;
        c.gridy = 2;
        control_view.add(game_log, c);
        return control_view;
    }
}