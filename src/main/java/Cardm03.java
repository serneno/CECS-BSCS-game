package bin.main.classes;

import javax.swing.*;

//Main Parent class representing a Card
public class Cardm03 extends Card {
    ImageIcon card_img; //Card image
    int card_ID; //Card ID

    public Cardm03() {
        card_img = new ImageIcon("./resources/cardm03.png");
        card_ID = 3;
    }

    //If player in Library, get 1 Learning Chip
    public void play() {
    }
}