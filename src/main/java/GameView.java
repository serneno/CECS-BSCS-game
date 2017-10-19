package bin.main.classes;

import java.awt.*;
import javax.swing.*;
//Main class containg everything in the game view
public class GameView {
    public static MapModel map = new MapModel();
    // Adds all the components into the main window
    public static void addComponents(Container frame) {
        frame.setLayout(new BoxLayout(frame, BoxLayout.PAGE_AXIS));
        //Frame layout
        /*
        frame.setLayout(new BorderLayout());
        JPanel gameview = new JPanel();
        gameview.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        c.fill = GridBagConstraints.BOTH;
        c.anchor = GridBagConstraints.FIRST_LINE_START;
        */

        // Map View Panel
        MapView mv = new MapView(map);
        JScrollPane map_scroll = mv.display();
        //map_scroll.setAlignmentX(Component.LEFT_ALIGNMENT);
        map_scroll.setAlignmentX(JScrollPane.RIGHT_ALIGNMENT);
        /*
        // GridBagLayout constraints for Map Panel
        c.gridwidth = GridBagConstraints.REMAINDER;
        c.gridx = 0;
        c.gridy = 0;
        c.weightx = 1;
        c.weighty = 0.8;
        // Add Map Panel into Main JFrame
        gameview.add(map_scroll, c);*/

        // Game Controls Panel
        ControlView gc = new ControlView(map);
        JPanel game_control = gc.display();
        game_control.setAlignmentX(Component.RIGHT_ALIGNMENT);
        //map_scroll.setMaximumSize(new Dimension(Integer.MAX_VALUE, map_scroll.getMinimumSize().height));
        //game_control.setMaximumSize(new Dimension(Integer.MAX_VALUE, game_control.getMinimumSize().height));
        /*
        // GridBagLayout constraints for Game Control Panel
        c.fill = GridBagConstraints.BOTH;
        c.gridy = 1;
        c.weighty = 0.2;
        // Add Game Control Panel into Main JFrame
        gameview.add(game_control, c);
        frame.add(gameview);
        */
        frame.add(map_scroll);
        frame.add(game_control);
    }
 
    // Creates the GUI for the game
    private static void displayGame() {
        // Sets up the game frame
        JFrame frame = new JFrame("College Hustlers");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        // Sets the frame to fullsreen
        //frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        // Adds all the components into the main JFrame
        addComponents(frame.getContentPane());
        // Arrange the components inside the window
        frame.pack();
        // Makes the frame visible
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