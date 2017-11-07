package bin.main.classes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.HashMap;

//Represents the Card Deck and the Discard Pile
public class CardDeckModel {
    Map<String, Card> card_list;    //List of all cards available
    List<String> card_names;        //List of card names, used for shuffling
    ArrayList<Card> deck;           //current deck
    ArrayList<Card> discard;        //discard pile

    public CardDeckModel() {
        card_list = new HashMap<String, Card>();
        create_room_list();        
    }

    //Puts each card in the card_list Map
    //Assigns the set of keys in random order into the card_names List
    public void create_room_list() { 
        card_names = new ArrayList<String>(card_list.entrySet());
    }

    //Empties discard pile
    //Regenerates new deck of cards
    public void reshuffle() {
        discard.clear();                    //empties the discard pile
        Collections.shuffle(card_names);    //randomly shuffles the list of cards
        //Repopulates the deck
        for(String s : card_names) {
            deck.add(card_list.get(s));
        }
    }
}