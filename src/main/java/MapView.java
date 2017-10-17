package bin.main.classes;

import java.awt.*;
import javax.swing.*;
// Scrollable Map Display
public class MapView {
    public JScrollPane display() {
        ImageIcon game_map = new ImageIcon("./resources/Game_Map.png");
        JLabel map_img = new JLabel(game_map);
        map_img.setLayout(null);

        //Adds Players onto Game Map (still testing)
        JLabel p1 = new JLabel("Amanda");
        JLabel p2 = new JLabel("Matt");
        JLabel p3 = new JLabel("Karen");
        //Insets insets = map_img.getInsets();
        Dimension size = p1.getPreferredSize();
        p1.setForeground(Color.red);
        p2.setForeground(Color.red);
        p3.setForeground(Color.red);
        p1.setBounds((int)(game_map.getIconWidth() * (0.66)), (int)(game_map.getIconHeight() * (0.67)), size.width, size.height);
        p2.setBounds(p1.getX(), p1.getY() + 20, size.width, size.height);
        p3.setBounds(p1.getX(), p2.getY() + 20, size.width, size.height);
        map_img.add(p1);
        map_img.add(p2);
        map_img.add(p3);

        JScrollPane map_scroll = new JScrollPane(map_img);
        map_scroll.setPreferredSize(new Dimension(map_scroll.getWidth(), 500));

        return map_scroll;
    }
}