package bin.main.classes;

import javax.swing.ImageIcon;

//Enjoying the Peace
public class Cardm08 extends Card {
    
        public Cardm08() {
            card_img = new ImageIcon("./resources/cardm08.png");
            card_ID = 8;
            card_name = "Enjoying the Peace";
        }
    
        //If player in Japanese Gardens, get 1 Learning or 1 Integrity Chip
        public void play(PlayerModel player) {
            if(player.getCurrentRoom().getName().equals("Japanese Gardens")) {
                //player.addIntegrity(1);
                System.out.println(player.getPlayer().getName() + " played " + getName() + "for 1 Learning Chip or 1 Integrity Chip");
            }
        }
    }