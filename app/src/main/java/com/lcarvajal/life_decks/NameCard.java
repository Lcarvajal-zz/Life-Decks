package com.lcarvajal.life_decks;

/**
 * Created by lukas on 3/3/15.
 */
public class NameCard extends Card {
    String features;    // physical features for identifying person

    /**
     * Constructor.
     *
     * @param nm  name of person.
     * @param nts notes on person.
     * @param fts features of person.
     */
    public NameCard(String nm, String nts, String fts) {
        // call Card constructor to set name and notes
        super(nm, nts);

        // set features
        features = fts;
    }

    /**
     * Method for returning features of person.
     *
     * @return features of person.
     */
    public String getFeatures() {
        return features;
    }

    /**
     * Method for setting features of person, checks if input is valid.
     *
     * @param fts new features of person.
     * @return true if features are set, false otherwise.
     */
    public boolean setFeatures(String fts) {
        //check if features are valid
        features = fts;
        return true;
    }
}
