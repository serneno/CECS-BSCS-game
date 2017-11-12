package bin.main.classes;

import javax.swing.*;

//Main Parent class representing a Card
public class Cardm00 extends Card {

    public Cardm00() {
        card_img = new ImageIcon("./resources/cardm00.png");
        card_ID = 0;
    }

    //If player in ECS 302 or ECS 308, get 1 Learning Chip
    public void play(PlayerModel player) {
        if(player.getCurrentRoom().getName().equals("ECS 302") || player.getCurrentRoom().getName().equals("ECS 308")) {
            player.addLearning(1);
            System.out.println("Cardm00");
        }
    }

}