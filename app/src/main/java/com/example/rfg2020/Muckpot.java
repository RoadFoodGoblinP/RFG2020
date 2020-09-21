package com.example.rfg2020;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class Muckpot extends Fragment {
    private View  view;
    private FloatingActionButton muck_WriteBtn;

    ImageView muckImg;
    TextView muckTitle;
    TextView muckTime;
    TextView muckTextPreview;
    TextView muckLocation;
    TextView muckTotalMember;
    LinearLayout muck_list;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.activity_muckpot, container, false);

        muckImg = view.findViewById(R.id.muck_Img);
        muckTitle = view.findViewById(R.id.muck_Title);
        muckTime = view.findViewById(R.id.muck_Time);
        muckTextPreview = view.findViewById(R.id.muck_TextPreview);
        muckLocation = view.findViewById(R.id.muck_Location);
        muckTotalMember = view.findViewById(R.id.muck_TotalMember);
        muck_list = view.findViewById(R.id.muck_list);
        muck_WriteBtn = view.findViewById(R.id.muck_WriteBtn);

        // 하나의 먹팟 화면으로 이동 (Muckpot_Detail)
        muck_list.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), Muckpot_Detail.class);
                startActivity(intent);
            }
        });

        //피드 작성 버튼
        muck_WriteBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), FeedWrite.class);
                startActivity(intent);
            }
        });

        return view;
    }
}