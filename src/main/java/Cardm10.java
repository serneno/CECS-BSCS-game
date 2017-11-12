package bin.main.classes;

import javax.swing.ImageIcon;

//CECS 105
public class Cardm10 extends Card {
    
        public Cardm10() {
            card_img = new ImageIcon("./resources/cardm10.png");
            card_ID = 10;
            card_name = "CECS 105";
        }
    
        //If player in ECS 302 or ECS 308, get 1 Learning Chip
        public void play(PlayerModel player) {
            if(player.getCurrentRoom().getName().equals("ECS 302") || player.getCurrentRoom().getName().equals("ECS 308")) {
                player.addLearning(1);
                System.out.println(player.getPlayer().getName() + " played " + getName() + "for 1 Learning Chip");
            }
        }
    }