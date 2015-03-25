package com.lcarvajal.life_decks;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends ActionBarActivity {

    boolean openEye = true;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ImageButton eyeButton = (ImageButton) findViewById(R.id.eye_button);
        final TextView info = (TextView) findViewById(R.id.info);

        eyeButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(openEye) {
                    eyeButton.setBackgroundResource(R.drawable.eye_closed_button);
                    info.setTextColor(Color.parseColor("#FFFFFF"));
                    openEye = false;
                }
                else {
                    eyeButton.setBackgroundResource(R.drawable.eye_opened_button);
                    info.setTextColor(Color.parseColor("#000000"));
                    openEye = true;
                }
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main_activity_actions, menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        // event handler for view decks button click
        if (id == R.id.action_view_decks) {
            Intent intent = new Intent(MainActivity.this, SelectDeck.class);
            startActivity(intent);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
