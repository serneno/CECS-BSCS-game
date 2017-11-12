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
    public void play(PlayerModel player) {
        if (player.getCurrentRoom().getName().equals("Library")) {
            player.addLearning(1);
            System.out.println(player.getPlayer().getName() + " played " + getName() + "for 1 Learning Chip");
        }
    }
}