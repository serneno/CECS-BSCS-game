package bin.main.classes;

import javax.swing.ImageIcon;

//Late for Class
public class Cardm12 extends Card {

    public Cardm12() {
        card_img = new ImageIcon("./resources/cardm12.png");
        card_ID = 12;
        card_name = "Late for Class";
    }

    //If player is in any space outside that isn't Forbidden Parking, get 1 Craft Chip
    public void play(PlayerModel player, CardDeckModel deck, RoomListModel rlm) {
        //Need to add the other outside spaces
        if(player.getCurrentRoom().getName().equals("George Allen Field") || player.getCurrentRoom().getName().equals("Japanese Garden") ||
        player.getCurrentRoom().getName().equals("Pyramid") || player.getCurrentRoom().getName().equals("Student Parking") ||
        player.getCurrentRoom().getName().equals("REC Center") || player.getCurrentRoom().getName().equals("West Walkway") ||
        player.getCurrentRoom().getName().equals("East Walkway") || player.getCurrentRoom().getName().equals("Library") ||
        player.getCurrentRoom().getName().equals("LA 5") || player.getCurrentRoom().getName().equals("Bratwurst Hall")) {
            player.addCraft(1);
            player.setCurrentRoom(rlm.getRoom("Lactation Lounge"));
            System.out.println(player.getPlayer().getName() + " played " + getName() + " for 1 Craft Chip and teleported to Lactation Lounge");
        }
    }
}