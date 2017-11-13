package bin.main.classes;

import javax.swing.ImageIcon;

//KIN 253 Learning the Rules of Soccer
public class Cardm16 extends Card {

    public Cardm16() {
        card_img = new ImageIcon("./resources/cardm16.png");
        card_ID = 16;
        card_name = "KIN 253 Learning the Rules of Soccer";
    }

    //If player in George Allen Field and has >= 4 Integrity Chips, get 2 Craft Chips
    //Else, teleport to Room of Retirement
    public void play(PlayerModel player, CardDeckModel deck, RoomListModel rlm) {
        if(player.getCurrentRoom().getName().equals("George Allen Field") && player.getIntegrity() >= 4) {
            player.addCraft(2);
            System.out.println(player.getPlayer().getName() + " played " + getName() + " for 2 Craft Chips");
        }
        else{
            player.setCurrentRoom(rlm.getRoom("Room Of Retirement"));
            System.out.println(player.getPlayer().getName() + " played " + getName() + " and teleported to Room of Retirement");
        }
    }
}