package bin.main.classes;

import java.awt.*;
import javax.swing.*;
// Scrollable Map Display
public class MapView {
    public JScrollPane display() {
        ImageIcon game_map = new ImageIcon("./resources/Game_Map.png");
        JLabel map_img = new JLabel(game_map);
        JScrollPane map_scroll = new JScrollPane(map_img);
        map_scroll.setPreferredSize(new Dimension(map_scroll.getWidth(), 500));

        return map_scroll;
    }
}