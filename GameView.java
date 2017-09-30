import java.awt.FlowLayout;
import javax.swing.*;

public class GameView implements Runnable{
    public void run() {
        // Create the window
        JFrame f = new JFrame("College Hustlers");
        // Sets the behavior for when the window is closed
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        // Add a layout manager so that the button is not placed on top of the label
        f.setLayout(new FlowLayout());
        // Add playing button
        f.add(new JButton("Draw Card"));
        f.add(new JButton("Move"));
        f.add(new JButton("Play Card"));
        f.add(new JTextField("Rooms Available:", 20));
        // Arrange the components inside the window
        f.pack();
        // By default, the window is not visible. Make it visible.
        f.setVisible(true);
    }
 
    public static void main(String[] args) {
        GameView gv = new GameView();
        // Schedules the application to be run at the correct time in the event queue.
        SwingUtilities.invokeLater(gv);
    }
}