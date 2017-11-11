package bin.main.classes;

import javax.swing.*;

//Main Parent class representing a Card
public class Cardm00 extends Card {
    ImageIcon card_img; //Card image
    int card_ID; //Card ID

    public Cardm00() {
        card_img = new ImageIcon("./resources/cardm00.png");
        card_ID = 0;
    }

    public ImageIcon getCardImage() {
        return card_img;
    }

    //If player in ECS 302 or ECS 308, get 1 Learning Chip
    public void play() {
    }
}