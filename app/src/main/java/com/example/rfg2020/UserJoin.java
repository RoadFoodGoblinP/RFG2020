package com.example.rfg2020;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class UserJoin extends AppCompatActivity {

    EditText userJoin_nickname, userJoin_info;
    ImageView userJoin_profilePhoto;
    Button userJoin_success;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_join);

        userJoin_info = findViewById(R.id.userJoin_info);
        userJoin_nickname = findViewById(R.id.userJoin_nickname);
        userJoin_profilePhoto = findViewById(R.id.userJoin_profilePhoto);
        userJoin_success = findViewById(R.id.userJoin_success);

    }
}