package com.example.nick.projectzerorework;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends ActionBarActivity {


    public void DisplayText(String s)
    {
        Toast.makeText(MainActivity.this, s, Toast.LENGTH_SHORT).show();
    }
    public void spotify(View view)
    {
        DisplayText(getString(R.string.spotify_toast));
    }

    public void scores(View view)
    {
        DisplayText(getString(R.string.scores_toast));
    }

    public void library(View view)
    {
        DisplayText(getString(R.string.library_toast));
    }

    public void xyz(View view)
    {
        DisplayText(getString(R.string.xyz_toast));
    }

    public void build_it(View view)
    {
        DisplayText(getString(R.string.build_it_toast));
    }

    public void my_app(View view)
    {
        DisplayText(getString(R.string.my_app_toast));
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
