package com.codewithprakhar.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       // Toolbar mToolbar = (Toolbar) findViewById(R.id.toolbar);
        TabLayout mTabLayout = (TabLayout) findViewById(R.id.tabLayout);
        ViewPager mViewPager = (ViewPager) findViewById(R.id.viewPager);
       // setSupportActionBar(mToolbar);
        setupViewPager(mViewPager);
        mTabLayout.setupWithViewPager(mViewPager);
    }
    private void setupViewPager(ViewPager viewPager) {
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.add(getResources().getString(R.string.first), getResources().getColor(R.color.cyan));
        adapter.add(getResources().getString(R.string.second), getResources().getColor(R.color.teal));
        adapter.add(getResources().getString(R.string.third), getResources().getColor(R.color.amber));
        viewPager.setAdapter(adapter);
    }

}
