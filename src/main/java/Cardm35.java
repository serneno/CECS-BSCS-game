package bin.main.classes;

import javax.swing.ImageIcon;

//Learning Linux
public class Cardm35 extends Card {

    public Cardm35() {
        card_img = new ImageIcon("./resources/cardm35.png");
        card_ID = 35;
        card_name = "Learning Linux";
    }

    //If player in Computer Lab and has >= 3 Learning Chips and >= 3 Craft Chips, get 5 Quality Points and 1 Game Card
    //Else, teleport to Student Parking
    public String play(PlayerModel player, CardDeckModel deck, RoomListModel rlm) {
        if (player.getCurrentRoom().getName().equals("Computer Lab") && player.getCraft() >= 2
                && player.getIntegrity() >= 3) {
            player.addQuality(3);
            return player.getPlayer().getText() + " played " + getName() + " for 3 Quality Points and a Chip of Choice";
        } else {
            player.addQuality(-1);
            return player.getPlayer().getText() + " played " + getName() + " for -1 Quality Points";
        }
    }
}