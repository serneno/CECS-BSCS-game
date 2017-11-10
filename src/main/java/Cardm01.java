package bin.main.classes;

import javax.swing.*;

//Main Parent class representing a Card
public class Cardm01 extends Card {
    ImageIcon card_img; //Card image
    int card_ID; //Card ID

    public Cardm01() {
        card_img = new ImageIcon("./resources/cardm01.png");
        card_ID = 1;
    }

    //If player in Library, get 1 Learning Chip or 1 Integrity Chip
    public void play() {
        System.out.println("Card ID:" + card_ID);
    }
}