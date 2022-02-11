package com.shankarlohar.thebucketlistapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class PlacesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recycler_view);
        setupList();
    }

    private void setupList() {
        RecyclerView list = findViewById(R.id.recycler_view_projects);

        BucketElement[] placeBucket = {
                new BucketElement("First Place", "Visiting Amazon", R.drawable.amazon,3),
                new BucketElement("Second Place", "Visiting Ice Land", R.drawable.iceland,4),
                new BucketElement("Third Place", "Visiting Japan", R.drawable.japan,3.5f),
                new BucketElement("Fourth Place", "Visiting Kerala", R.drawable.kerala,4.7f),
                new BucketElement("Fifth Place", "Visiting Vietnam", R.drawable.vietnam,5)
        };

        BucketAdapter adapter = new BucketAdapter(placeBucket);
        list.setAdapter(adapter);
    }
}