package bin.main.classes;

import javax.swing.ImageIcon;

//Professor Murgolo's CECS 174 Class
public class Cardm04 extends Card {   
    public Cardm04() {
        card_img = new ImageIcon("./resources/cardm04.png");
        card_ID = 4;
        card_name = "Professor Murgolo's CECS 174 Class";
    }

    //If player in ECS 302, get 1 Learning Chip
    public String play(PlayerModel player, CardDeckModel deck, RoomListModel rlm) {
        if(player.getCurrentRoom().getName().equals("ECS 302")) {
            player.addLearning(1);
            return player.getPlayer().getText() + " played " + getName() + " for 1 Learning Chip";
        }
        return player.getPlayer().getText() + " played " + getName() + " for nothing";
    }
}