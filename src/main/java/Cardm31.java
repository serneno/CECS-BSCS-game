package bin.main.classes;

import javax.swing.ImageIcon;

//Professor Hoffman
public class Cardm31 extends Card {

    public Cardm31() {
        card_img = new ImageIcon("./resources/cardm31.png");
        card_ID = 31;
        card_name = "Professor Hoffman";
    }

    //If player in George Allen Field and has >= 3 Learning Chips and >= 3 Craft Chips, get 5 Quality Points and 1 Game Card
    //Else, teleport to Lactation Lounge
    public String play(PlayerModel player, CardDeckModel deck, RoomListModel rlm) {
        if ((player.getCurrentRoom().getName().equals("CECS Conference") || player.getCurrentRoom().getName().equals("Computer Lab") || 
                player.getCurrentRoom().getName().equals("North Hall") || player.getCurrentRoom().getName().equals("Room Of Retirement") ||
                player.getCurrentRoom().getName().equals("ECS 302") || player.getCurrentRoom().getName().equals("Elevators") ||
                player.getCurrentRoom().getName().equals("Eat Club") || player.getCurrentRoom().getName().equals("South Hall") ||
                player.getCurrentRoom().getName().equals("ECS 308")) && player.getLearning() >= 3) {
            player.addQuality(5);
            player.getHand().add(deck.drawCard());
            player.getHand().add(deck.drawCard());
            return player.getPlayer().getText() + " played " + getName() + " for 5 Quality Points and 2 Game Card";
        } else {
            player.addQuality(-5);
            player.setCurrentRoom(rlm.getRoom("Lactation Lounge"));
            return player.getPlayer().getText() + " played " + getName() + " for -5 Quality Points and teleported to Lactation Lounge";
        }
    }
}