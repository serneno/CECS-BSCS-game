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
        String[] rooms_available = {"Computer Lab", "Eat Club", "CECS Conference Room", "North Hall", "South Hall"};
        JButton draw_button = new JButton("Draw Card");
        JButton move_button = new JButton("Move");
        JButton play_button = new JButton("Play Card");

        //Rooms available scrollable list
        JList<String> room_list = new JList<>(rooms_available);
        room_list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        room_list.setLayoutOrientation(JList.VERTICAL);
        room_list.setVisibleRowCount(8);
        JScrollPane room_list_scroller = new JScrollPane(room_list);
        room_list_scroller.setPreferredSize(new Dimension(250, 80));

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
        JTextArea game_log = new JTextArea("Human player is Amanda"); 
        game_log.setEditable(false);

        //Adds all the components in the Game Control Panel
        control_view.add(draw_button);
        control_view.add(move_button);
        control_view.add(play_button);
        control_view.add(room_list_scroller);
        control_view.add(current_stats);
        control_view.add(game_log);
        return control_view;
    }
}