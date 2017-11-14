package bin.main.classes;

import javax.swing.ImageIcon;

//Soccer Goalie
public class Cardm29 extends Card {

    public Cardm29() {
        card_img = new ImageIcon("./resources/cardm29.png");
        card_ID = 29;
        card_name = "Soccer Goalie";
    }

    //If player in George Allen Field and has >= 3 Learning Chips and >= 3 Craft Chips, get 5 Quality Points and 1 Game Card
    //Else, teleport to Student Parking
    public String play(PlayerModel player, CardDeckModel deck, RoomListModel rlm) {
        if(player.getCurrentRoom().getName().equals("George Allen Field") && player.getCraft() >= 3 && player.getLearning() >= 3) {
            player.addQuality(5);
            player.getHand().add(deck.drawCard());
            return player.getPlayer().getText() + " played " + getName() + " for 5 Quality Points and 1 Game Card";
        }
        else {
            player.setCurrentRoom(rlm.getRoom("Student Parking"));
            return player.getPlayer().getText() + " played " + getName() + " and teleported to Student Parking";
        }
    }
}