package bin.main.classes;

import javax.swing.ImageIcon;

//Lunch at Bratwurst Hall
public class Cardm02 extends Card {

    public Cardm02() {
        card_img = new ImageIcon("./resources/cardm02.png");
        card_ID = 2;
        card_name = "Lunch at Bratwurst Hall";
    }

    //If player in Bratwurst Hall, get 1 Craft Chip
    public void play(PlayerModel player, CardDeckModel deck, RoomListModel rlm) {
        if (player.getCurrentRoom().getName().equals("Bratwurst Hall")) {
            player.addCraft(1);
            System.out.println(player.getPlayer().getName() + " played " + getName() + " for 1 Craft Chip");
        }
    }
}