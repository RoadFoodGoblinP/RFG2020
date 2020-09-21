package com.example.rfg2020;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Muckpot_Detail extends AppCompatActivity {
    private ImageView muckDetail_BackBtn;
    private ImageView muck_profile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_muckpot__detail);

        muckDetail_BackBtn = findViewById(R.id.muckDetail_BackBtn);
        muck_profile = findViewById(R.id.muck_profile);

        muck_profile.setBackground(new ShapeDrawable(new OvalShape()));
        muck_profile.setClipToOutline(true);

        muck_profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Intent intent = new Intent(, UserProfile.class);
                //startActivity(intent);
            }
        });

        muckDetail_BackBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}