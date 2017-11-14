package bin.main.classes;

import javax.swing.ImageIcon;

//Research Compilers
public class Cardm03 extends Card {

    public Cardm03() {
        card_img = new ImageIcon("./resources/cardm03.png");
        card_ID = 3;
        card_name = "Research Compilers";
    }

    //If player in Library, get 1 Learning Chip
    public String play(PlayerModel player, CardDeckModel deck, RoomListModel rlm) {
        if (player.getCurrentRoom().getName().equals("Library")) {
            player.addLearning(1);
            return player.getPlayer().getText() + " played " + getName() + " for 1 Learning Chip";
        }
        return player.getPlayer().getText() + " played " + getName() + " for nothing";
    }
}