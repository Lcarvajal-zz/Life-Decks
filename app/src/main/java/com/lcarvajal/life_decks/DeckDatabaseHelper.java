package com.lcarvajal.life_decks;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

/**
 * Created by Lukas Carvajal on 3/17/15.
 * This class helps open, create, and upgrade the database file containing decks.
 */
public class DeckDatabaseHelper extends SQLiteOpenHelper {

    // If database schema is changed, version must be incremented
    public static final int DATABASE_VERSION = 1;
    // Name of database file
    public static final String DATABASE_NAME = "Life_Decks.db";

    public DeckDatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    /**
     * Creates the underlying database with the SQL_CREATE_TABLE queries from DeckContract class.
     * Creates tables and initializes data.
     * onCreate is triggered the first time someone tries to access the database.
     *
     * @param db the database being accessed that should be created.
     */
    @Override
    public void onCreate(SQLiteDatabase db) {
        //Create the database
        db.execSQL(DeckContract.SQL_CREATE_TABLE);
        // initializeExampleData(db);
    }

    /**
     * Method for upgrading application while including SQL query.
     *
     * @param db the database being upgraded.
     * @param oldVersion the current version of the database before the upgrade.
     * @param newVersion the version of the database after the upgrade.
     */
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // Logs that the database is being upgraded
        Log.i(DeckDatabaseHelper.class.getSimpleName(),
                "Upgrading database from version " + oldVersion + " to " + newVersion);
    }
}
