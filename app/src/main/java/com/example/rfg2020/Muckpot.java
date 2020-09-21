package com.example.rfg2020;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class Muckpot extends Fragment {
    private View  view;

    ImageView muckImg;
    TextView muckTitle;
    TextView muckTime;
    TextView muckTextPreview;
    TextView muckLocation;
    TextView muckTotalMember;

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

        return view;
    }
}