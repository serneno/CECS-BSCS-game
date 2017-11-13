package bin.main.classes;

import javax.swing.ImageIcon;

//Make the Dean's List
public class Cardm20 extends Card {

    public Cardm20() {
        card_img = new ImageIcon("./resources/cardm20.png");
        card_ID = 20;
        card_name = "Make the Dean's List";
    }

    //If player in North Hall and >= 6 Learning Chips, get 5 Quality Points
    //Else, teleport to Student Parking
    public void play(PlayerModel player, CardDeckModel deck, RoomListModel rlm) {
        if((player.getCurrentRoom().getName().equals("North Hall") || player.getCurrentRoom().getName().equals("South Hall")) && player.getLearning() >= 6) {
            player.addQuality(5);
            System.out.println(player.getPlayer().getName() + " played " + getName() + " for 5 Quality Points");
        }
        else {
            player.setCurrentRoom(rlm.getRoom("Student Parking"));
            System.out.println(player.getPlayer().getName() + " played " + getName() + " and teleported to Student Parking");
        }
    }
}