package com.example.rfg2020;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class FeedWrite extends AppCompatActivity {
    private ImageView feedWrite_CloseBtn;
    private Button feedWrite_WriteBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feed_write);

        feedWrite_CloseBtn = findViewById(R.id.feedWrite_CloseBtn);
        feedWrite_WriteBtn = findViewById(R.id.feedWrite_WriteBtn);
        boolean feed_flag = true;

        feedWrite_WriteBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        feedWrite_CloseBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}