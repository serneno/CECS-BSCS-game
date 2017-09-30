import java.awt.*;
import javax.swing.*;

public class GameView implements Runnable{
    public void run() {
        // Create the main window
        JFrame f = new JFrame("College Hustlers");
        f.setExtendedState(JFrame.MAXIMIZED_BOTH);
        // Sets the behavior for when the window is closed
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //Frame layout
        f.setLayout(new FlowLayout());

        //Scrollable Map Display
        JPanel map = new JPanel();
        ImageIcon csulb_map = new ImageIcon("CSULBMap5_1200x1437.png");
        JLabel map_img = new JLabel(csulb_map);
        //JPanel scroll = new JPanel();
        JScrollPane map_scroll = new JScrollPane(map_img);
        map.setLayout(new FlowLayout());
        map.add(map_img);
        map.add(map_scroll);

        //Play Area
        JPanel main = new JPanel();
        JPanel play = new JPanel();
        play.setLayout(new FlowLayout());
        play.add(new JButton("Draw Card"));
        play.add(new JButton("Move"));
        play.add(new JButton("Play Card"));
        play.add(new JTextArea("Rooms Available:"));
        
        JPanel info = new JPanel();
        info.setLayout(new FlowLayout()); 
        info.add(new JTextArea("stats"));
        info.add(new JTextArea("Task taken"));

        main.add(play);
        main.add(info);

        // Add JPanels into JFrame
        f.add(map);
        f.add(main);
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