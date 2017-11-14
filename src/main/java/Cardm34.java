package bin.main.classes;

import javax.swing.ImageIcon;

//CHEM 111
public class Cardm34 extends Card {

    public Cardm34() {
        card_img = new ImageIcon("./resources/cardm34.png");
        card_ID = 34;
        card_name = "CHEM 111";
    }

    //If player in George Allen Field and has >= 3 Learning Chips and >= 3 Craft Chips, get 5 Quality Points and 1 Game Card
    //Else, teleport to Student Parking
    public String play(PlayerModel player, CardDeckModel deck, RoomListModel rlm) {
        if ((player.getCurrentRoom().getName().equals("Pyramid")
                || player.getCurrentRoom().getName().equals("Student Parking")
                || player.getCurrentRoom().getName().equals("REC Center")
                || player.getCurrentRoom().getName().equals("Library")
                || player.getCurrentRoom().getName().equals("LA 5")
                || player.getCurrentRoom().getName().equals("Bratwurst Hall")) && player.getCraft() >= 6) {
            player.addQuality(5);
            return player.getPlayer().getText() + " played " + getName() + " for 5 Quality Points";
        } else {
            player.setCurrentRoom(rlm.getRoom("Student Parking"));
            return player.getPlayer().getText() + " played " + getName() + " and teleported to Student Parking";
        }
    }
}