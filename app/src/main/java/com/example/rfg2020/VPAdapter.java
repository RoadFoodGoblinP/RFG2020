package com.example.rfg2020;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.ArrayList;

public class VPAdapter extends FragmentPagerAdapter {
    private ArrayList<Fragment> items;

    public VPAdapter(FragmentManager fm) {
        super(fm);
        items = new ArrayList<>();
        items.add(new FragmentSearchHotfeed());
        items.add(new FragmentSearchHotmuck());
    }

    @NonNull
    @Override
    public Fragment getItem(int position) { return items.get(position); }

    @Override
    public int getCount() { return items.size(); }
}
