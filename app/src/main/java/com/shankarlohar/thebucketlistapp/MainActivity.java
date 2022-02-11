package com.shankarlohar.thebucketlistapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    CardView thingsCardView, placesCardView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setupOnClicks();
    }
    private void setupOnClicks() {
        thingsCardView = findViewById(R.id.cardview_things);
        placesCardView = findViewById(R.id.cardview_places);

        thingsCardView.setOnClickListener(view -> {
            Intent thingsListViewActivityIntent = new Intent(MainActivity.this, ThingsActivity.class);
            startActivity(thingsListViewActivityIntent);
        });
        placesCardView.setOnClickListener(view -> {
            Intent placesListViewActivityIntent = new Intent(MainActivity.this, PlacesActivity.class);
            startActivity(placesListViewActivityIntent);
        });
    }

}

