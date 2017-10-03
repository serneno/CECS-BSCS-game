import java.util.*;
import java.awt.*;
import javax.swing.*;

public class GameView{
    //Returns the game control panel as JPanel
    //Future iteration: parameter for an array with the rooms available
    public static JPanel ControlView() {
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

    public static void addComponents(Container frame) {
        //Frame layout
        frame.setLayout(new BorderLayout());
        //Scrollable Map Display
        ImageIcon csulb_map = new ImageIcon("CSULBMap5_1200x1437.png");
        JLabel map_img = new JLabel(csulb_map);
        JScrollPane map_scroll = new JScrollPane(map_img);
        map_scroll.setPreferredSize(new Dimension(map_scroll.getWidth(), 500));
        //Game Controls Panel
        JPanel game_control = ControlView();
        // Add JPanels into JFrame
        frame.add(map_scroll, BorderLayout.NORTH);
        frame.add(game_control, BorderLayout.SOUTH);
    }
 
    //Creates the GUI for the game
    private static void displayGame() {
        //Sets up the game frame
        JFrame frame = new JFrame("College Hustlers");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //Sets the frame to fullsreen
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        //Adds all the components into the main JFrame
        addComponents(frame.getContentPane());
        // Arrange the components inside the window
        frame.pack();
        // By default, the window is not visible. Make it visible.
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        // Schedules the application to be run at the correct time in the event queue.
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                displayGame();
            }
        });
    }
}