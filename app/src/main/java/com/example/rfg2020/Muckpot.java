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

    ImageView MuckImg;
    TextView MuckTitle;
    TextView MuckTime;
    TextView MuckTextPreview;
    TextView MuckLocation;
    TextView MuckTotalMember;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.activity_muckpot, container, false);

        MuckImg = view.findViewById(R.id.MuckImg);
        MuckTitle = view.findViewById(R.id.MuckTitle);
        MuckTime = view.findViewById(R.id.MuckTime);
        MuckTextPreview = view.findViewById(R.id.MuckTextPreview);
        MuckLocation = view.findViewById(R.id.MuckLocation);
        MuckTotalMember = view.findViewById(R.id.MuckTotalMember);

        return view;
    }
}