package bin.main.classes;

import javax.swing.ImageIcon;

//Enjoying Nature
public class Cardm37 extends Card {

    public Cardm37() {
        card_img = new ImageIcon("./resources/cardm37.png");
        card_ID = 37;
        card_name = "Enjoying Nature";
    }

    //If player in George Allen Field and has >= 3 Learning Chips and >= 3 Craft Chips, get 5 Quality Points and 1 Game Card
    //Else, teleport to Student Parking
    public String play(PlayerModel player, CardDeckModel deck, RoomListModel rlm) {
        if (player.getCurrentRoom().getName().equals("George Allen Field")
                || player.getCurrentRoom().getName().equals("Japanese Garden")
                || player.getCurrentRoom().getName().equals("Pyramid")
                || player.getCurrentRoom().getName().equals("Student Parking")
                || player.getCurrentRoom().getName().equals("REC Center")
                || player.getCurrentRoom().getName().equals("West Walkway")
                || player.getCurrentRoom().getName().equals("East Walkway")
                || player.getCurrentRoom().getName().equals("Library")
                || player.getCurrentRoom().getName().equals("LA 5")
                || player.getCurrentRoom().getName().equals("Bratwurst Hall") || player.getCurrentRoom().getName().equals("Forbidden Parking")) {
            player.addCraft(1);
            player.setCurrentRoom(rlm.getRoom("Lactation Lounge"));
            return player.getPlayer().getText() + " played " + getName() + " for 1 Craft Chip and teleported to Lactation Lounge";
        } else {
            return player.getPlayer().getText() + " played " + getName() + " and failed";
        }
    }
}