package bin.main.classes;

import javax.swing.ImageIcon;

//Professor Murgolo's CECS 174 Class
public class Cardm04 extends Card {
    
        public Cardm04() {
            card_img = new ImageIcon("./resources/cardm04.png");
            card_ID = 4;
            card_name = "Professor Murgolo's CECS 174 Class";
        }
    
        //If player in ECS 302, get 1 Learning Chip
        public void play(PlayerModel player) {
            if(player.getCurrentRoom().getName().equals("ECS 302")) {
                player.addLearning(1);
                System.out.println(player.getPlayer().getName() + " played " + getName() + " for 1 Learning Chip");
            }
        }
    }