package bin.main.classes;

import javax.swing.*;

//Main Parent class representing a Card
public class Cardm01 extends Card {

    public Cardm01() {
        card_img = new ImageIcon("./resources/cardm01.png");
        card_ID = 1;
    }

    //If player in Library, get 1 Learning Chip or 1 Integrity Chip
    public void play(PlayerModel player) {
        if (player.getCurrentRoom().getName().equals("Library")) {
            //Needs to have a dialog pop-up to choose chip
            //player.addLearning(1);
            //player.addIntegrity(1);
        }
    }
}