package bin.main.classes;

import javax.swing.ImageIcon;

//Pass Soccer Class
public class Cardm21 extends Card {

    public Cardm21() {
        card_img = new ImageIcon("./resources/cardm21.png");
        card_ID = 21;
        card_name = "Pass Soccer Class";
    }

    //If player in George Allen Field and has >= 5 Craft Chips, get 5 Quality Points
    //Else, lose 3 Quality Points
    public void play(PlayerModel player, CardDeckModel deck, RoomListModel rlm) {
        if(player.getCurrentRoom().getName().equals("George Allen Field") && player.getCraft() >= 5) {
            player.addQuality(5);
            System.out.println(player.getPlayer().getName() + " played " + getName() + " for 5 Quality Points");
        }
        else {
            player.addQuality(-3);
            System.out.println(player.getPlayer().getName() + " played " + getName() + " for -3 Quality Points");
        }
    }
}