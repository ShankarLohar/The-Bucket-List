package com.shankarlohar.thebucketlistapp;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

public class ThingsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recycler_view);
        setupList();
    }

    private void setupList() {
        RecyclerView list = findViewById(R.id.recycler_view_projects);

        BucketElement[] thingBucket = {
                new BucketElement("First Thing", "Going to Kilimanjaro", R.drawable.kilimanjaro,5),
                new BucketElement("Second Thing", "Going to Northern Lights", R.drawable.northern_lights,2),
                new BucketElement("Third Thing", "Going for a road trip", R.drawable.road_trip,3.7f),
                new BucketElement("Fourth Thing", "Going for Scuba Dive", R.drawable.scubadive,2.9f),
                new BucketElement("Fifth Thing", "Going for Sky Dive", R.drawable.skydive,5)
        };

        BucketAdapter adapter = new BucketAdapter(thingBucket);
        list.setAdapter(adapter);
    }
}
