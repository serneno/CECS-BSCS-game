package bin.main.classes;

import javax.swing.ImageIcon;

//Goodbye, Professor
public class Cardm39 extends Card {

    public Cardm39() {
        card_img = new ImageIcon("./resources/cardm39.png");
        card_ID = 39;
        card_name = "Goodbye, Professor";
    }

    //If player in Goodbye, Professor and has >= 3 Learning Chips and >= 3 Craft Chips, get 5 Quality Points and 1 Game Card
    //Else, teleport to Student Parking
    public String play(PlayerModel player, CardDeckModel deck, RoomListModel rlm) {
        if (player.getCurrentRoom().getName().equals("Room Of Retirement") && player.getCraft() >= 6
                && player.getLearning() >= 6 && player.getIntegrity() >= 6) {
            player.addQuality(10);
            return player.getPlayer().getText() + " played " + getName() + " for 10 Quality Points";
        } else {
            int discard = (int) Math.random() * (player.getHand().size() - 1);
            deck.discard(player.getHand().remove(discard));
            return player.getPlayer().getText() + " played " + getName() + " discarded 1 Game Card";
        }
    }
}