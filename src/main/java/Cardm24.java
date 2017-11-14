package bin.main.classes;

import javax.swing.ImageIcon;

//Meet the Dean
public class Cardm24 extends Card {

    public Cardm24() {
        card_img = new ImageIcon("./resources/cardm24.png");
        card_ID = 24;
        card_name = "Meet the Dean";
    }

    //If player in North Hall or South Hall and has 3 Craft Chips, 3 Integrity Chips, and 3 Learning Chips, get 5 Quality Points and 1 Game Card
    //Else, Discard 1 Game Card
    public String play(PlayerModel player, CardDeckModel deck, RoomListModel rlm) {
        if((player.getCurrentRoom().getName().equals("North Hall") || player.getCurrentRoom().getName().equals("South Hall")) 
        && player.getCraft() >= 3 && player.getIntegrity() >= 3 && player.getLearning() >= 3){
            player.addQuality(5);
            player.getHand().add(deck.drawCard());
            return player.getPlayer().getText() + " played " + getName() + " for 5 Quality Points and 1 Game Card";
        }
        else {
            int discard = (int) Math.random() * (player.getHand().size() - 1);
            deck.discard(player.getHand().remove(discard));
            return player.getPlayer().getText() + " played " + getName() + " and discarded 1 Game Card";
        }
    }
}