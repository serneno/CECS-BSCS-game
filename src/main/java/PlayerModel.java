package bin.main.classes;

import java.util.*;
import java.awt.*;
import javax.swing.*;
public class PlayerModel extends RoomListModel {
    JLabel player;
    boolean isHuman;

    public PlayerModel(String name, boolean isHuman) {
        player = new JLabel(name);
        this.isHuman = isHuman;
        player.setForeground(Color.red);
    }

    public JLabel getPlayer() {
        return player;
    }

    public boolean isHuman() {
        return isHuman;
    }
}