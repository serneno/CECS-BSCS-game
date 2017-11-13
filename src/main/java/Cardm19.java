package bin.main.classes;

import javax.swing.ImageIcon;

//Score a Goal!
public class Cardm19 extends Card {

    public Cardm19() {
        card_img = new ImageIcon("./resources/cardm19.png");
        card_ID = 19;
        card_name = "Score a Goal!";
    }

    //If player in George Allen Field and >= 3 Craft Chips, get 5 Quality Points and 1 Integrity Chip
    //Else, teleport to Student Parking
    public void play(PlayerModel player, CardDeckModel deck, RoomListModel rlm) {
        if(player.getCurrentRoom().getName().equals("George Allen Field") && player.getCraft() >= 3) {
            player.addQuality(5);
            player.addIntegrity(1);
            System.out.println(player.getPlayer().getName() + " played " + getName() + " for 5 Quality Points and 1 Integrity Chip");
        }
        else {
            player.setCurrentRoom(rlm.getRoom("Student Parking"));
            System.out.println(player.getPlayer().getName() + " played " + getName() + " teleported to Student Parking");
        }
    }
}