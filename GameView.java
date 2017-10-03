import java.awt.*;
import javax.swing.*;
//Main class containg everything in the game view
public class GameView {
    // Adds all the components into the main window
    public static void addComponents(Container frame) {
        //Frame layout
        frame.setLayout(new BorderLayout());
        //Scrollable Map Display
        ImageIcon csulb_map = new ImageIcon("CSULBMap5_1200x1437.png");
        JLabel map_img = new JLabel(csulb_map);
        JScrollPane map_scroll = new JScrollPane(map_img);
        map_scroll.setPreferredSize(new Dimension(map_scroll.getWidth(), 500));
        // Game Controls Panel
        ControlView gc = new ControlView();
        JPanel game_control = gc.display();
        // Add JPanels into JFrame
        frame.add(map_scroll, BorderLayout.NORTH);
        frame.add(game_control, BorderLayout.SOUTH);
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