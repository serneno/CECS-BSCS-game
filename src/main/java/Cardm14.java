package bin.main.classes;

import javax.swing.ImageIcon;


//Math 123
public class Cardm14 extends Card {

    public Cardm14() {
        card_img = new ImageIcon("./resources/cardm14.png");
        card_ID = 14;
        card_name = "Math 123";
    }

    //If player in ECS 302 or ECS 308 and has 5 Learning Chips, get 5 Quality Points
    //If not, lose 3 Quality Points and 1 Game Card at random
    public void play(PlayerModel player, CardDeckModel deck, RoomListModel rlm) {
        if((player.getCurrentRoom().getName().equals("ECS 302") || player.getCurrentRoom().getName().equals("ECS 308")) && player.getQuality() >= 5) {
            player.addQuality(5);
            System.out.println(player.getPlayer().getName() + " played " + getName() + " for 5 Quality Points");
        }
        else {
            player.addQuality(-3);
            int discard = (int) Math.random() * (player.getHand().size() - 1);
            deck.discard(player.getHand().remove(discard));
            System.out.println(player.getPlayer().getName() + " played " + getName() + " for -3 Quality Points and discarded 1 Game Card");
        }
    }
}