package bin.main.classes;

import javax.swing.*;

//Main Parent class representing a Card
public class Card extends JLabel {
    ImageIcon card_img; //Card image
    int card_ID;        //Card ID

    public ImageIcon getCardImage() {
        return card_img;
    }

    //Will be overridden by each child Card class
    public void play(){
        System.out.println("Card ID:" + card_ID);
    }
}