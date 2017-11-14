package bin.main.classes;

import javax.swing.ImageIcon;

//Student Parking
public class Cardm38 extends Card {

    public Cardm38() {
        card_img = new ImageIcon("./resources/cardm38.png");
        card_ID = 38;
        card_name = "Student Parking";
    }

    //If player in Student Parking and has >= 3 Learning Chips and >= 3 Craft Chips, get 5 Quality Points and 1 Game Card
    //Else, teleport to Student Parking
    public String play(PlayerModel player, CardDeckModel deck, RoomListModel rlm) {
        if (player.getCurrentRoom().getName().equals("Student Parking")) {
            player.addCraft(1);
            return player.getPlayer().getText() + " played " + getName() + " for 1 Craft Chip";
        } else {
            player.setCurrentRoom(rlm.getRoom("Lactation Lounge"));
            return player.getPlayer().getText() + " played " + getName() + " and teleported to Lactation Lounge";
        }
    }
}