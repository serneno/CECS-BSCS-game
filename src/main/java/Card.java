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
    JDialog chip_choice;//Choosing Chip
    String chip;        //Name of chip chosen
    
    public ImageIcon getCardImage() {
        return card_img;
    }

    public int getCardID() {
        return card_ID;
    }

    public String getName() {
        return card_name;
    }

    public void chipChoice() {
        chip_choice = new JDialog();
        JPanel chipButtons = new JPanel(new GridLayout(1, 3));
        JButton craftButton = new JButton(new ImageIcon("./resources/CraftChip.png"));
        craftButton.setName("Craft");
        craftButton.addActionListener(new HandleChipChoice());
        JButton integrityButton = new JButton(new ImageIcon("./resources/IntegrityChip.png"));
        integrityButton.setName("Integrity");
        integrityButton.addActionListener(new HandleChipChoice());
        JButton learningButton = new JButton(new ImageIcon("./resources/learningChip.png"));
        learningButton.setName("Learning");
        learningButton.addActionListener(new HandleChipChoice());
        chipButtons.add(craftButton);
        chipButtons.add(integrityButton);
        chipButtons.add(learningButton);
        chip_choice.add(chipButtons);
        chip_choice.pack();
        chip_choice.setVisible(true);
    }

    //Will be overridden by each child Card class
    public String play(PlayerModel player, CardDeckModel deck, RoomListModel rlm){
        return "Card ID:" + getCardID();
    }

    class HandleChipChoice implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            JButton clicked = (JButton)e.getSource();
            if(clicked.getName().equals("Craft")) {
                chip = "Craft";
            }
            else if(clicked.getName().equals("Integrity")) {
                chip = "Integrity";
            }
            else {
                chip = "Learning";
            }
            chip_choice.setVisible(false);
            System.out.println("Chip chosen: " + chip);
        }
    }
}