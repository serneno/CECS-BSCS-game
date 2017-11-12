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
    List<Card> deck;           //current deck
    List<Card> discard;        //discard pile

    public CardDeckModel() {
        card_list = new HashMap<String, Card>();
        deck = new ArrayList<Card>();
        discard = new ArrayList<Card>();
        create_card_list();
        shuffle();     
    }

    //Puts each card in the card_list Map
    //Assigns the set of keys in random order into the card_names List
    public void create_card_list() {
        card_list.put("Cardm00", new Cardm00());
        card_list.put("Cardm01", new Cardm01());
        card_list.put("Cardm02", new Cardm02());
        card_list.put("Cardm03", new Cardm03());
        card_list.put("Cardm04", new Cardm04());
        card_list.put("Cardm05", new Cardm05());
        card_list.put("Cardm06", new Cardm06());
        card_list.put("Cardm07", new Cardm07());
        card_list.put("Cardm08", new Cardm08());
        card_list.put("Cardm09", new Cardm09());
        card_list.put("Cardm10", new Cardm10());
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

    //Discards a card
    public void discard(Card dCard) {
        discard.add(dCard);
    }
}