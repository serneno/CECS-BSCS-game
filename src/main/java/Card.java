package bin.main.classes;

import javax.swing.*;

//Main Parent class representing a Card
public class Card extends JLabel {
    ImageIcon card_img; //Card image
    int card_ID;        //Card ID

    public Card(String card_img_path, int card_id) {
        card_img = new ImageIcon(card_img_path);
        card_ID = card_id;
    }

    //Will be overridden by each child Card class
    public void play(){}
}