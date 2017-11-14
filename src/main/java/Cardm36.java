package bin.main.classes;

import javax.swing.ImageIcon;

//Make a Friend
public class Cardm36 extends Card {

    public Cardm36() {
        card_img = new ImageIcon("./resources/cardm36.png");
        card_ID = 36;
        card_name = "Make a Friend";
    }

    //If player in North Hall and has >= 3 Learning Chips and >= 3 Craft Chips, get 5 Quality Points and 1 Game Card
    //Else, teleport to Student Parking
    public String play(PlayerModel player, CardDeckModel deck, RoomListModel rlm) {
        if ((player.getCurrentRoom().getName().equals("North Hall") || player.getCurrentRoom().getName().equals("South Hall")) 
        && player.getIntegrity() >= 2) {
            player.addQuality(3);
            return player.getPlayer().getText() + " played " + getName() + " for 3 Quality Points and a Chip of Choice";
        } else {
            int discard = (int) Math.random() * (player.getHand().size() - 1);
            deck.discard(player.getHand().remove(discard));
            return player.getPlayer().getText() + " played " + getName() + " discarded 1 Game Card";
        }
    }
}