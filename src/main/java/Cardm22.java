package bin.main.classes;

import javax.swing.ImageIcon;

//Fall in the Pond
public class Cardm22 extends Card {

    public Cardm22() {
        card_img = new ImageIcon("./resources/cardm22.png");
        card_ID = 22;
        card_name = "Fall in the Pond";
    }

    //If player in Japanese Garden and has >= 3 Learning Chips, get 1 Integrity Chip and 1 Craft Chip
    //Else, teleport to Lactation Lounge
    public void play(PlayerModel player, CardDeckModel deck, RoomListModel rlm) {
        if(player.getCurrentRoom().getName().equals("Japanese Garden") && player.getLearning() >= 3) {
            player.addIntegrity(1);
            player.addCraft(1);
            System.out.println(player.getPlayer().getName() + " played " + getName() + " for 1 Integrity Chip and 1 Craft Chip");
        }
        else {
            player.setCurrentRoom(rlm.getRoom("Lactation Lounge"));
            System.out.println(player.getPlayer().getName() + " played " + getName() + " and teleported to Lactation Lounge");
        }
    }
}