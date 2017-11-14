package bin.main.classes;

import javax.swing.ImageIcon;

//The Big Game
public class Cardm13 extends Card {

    public Cardm13() {
        card_img = new ImageIcon("./resources/cardm13.png");
        card_ID = 13;
        card_name = "The Big Game";
    }

    //If player in Pyramid, get 1 Craft Chip and teleport to Lactation Lounge
    public String play(PlayerModel player, CardDeckModel deck, RoomListModel rlm) {
        if(player.getCurrentRoom().getName().equals("Pyramid")) {
            player.addCraft(1);
            player.setCurrentRoom(rlm.getRoom("Lactation Lounge"));
            return player.getPlayer().getText() + " played " + getName() + " for 1 Craft Chip and teleported to Lactation Lounge";
        }
        return player.getPlayer().getText() + " played " + getName() + " for nothing";
    }
}