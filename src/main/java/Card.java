package bin.main.classes;

import javax.swing.*;

//Main Parent class representing a Card
public class Card extends JLabel {
    ImageIcon card_img; //Card image
    int card_ID;        //Card ID
    
    public ImageIcon getCardImage() {
        return card_img;
    }

    public int getCardID() {
        return card_ID;
    }

    //Will be overridden by each child Card class
    public void play(PlayerModel player){
        System.out.println("Card ID:" + getCardID());
    }
}