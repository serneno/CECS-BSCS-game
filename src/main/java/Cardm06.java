package bin.main.classes;

import javax.swing.ImageIcon;

//Exercising Mind and Body
public class Cardm06 extends Card {
    
    public Cardm06() {
        card_img = new ImageIcon("./resources/cardm06.png");
        card_ID = 6;
        card_name = "Exercising Mind and Body";
    }

    //If player in Student Recreation, get 1 Integrity Chip
    public String play(PlayerModel player, CardDeckModel deck, RoomListModel rlm) {
        if(player.getCurrentRoom().getName().equals("Student Recreation")) {
            player.addIntegrity(1);
            return player.getPlayer().getText() + " played " + getName() + " for 1 Integrity Chip";
        }
        return player.getPlayer().getText() + " played " + getName() + " for nothing";
    }
}