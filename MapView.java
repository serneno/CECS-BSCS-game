import java.awt.*;
import javax.swing.*;
// Scrollable Map Display
public class MapView {
    public JScrollPane display() {
        ImageIcon csulb_map = new ImageIcon("CSULBMap5_1200x1437.png");
        JLabel map_img = new JLabel(csulb_map);
        JScrollPane map_scroll = new JScrollPane(map_img);
        map_scroll.setPreferredSize(new Dimension(map_scroll.getWidth(), 500));

        return map_scroll;
    }
}