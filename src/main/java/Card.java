package bin.main.classes;

import java.awt.GridLayout;
import java.awt.event.*;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JDialog;
import java.util.EventObject;

//Main Parent class representing a Card
public class Card extends JLabel {
    ImageIcon card_img; //Card image
    int card_ID;        //Card ID
    String card_name;   //Card Name
    
    public ImageIcon getCardImage() {
        return card_img;
    }

    public int getCardID() {
        return card_ID;
    }

    public String getName() {
        return card_name;
    }

    //Will be overridden by each child Card class
    public String play(PlayerModel player, CardDeckModel deck, RoomListModel rlm){
        return "Card ID:" + getCardID();
    }
}