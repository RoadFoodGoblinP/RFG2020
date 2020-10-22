package com.example.rfg2020;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.bumptech.glide.Glide;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.kakao.auth.Session;

public class Feed extends Fragment {
    private View view;
    private ImageView feed_profileImg, feed_profile;
    private FloatingActionButton feed_WriteBtn;
    private LinearLayout feed_AllFeed;
    private DrawerLayout drawer_layout;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.activity_feed, container, false);

        feed_profile = view.findViewById(R.id.feed_profile);
        feed_profileImg = view.findViewById(R.id.feed_profileImg);
        drawer_layout = view.findViewById(R.id.drawer_layout);

        feed_profile.setBackground(new ShapeDrawable(new OvalShape()));
        feed_profile.setClipToOutline(true);

        Intent intent = getActivity().getIntent();
        String nickname = intent.getExtras().getString("nickname");
        String profileImgUrl = intent.getExtras().getString("profileImgUrl");

        Glide.with(this).load(profileImgUrl).into(feed_profileImg);

        // 상단바 프로필 사진 클릭시 드로어메뉴 등장
        feed_profileImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                drawer_layout.openDrawer(GravityCompat.START);
            }
        });

        // 회원 프로필 화면으로 이동 (UserProfile)
        feed_profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), UserProfile.class);
                startActivity(intent);
            }
        });

        feed_AllFeed = view.findViewById(R.id.feed_AllFeed);
        feed_WriteBtn = view.findViewById(R.id.feed_WriteBtn);

        // 하나의 피드 화면으로 이동 (FeedDetail)
        feed_AllFeed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), FeedDetail.class);
                startActivity(intent);
            }
        });

        //피드 작성 버튼
        feed_WriteBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), FeedWrite.class);
                startActivity(intent);
            }
        });
        return view;
    }


}