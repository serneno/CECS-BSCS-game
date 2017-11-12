package bin.main.classes;

import javax.swing.ImageIcon;

//Finding the Lab
public class Cardm07 extends Card {
    
        public Cardm07() {
            card_img = new ImageIcon("./resources/cardm07.png");
            card_ID = 7;
            card_name = "Finding the Lab";
        }
    
        //If player in Elevators, get 1 Integrity Chip
        public void play(PlayerModel player) {
            if(player.getCurrentRoom().getName().equals("Elevators")) {
                player.addIntegrity(1);
                System.out.println(player.getPlayer().getName() + " played " + getName() + "for 1 Integrity Chip");
            }
        }
    }