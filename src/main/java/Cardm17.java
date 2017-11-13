package bin.main.classes;

import javax.swing.ImageIcon;

//Learning Netbeans
public class Cardm17 extends Card {

    public Cardm17() {
        card_img = new ImageIcon("./resources/cardm17.png");
        card_ID = 17;
        card_name = "Learning Netbeans";
    }

    //If player in Lactation Lounge and has >= 3 Learning Chips, get 5 Quality Points
    //Else lose 3 Quality Points
    public void play(PlayerModel player, CardDeckModel deck, RoomListModel rlm) {
        if(player.getCurrentRoom().getName().equals("Lactation Lounge") && player.getLearning() >= 3) {
            player.addQuality(5);
            System.out.println(player.getPlayer().getName() + " played " + getName() + " for 5 Quality Points");
        }
        else {
            player.addQuality(-3);
            System.out.println(player.getPlayer().getName() + " played " + getName() + " for -3 Quality Points");
        }
    }
}