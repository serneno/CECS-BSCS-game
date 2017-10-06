package bin.main.classes;

import java.awt.*;
import javax.swing.*;
//Main class containg everything in the game view
public class GameView {
    // Adds all the components into the main window
    public static void addComponents(Container frame) {
        //Frame layout
        frame.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        c.fill = GridBagConstraints.BOTH;
        c.anchor = GridBagConstraints.NORTHWEST;

        // Map View Panel
        MapView mv = new MapView();
        JScrollPane map_scroll = mv.display();
        // GridBagLayout constraints for Map Panel
        c.gridx = c.gridy = 0;
        c.gridwidth = c.gridheight = 1;
        c.weightx = c.weighty = 80;
        // Add Map Panel into Main JFrame
        frame.add(map_scroll, c);

        // Game Controls Panel
        ControlView gc = new ControlView();
        JPanel game_control = gc.display();
        // GridBagLayout constraints for Game Control Panel
        c.gridy = 1;
        c.weightx = c.weighty = 20;
        //c.insets = new Insets(2, 2, 2, 2);
        // Add Game Control Panel into Main JFrame
        frame.add(game_control, c);
    }
 
    // Creates the GUI for the game
    private static void displayGame() {
        // Sets up the game frame
        JFrame frame = new JFrame("College Hustlers");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        // Sets the frame to fullsreen
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
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