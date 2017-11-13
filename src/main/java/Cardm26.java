package bin.main.classes;

import javax.swing.ImageIcon;

//Press the Right Floor
public class Cardm26 extends Card {

    public Cardm26() {
        card_img = new ImageIcon("./resources/cardm26.png");
        card_ID = 26;
        card_name = "Press the Right Floor";
    }

    //If player in Elevators and has >= 4 Learning Chips, get 2 Craft Chips
    //Else, lose 2 Quality Points
    public void play(PlayerModel player, CardDeckModel deck, RoomListModel rlm) {
        if(player.getCurrentRoom().getName().equals("Elevators") && player.getLearning() >= 4) {
            player.addCraft(2);
            System.out.println(player.getPlayer().getName() + " played " + getName() + " for 2 Craft Chips");
        }
        else {
            player.addQuality(-2);
            System.out.println(player.getPlayer().getName() + " played " + getName() + " for -2 Quality Points");
        }
    }
}