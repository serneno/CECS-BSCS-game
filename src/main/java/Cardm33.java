package bin.main.classes;

import javax.swing.ImageIcon;

//Oral Communication
public class Cardm33 extends Card {

    public Cardm33() {
        card_img = new ImageIcon("./resources/cardm33.png");
        card_ID = 33;
        card_name = "Oral Communication";
    }

    //If player in George Allen Field and has >= 3 Learning Chips and >= 3 Craft Chips, get 5 Quality Points and 1 Game Card
    //Else, teleport to Student Parking
    public String play(PlayerModel player, CardDeckModel deck, RoomListModel rlm) {
        if ((player.getCurrentRoom().getName().equals("Pyramid")
                || player.getCurrentRoom().getName().equals("Student Parking")
                || player.getCurrentRoom().getName().equals("REC Center")
                || player.getCurrentRoom().getName().equals("Library")
                || player.getCurrentRoom().getName().equals("LA 5")
                || player.getCurrentRoom().getName().equals("Bratwurst Hall")) && player.getIntegrity() >= 4)
        {
            player.addQuality(4);
            player.setChoose(true);
            return player.getPlayer().getText() + " played " + getName() + " for 4 Quality Points and a Chip of Choice";
        } else {
            int discard = (int) Math.random() * (player.getHand().size() - 1);
            deck.discard(player.getHand().remove(discard));
            return player.getPlayer().getText() + " played " + getName() + " discarded 1 Game Card";
        }
    }
}