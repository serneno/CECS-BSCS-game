package bin.main.classes;

import javax.swing.ImageIcon;

//Choosing a Major
public class Cardm18 extends Card {

    public Cardm18() {
        card_img = new ImageIcon("./resources/cardm18.png");
        card_ID = 18;
        card_name = "Choosing a Major";
    }

    //If player in CECS Conference and has >= 3 Integrity Chips, get 5 Quality Points
    //Else, Player loses 5 Quality Points
    public void play(PlayerModel player, CardDeckModel deck, RoomListModel rlm) {
        if(player.getCurrentRoom().getName().equals("CECS Conference") && player.getIntegrity() >= 3) {
            player.addQuality(5);
            System.out.println(player.getPlayer().getName() + " played " + getName() + " for 5 Quality Points");
        }
        else {
            player.addQuality(-3);
            System.out.println(player.getPlayer().getName() + " played " + getName() + " for -3 Quality Points");
        }
    }
}