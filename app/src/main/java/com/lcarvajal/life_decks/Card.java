package com.lcarvajal.life_decks;

/**
 * Created by Lukas Carvajal on 3/3/15
 * The Card class stores information for a card.
 * Created to be extended by other, more 'specific', card classes.
 */
public class Card {
    protected String name;  // name of card
    protected String notes; // notes for card

    /**
     * Constructor.
     * @param nm name of card.
     * @param nts notes for card.
     */
    public Card(String nm, String nts){
        name = nm;
        notes = nts;
    }

    /**
     * Method for returning name.
     * @return name of card.
     */
    public String getName()
    { return name;}

    /**
     * Method for returning notes.
     * @return notes of card.
     */
    public String getNotes()
    { return notes;}

    /**
     * Method for setting name of card.
     * @param nm new name for card.
     * @return true if name is set, false otherwise.
     */
    public boolean setName(String nm){
        //check if input is valid
        name = nm;
        return true;
    }

    public boolean setNotes(String nts){
        //check if input is valid
        notes = nts;
        return true;
    }

}
