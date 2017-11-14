package bin.main.classes;

import javax.swing.ImageIcon;

//Parking Violation
public class Cardm09 extends Card {
    
    public Cardm09() {
        card_img = new ImageIcon("./resources/cardm09.png");
        card_ID = 9;
        card_name = "Parking Violation";
    }

    //If player in Forbidden Parking, get 1 Learning Chip
    //Can discard 1 game card for another Learning Chip
    public String play(PlayerModel player, CardDeckModel deck, RoomListModel rlm) {
        if(player.getCurrentRoom().getName().equals("Forbidden Parking")) {
            player.addLearning(1);
            return player.getPlayer().getText() + " played " + getName() + " for 1 Learning Chip";
            //Dialog pops up to discard 1 game card (choice or random not sure)
            //if(player discards another card)
            //deck.discard(player.getHand().remove((int)(Math.random() * (player.getHand().size() - 1))));
            //player.addLearning(1);
            //return player.getPlayer().getText() + " played " + getName() + " for 2 Learning Chips";
        }
        return player.getPlayer().getText() + " played " + getName() + " for nothing";
    }
}