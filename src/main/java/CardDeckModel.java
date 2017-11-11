package bin.main.classes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.HashMap;
import java.util.List;

//Represents the Card Deck and the Discard Pile
public class CardDeckModel {
    Map<String, Card> card_list;    //List of all cards available using a Map
    List<String> card_names;        //List of card names, used for shuffling
    ArrayList<Card> deck;           //current deck
    ArrayList<Card> discard;        //discard pile

    public CardDeckModel() {
        card_list = new HashMap<String, Card>();
        create_card_list();        
    }

    //Puts each card in the card_list Map
    //Assigns the set of keys in random order into the card_names List
    public void create_card_list() {
        card_list.put("Cardm00", new Cardm00()); 
        card_names = new ArrayList<String>(card_list.keySet());
    }

    //Empties discard pile
    //Regenerates new deck of cards
    public void shuffle() {
        discard.clear();                    //empties the discard pile
        Collections.shuffle(card_names);    //randomly shuffles the list of cards
        //Repopulates the deck
        for(String s : card_names) {
            deck.add(card_list.get(s));
        }
    }

    //Returns number of cards left in the deck
    public int cardsLeft() {
        return deck.size();
    }

    //Returns the first card in the deck
    public Card drawCard() {
        return deck.remove(0);
    }
}