package bin.main.classes;

import javax.swing.ImageIcon;

//CECS 100
public class Cardm05 extends Card {
    
        public Cardm05() {
            card_img = new ImageIcon("./resources/cardm05.png");
            card_ID = 5;
            card_name = "CECS 100";
        }
    
        //If player in ECS 308, get 1 Craft Chip
        public void play(PlayerModel player) {
            if(player.getCurrentRoom().getName().equals("ECS 308")) {
                player.addCraft(1);
                System.out.println(player.getPlayer().getName() + " played " + getName() + "for 1 Craft Chip");
            }
        }
    }