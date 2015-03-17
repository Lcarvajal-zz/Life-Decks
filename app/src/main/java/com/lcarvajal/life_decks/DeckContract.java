package com.lcarvajal.life_decks;

import android.provider.BaseColumns;

/**
 * Created by Lukas Carvajal on 3/17/15.
 * Contract class for deck tables.
 * Each card must reference a deck.
 */
public final class DeckContract {

    /**
     * Basic Strings needed for SQL query.
     */
    public static final String TABLE_NAME = "deck";
    private static final String COMMA_SEP = ",";
    private static final String TEXT_TYPE = " TEXT";
    private static final String INT_TYPE = " INTEGER";

    /**
     * SQL query for creating table containing decks.
     */
    public static final String SQL_CREATE_TABLE = "CREATE TABLE"
            + DeckContract.TABLE_NAME +  " ("
            + DeckEntry.COLUMN_NAME_DECK_ID + INT_TYPE + COMMA_SEP
            + DeckEntry.COLUMN_NAME_DECK_NAME + TEXT_TYPE + COMMA_SEP + ");";

    /**
     * This class represents the rows for an entry in the deck table.
     * The primary key is the _id column from the BaseColumn class.
     */
    public abstract class DeckEntry implements BaseColumns {

        // Identifier of the deck
        public static final String COLUMN_NAME_DECK_ID = "deck_id";

        // Name of deck
        public static final String COLUMN_NAME_DECK_NAME = "deck_name";
    }
}
