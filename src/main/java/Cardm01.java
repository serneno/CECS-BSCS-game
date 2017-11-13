package bin.main.classes;

import javax.swing.ImageIcon;

//Math 122
public class Cardm01 extends Card {

    public Cardm01() {
        card_img = new ImageIcon("./resources/cardm01.png");
        card_ID = 1;
        card_name = "Math 122";
    }

    //If player in Library, get 1 Learning Chip or 1 Integrity Chip
    public void play(PlayerModel player, CardDeckModel deck, RoomListModel rlm) {
        if (player.getCurrentRoom().getName().equals("Library")) {
            int randomChip = (int)Math.random();
            if(randomChip == 0) {
                player.addLearning(1);
                System.out.println(player.getPlayer().getName() + " played " + getName() + " for 1 Learning Chip");
            }
            else {
                player.addIntegrity(1);
                System.out.println(player.getPlayer().getName() + " played " + getName() + " for 1 Integrity Chip");
            }
        }
    }
}