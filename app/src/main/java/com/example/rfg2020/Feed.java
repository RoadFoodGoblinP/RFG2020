package com.example.rfg2020;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.kakao.auth.Session;

public class Feed extends Fragment {
    private View view;
    private ImageView feed_profile;
    private FloatingActionButton feed_WriteBtn;
    private LinearLayout feed_AllFeed;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.activity_feed, container, false);

        feed_profile = view.findViewById(R.id.feed_profile);
        feed_profile.setBackground(new ShapeDrawable(new OvalShape()));
        feed_profile.setClipToOutline(true);


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