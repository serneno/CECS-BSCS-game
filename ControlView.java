//Code for displaying the game controls of the game
import java.awt.*;
import javax.swing.*;
public class ControlView {
    ArrayList<String> rooms_available = new Arraylist<String>("Computer Lab", "Eat Club", "CECS Conference Room", "North Hall", "South Hall");
    JButton draw_button = new JButton("Draw Card");
    JButton move_button = new JButton("Move");
    JButton play_button = new JButton("Play Card");
    JList room_list = new JList(rooms_available.toArray());
    room_list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    room_list.setLayoutOrientation(JList.VERTICAL);
    room_list.setVisibleRowCount(8);

    JScrollPane room_list_scroller = new JScrollPane(room_list);
    //room_list_scroller.setPreferredSize(new Dimension(250, 80));
}