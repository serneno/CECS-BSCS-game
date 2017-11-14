package bin.main.classes;

import javax.swing.ImageIcon;

//CECS 274
public class Cardm41 extends Card {

    public Cardm41() {
        card_img = new ImageIcon("./resources/cardm41.png");
        card_ID = 41;
        card_name = "CECS 274";
    }

    //If player in ECS 308 and has >= 3 Learning Chips and >= 3 Craft Chips, get 5 Quality Points and 1 Game Card
    //Else, teleport to ECS 308
    public String play(PlayerModel player, CardDeckModel deck, RoomListModel rlm) {
        if ((player.getCurrentRoom().getName().equals("ECS 302")
                || player.getCurrentRoom().getName().equals("ECS 308") || player.getCurrentRoom().getName().equals("Computer Lab")) 
                && player.getLearning() >= 7) {
            player.addQuality(5);
            player.getHand().add(deck.drawCard());
            return player.getPlayer().getText() + " played " + getName() + " for 5 Quality Points and 1 Game Card";
        } else {
            player.addQuality(-3);
            return player.getPlayer().getText() + " played " + getName() + " for -3 Quality Points";
        }
    }
}