package bin.main.classes;

import javax.swing.ImageIcon;

//CECS 100
public class Cardm00 extends Card {

    public Cardm00() {
        card_img = new ImageIcon("./resources/cardm00.png");
        card_ID = 0;
        card_name = "CECS 100";
    }

    //If player in ECS 302 or ECS 308, get 1 Learning Chip
    public void play(PlayerModel player) {
        if(player.getCurrentRoom().getName().equals("ECS 302") || player.getCurrentRoom().getName().equals("ECS 308")) {
            player.addLearning(1);
            System.out.println("Cardm00");
        }
    }
}