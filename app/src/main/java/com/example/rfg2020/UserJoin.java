package com.example.rfg2020;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class UserJoin extends AppCompatActivity {

    EditText userJoin_nickname, userJoin_info;
    ImageView userJoin_profileImg;
    Button userJoin_success;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_join);

        userJoin_info = findViewById(R.id.userJoin_info);
        userJoin_nickname = findViewById(R.id.userJoin_nickname);
        userJoin_profileImg = findViewById(R.id.userJoin_profileImg);
        userJoin_success = findViewById(R.id.userJoin_success);
        
        //이미지 테두리 둥글게
        userJoin_profileImg.setBackground(new ShapeDrawable(new OvalShape()));
        userJoin_profileImg.setClipToOutline(true);

        Intent intent = getIntent();
        String nickname = intent.getExtras().getString("nickname");
        String profileImgUrl = intent.getExtras().getString("profileImgUrl");

        userJoin_nickname.setText(nickname);
        Glide.with(this).load(profileImgUrl).into(userJoin_profileImg);

        userJoin_success.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplication(), Index.class);
                startActivity(intent);
            }
        });
    }
}