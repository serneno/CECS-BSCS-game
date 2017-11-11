package bin.main.classes;

import java.awt.Color;
import javax.swing.*;
import java.util.List;
import java.util.ArrayList;

//Represents a Player
public class PlayerModel {
    JLabel player;      //To represent on the game board
    boolean isHuman;    //True if Human, False if AI
    Room current_room;  //Current room the player is in
    List<Card> hand;    //Player hand
    int craft_chip;     //number of Craft Chips
    int integrity_chip; //number of Integrity Chips
    int learning_chip;  //Number of Learning Chips
    int quality_points; //Number of Quality Points

    public PlayerModel(String name, boolean isHuman, Room default_room) {
        player = new JLabel(name);
        this.isHuman = isHuman;
        current_room = default_room;
        hand = new ArrayList<Card>();
        //hand.add(new Cardm00());
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

    //Returns the current Room the player is in
    public Room getCurrentRoom() {
        return current_room;
    }

    //Returns players hand
    public List getHand() {
        return hand;
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

    //Sets the current room
    public void setCurrentRoom(Room new_room) {
        current_room = new_room;
    }
}