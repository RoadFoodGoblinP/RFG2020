package com.example.rfg2020;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Bundle;
import android.widget.ImageView;

public class Feed extends AppCompatActivity {
    ImageView feed_profile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feed);

        feed_profile = findViewById(R.id.feed_profile);

        feed_profile.setBackground(new ShapeDrawable(new OvalShape()));
        feed_profile.setClipToOutline(true);
    }
}