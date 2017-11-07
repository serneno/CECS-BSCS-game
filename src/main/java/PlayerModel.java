package bin.main.classes;

import java.awt.Color;
import javax.swing.*;

//Represents a Player
public class PlayerModel extends RoomListModel {
    JLabel player;      //To represent on the game board
    boolean isHuman;    //True if Human, False if AI
    int craft_chip;     //number of Craft Chips
    int integrity_chip; //number of Integrity Chips
    int learning_chip;  //Number of Learning Chips
    int quality_points; //Number of Quality Points

    public PlayerModel(String name, boolean isHuman) {
        player = new JLabel(name);
        this.isHuman = isHuman;
        craft_chip = 0;
        integrity_chip = 0;
        learning_chip = 0;
        quality_points = 0;
        player.setForeground(Color.red);    //Current Default Color
    }

    //Returns the player as a JLabel for movement on game board
    public JLabel getPlayer() {
        return player;
    }

    //Returns true if the player is Human
    //False otherwise
    public boolean isHuman() {
        return isHuman;
    }

    //Returns the number of Craft Chips the player possesses
    public int getCraft() {
        return craft_chip;
    }

    //Returns the number of Integrity Chips the player possesses
    public int getIntegrity() {
        return integrity_chip;
    }

    //Returns the number of Learning Chips the player possesses
    public int getLearning() {
        return learning_chip;
    }

    //Returns the number of Quality Points the lpayer possesses
    public int getQuality() {
        return quality_points;
    }
}