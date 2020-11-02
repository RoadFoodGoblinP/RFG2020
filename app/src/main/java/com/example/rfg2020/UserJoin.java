package com.example.rfg2020;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.AsyncTask;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.toolbox.Volley;
import com.bumptech.glide.Glide;
import com.kakao.sdk.user.model.User;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class UserJoin extends AppCompatActivity {

    EditText userJoin_nickname, userJoin_info;
    ImageView userJoin_back, userJoin_profileImg;
    Button userJoin_success;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_join);

        userJoin_info = findViewById(R.id.userJoin_info);
        userJoin_nickname = findViewById(R.id.userJoin_nickname);
        userJoin_back = findViewById(R.id.userJoin_back);
        userJoin_profileImg = findViewById(R.id.userJoin_profileImg);
        userJoin_success = findViewById(R.id.userJoin_success);
        
        //이미지 테두리 둥글게
        userJoin_profileImg.setBackground(new ShapeDrawable(new OvalShape()));
        userJoin_profileImg.setClipToOutline(true);

        Intent intent = getIntent();
        int MemberNo = (int)intent.getExtras().getLong("id");
        String Password = MemberNo + "0";
        String Nickname = intent.getExtras().getString("nickname");
        String Name = intent.getExtras().getString("nickname");
        String OneInfo = userJoin_info.getText().toString();
        String ProfileImg = intent.getExtras().getString("profileImgUrl");


        userJoin_nickname.setText(Nickname);
        Glide.with(this).load(ProfileImg).into(userJoin_profileImg);

        userJoin_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { finish(); }});

        userJoin_success.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Response.Listener<String> responseListener = new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        try {
                            JSONObject jsonObject = new JSONObject(response);
                            boolean success = jsonObject.getBoolean("success");
                            if (success) { // 회원등록에 성공한 경우
                                Toast.makeText(getApplicationContext(), "회원 등록에 성공하였습니다.", Toast.LENGTH_SHORT).show();
                                Intent intent = new Intent(UserJoin.this, Feed.class);
                                startActivity(intent);
                            } else { // 회원등록에 실패한 경우
                                Toast.makeText(getApplicationContext(), "회원 등록에 실패하였습니다.", Toast.LENGTH_SHORT).show();
                                return;
                            }
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }

                    }
                };

                // 서버로 Volley를 이용해서 요청을 함.
                RegisterRequest registerRequest = new RegisterRequest(MemberNo, Password, Nickname, Name, OneInfo, ProfileImg, responseListener);
                RequestQueue queue = Volley.newRequestQueue(UserJoin.this);
                queue.add(registerRequest);

                Intent intent = new Intent(UserJoin.this, Index.class);
                startActivity(intent);
            }
        });
    }

}