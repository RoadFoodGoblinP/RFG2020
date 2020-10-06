package com.example.rfg2020;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import android.view.MenuItem;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    private BottomNavigationView bottomNavigationView;
    private FragmentManager fm;
    private FragmentTransaction ft;
    private Feed feed_activity;
    private Map map_activity;
    private Muckpot muckpot_activity;
    private Search search_activity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        bottomNavigationView = findViewById(R.id.bottom_navigation);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()) {
                    case R.id.feed_navigation:
                        setFrag(0);
                        break;
                    case R.id.map_navigation:
                        setFrag(1);
                        break;
                    case R.id.muckpot_navigation:
                        setFrag(2);
                        break;
                    case R.id.search_navigation:
                        setFrag(3);
                        break;
                }
                return true;
            }
        });

        feed_activity = new Feed();
        map_activity = new Map();
        muckpot_activity = new Muckpot();
        search_activity = new Search();
        setFrag(0);
    }

    private void setFrag(int n) {
        fm = getSupportFragmentManager();
        ft = fm.beginTransaction();
        switch (n) {
            case 0:
                ft.replace(R.id.main_frame, feed_activity);
                ft.commit();
                break;
            case 1:
                ft.replace(R.id.main_frame, map_activity);
                ft.commit();
                break;
            case 2:
                ft.replace(R.id.main_frame, muckpot_activity);
                ft.commit();
                break;
            case 3:
                ft.replace(R.id.main_frame, search_activity);
                ft.commit();
                break;
        }
    }
}