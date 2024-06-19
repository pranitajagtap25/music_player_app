package com.example.musicplayer;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.menu_songs) {
            // Handle the "Songs" menu option
            Toast.makeText(this, "Selected Songs", Toast.LENGTH_SHORT).show();
            return true;
        } else if (id == R.id.menu_playlists) {
            // Handle the "Playlists" menu option
            Toast.makeText(this, "Selected Playlists", Toast.LENGTH_SHORT).show();
            return true;
        }
        // Add more menu options and their handling as needed

        return super.onOptionsItemSelected(item);
    }
}
