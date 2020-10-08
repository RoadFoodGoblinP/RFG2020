package com.example.rfg2020;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Search extends Fragment {
    private View view;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.activity_search, container, false);

        ViewPager vp = view.findViewById(R.id.searchViewpager);
        VPAdapter adapter = new VPAdapter(getActivity().getSupportFragmentManager());
        vp.setAdapter(adapter);

        return view;
    }
}