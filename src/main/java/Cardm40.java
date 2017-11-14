package bin.main.classes;

import javax.swing.ImageIcon;

//Car Pool
public class Cardm40 extends Card {

    public Cardm40() {
        card_img = new ImageIcon("./resources/cardm40.png");
        card_ID = 40;
        card_name = "Car Pool";
    }

    //If player in Student Parking and has >= 3 Learning Chips and >= 3 Craft Chips, get 5 Quality Points and 1 Game Card
    //Else, teleport to Student Parking
    public String play(PlayerModel player, CardDeckModel deck, RoomListModel rlm) {
        if ((player.getCurrentRoom().getName().equals("Forbidden Parking") || player.getCurrentRoom().getName().equals("Student Parking")) 
        && player.getIntegrity() >= 5) {
            player.addQuality(3);
            player.getHand().add(deck.drawCard());
            return player.getPlayer().getText() + " played " + getName() + " for 3 Quality Points and 1 Game Card";
        } else {
            player.addQuality(-2);
            return player.getPlayer().getText() + " played " + getName() + " for -2 Quality Points";
        }
    }
}