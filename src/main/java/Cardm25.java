package bin.main.classes;

import javax.swing.ImageIcon;

//Program Crashes
public class Cardm25 extends Card {

    public Cardm25() {
        card_img = new ImageIcon("./resources/cardm25.png");
        card_ID = 25;
        card_name = "Program Crashes";
    }

    //If player in Lactation Lounge and has >= 2 Learning Chips, get 5 Quality Points and 1 Chip of their choice
    //Else, discard 1 Game Card
    public String play(PlayerModel player, CardDeckModel deck, RoomListModel rlm) {
        if(player.getCurrentRoom().getName().equals("Lactation Lounge") && player.getLearning() >= 2) {
            player.addQuality(5);
            return player.getPlayer().getText() + " played " + getName() + " for 5 Quality Points";
            //player.addCraft(1);
            //return player.getPlayer().getText() + " played " + getName() + " for 5 Quality Points and 1 Craft Chip";

            //player.addIntegrity(1);
            //return player.getPlayer().getText() + " played " + getName() + " for 5 Quality Points and 1 Integrity Chip";

            //player.addLearning(1);
            //return player.getPlayer().getText() + " played " + getName() + " for 5 Quality Points and 1 Learning Chip";
        }
        else {
            int discard = (int) Math.random() * (player.getHand().size() - 1);
            deck.discard(player.getHand().remove(discard));
            return player.getPlayer().getText() + " played " + getName() + " discarded 1 Game Card";
        }
    }
}