package bin.main.classes;

import javax.swing.*;

//Main Parent class representing a Card
public class Cardm02 extends Card {
    ImageIcon card_img; //Card image
    int card_ID; //Card ID

    public Cardm02() {
        card_img = new ImageIcon("./resources/cardm02.png");
        card_ID = 2;
    }

    //If player in Bratwurst Hall, get 1 Craft Chip
    public void play() {
    }
}