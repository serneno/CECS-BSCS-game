package bin.main.classes;

import javax.swing.ImageIcon;

//A New Laptop
public class Cardm23 extends Card {

    public Cardm23() {
        card_img = new ImageIcon("./resources/cardm23.png");
        card_ID = 23;
        card_name = "A New Laptop";
    }

    //If player in Computer Lab and has >= 4 Integrity Chips, get 3 Quality Points and a Chip of their choice
    //Else, discard 1 Game Card
    public String play(PlayerModel player, CardDeckModel deck, RoomListModel rlm) {
        if(player.getCurrentRoom().getName().equals("Computer Lab") && player.getIntegrity() >= 4) {
            player.addQuality(3);
            player.setChoose(true);
            return player.getPlayer().getText() + " played " + getName() + " for 3 Quality Points";

            //player.addCraft(1);
            //return player.getPlayer().getText() + " played " + getName() + " for 3 Quality Points and 1 Craft Chip";

            //player.addIntegrity(1);
            //return player.getPlayer().getText() + " played " + getName() + " for 3 Quality Points and 1 Integrity Chip";

            //player.addLearning(1);
            //return player.getPlayer().getText() + " played " + getName() + " for 3 Quality Points and 1 Learning Chip";
        }
        else {
            int discard = (int) Math.random() * (player.getHand().size() - 1);
            deck.discard(player.getHand().remove(discard));
            return player.getPlayer().getText() + " played " + getName() + " and discarded 1 Game Card";
        }
    }
}