package bin.main.classes;

import java.awt.*;
import javax.swing.*;
// Scrollable Map Display
public class MapView {
    MapModel map;
    public MapView(MapModel map_model) {
        map = map_model;
    }
    public JScrollPane display() {
        ImageIcon game_map = new ImageIcon("./resources/Game_Map.png");
        JLabel map_img = new JLabel(game_map);
        map_img.setHorizontalAlignment(JLabel.LEFT);
        //map_img.setPreferredSize(new Dimension(1200, 1437));
        //Adds all the rooms visually on the map to store players if they are in a room
        for(String room_name : map.getRoomMap().keySet()) {
            map_img.add(map.getRoomMap().get(room_name));
        }

        //Adds Players onto Game Map (still testing)
        /*
        PlayerModel pm1 = new PlayerModel("Amanda", true);
        JLabel p1 = pm1.getPlayer();
        PlayerModel pm2 = new PlayerModel("Matt", false);
        JLabel p2 = pm2.getPlayer();
        PlayerModel pm3 = new PlayerModel("Karen", false);
        JLabel p3 = pm3.getPlayer();*/
        /*
        ECS308.add(p1);
        ECS308.add(p2);
        ECS308.add(p3);

        GeorgeAllenField.add(p1);
        GeorgeAllenField.add(p2);
        GeorgeAllenField.add(p3);
        */
        JScrollPane map_scroll = new JScrollPane(map_img);
        //map_scroll.setMaximumSize(new Dimension(Integer.MAX_VALUE, Short.MAX_VALUE));
        //map_scroll.setPreferredSize(new Dimension(1200, 1437)); //dimension of the game map
        //map_scroll.setMaximumSize(new Dimension(Short.MAX_VALUE, 500));
        //map_scroll.setMinimumSize(new Dimension(Short.MAX_VALUE, 0));
        return map_scroll;
    }
}