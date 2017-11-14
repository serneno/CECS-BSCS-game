package bin.main.classes;

import javax.swing.ImageIcon;

//Elective Class
public class Cardm30 extends Card {

    public Cardm30() {
        card_img = new ImageIcon("./resources/cardm30.png");
        card_ID = 30;
        card_name = "Elective Class";
    }

    //If player in Library and has >= 3 Learning Chips and >= 3 Craft Chips, get 5 Quality Points and 1 Game Card
    //Else, teleport to Student Parking
    public String play(PlayerModel player, CardDeckModel deck, RoomListModel rlm) {
        if (player.getCurrentRoom().getName().equals("Library") && player.getLearning() >= 2) {
            player.addLearning(1);
            player.getHand().add(deck.drawCard());
            return player.getPlayer().getText() + " played " + getName() + " for 1 Learning Chip and 1 Game Card";
        } else {
            player.addQuality(-2);
            return player.getPlayer().getText() + " played " + getName() + " for -2 Quality Points";
        }
    }
}