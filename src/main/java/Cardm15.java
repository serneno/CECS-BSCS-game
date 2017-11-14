package bin.main.classes;

import javax.swing.ImageIcon;

//Physics 151
public class Cardm15 extends Card {

    public Cardm15() {
        card_img = new ImageIcon("./resources/cardm15.png");
        card_ID = 15;
        card_name = "Physics 151";
    }

    //If player in ECS 308 and has 3 Craft Chips, get 5 Quality Points
    //Else, player loses 3 Quality Points
    public String play(PlayerModel player, CardDeckModel deck, RoomListModel rlm) {
        if(player.getCurrentRoom().getName().equals("ECS 308") && player.getCraft() >= 3) {
            player.addQuality(5);
            return player.getPlayer().getText() + " played " + getName() + " for 5 Quality Points";
        }
        else {
            player.addQuality(-3);
            return player.getPlayer().getText() + " played " + getName() + " for -3 Quality Points";
        }
    }
}