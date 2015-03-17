package com.lcarvajal.life_decks;

/**
 * created by Lukas Carvajal on 3/17/15
 * Activity for selecting deck to view.
 * Uses GridView to display all decks.
 */

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.Toast;


public class SelectDeck extends ActionBarActivity {

    // temporary strings to have a feel for the look
    private String[] mTitles = {"Deck1", "Deck2", "Deck3", "Deck4", "Deck5", "Deck6"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_deck);

        // Grid view
        GridView gridview = (GridView) findViewById(R.id.gridview);
        gridview.setAdapter(new ArrayAdapter<String>(this,
                R.layout.select_deck_text_view, mTitles));

        // On click listener
        gridview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View v, int position, long id) {
                Toast.makeText(SelectDeck.this, "" + position, Toast.LENGTH_SHORT).show();
            }
        });

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.select_deck_activity_actions, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_cancel) {
            finish();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
