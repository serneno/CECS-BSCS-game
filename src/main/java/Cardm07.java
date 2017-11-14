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
        public String play(PlayerModel player, CardDeckModel deck, RoomListModel rlm) {
            if(player.getCurrentRoom().getName().equals("Elevators")) {
                player.addIntegrity(1);
                return player.getPlayer().getText() + " played " + getName() + " for 1 Integrity Chip";
            }
            return player.getPlayer().getText() + " played " + getName() + " for nothing";
        }
    }