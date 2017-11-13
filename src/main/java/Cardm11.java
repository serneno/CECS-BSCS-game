package bin.main.classes;

import javax.swing.ImageIcon;

//Buddy Up
public class Cardm11 extends Card {

    public Cardm11() {
        card_img = new ImageIcon("./resources/cardm11.png");
        card_ID = 11;
        card_name = "Buddy Up";
    }

    //If player in Eat Club or George Allen Field, get 1 Learning Chip or 1 Craft Chip
    public void play(PlayerModel player, CardDeckModel deck, RoomListModel rlm) {
        if(player.getCurrentRoom().getName().equals("Eat Club") || player.getCurrentRoom().getName().equals("George Allen Field")) {
            int randomChip = (int) Math.random();
            if(randomChip == 0) {
                player.addLearning(1);
                System.out.println(player.getPlayer().getName() + " played " + getName() + " for 1 Learning Chip");
            }
            else {
                player.addCraft(1);
                System.out.println(player.getPlayer().getName() + " played " + getName() + " for 1 Craft Chip");
            }
        }
    }
}