package com.example.kevin.activity_fragment;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class TabLayoutActivity extends AppCompatActivity {

    ViewPager mViewPager;
    FragmentAdapter mFragmentAdapter;
    TabLayout mTabLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab_layout);
        mViewPager = findViewById(R.id.vpFragment);
        mTabLayout = findViewById(R.id.tabs);
        iniUi();
    }
    private void iniUi(){
        mFragmentAdapter = new FragmentAdapter(getSupportFragmentManager());
        mViewPager.setAdapter(mFragmentAdapter);

        int pageCount= mFragmentAdapter.getCount();

        mViewPager.setOffscreenPageLimit(pageCount);

        TabLayout.TabLayoutOnPageChangeListener mTabLayoutListener =  new TabLayout.TabLayoutOnPageChangeListener(mTabLayout);

        TabLayout.Tab tab1 = mTabLayout.newTab();
        tab1.setText(R.string.name1);
        mTabLayout.addTab(tab1);
        TabLayout.Tab tab2 = mTabLayout.newTab();
        tab2.setIcon(R.drawable.ic_shopping_cart_black_24dp);
        tab2.setText(R.string.name2);
        mTabLayout.addTab(tab2);

        mViewPager.addOnPageChangeListener(mTabLayoutListener);
        mTabLayout.addOnTabSelectedListener(new TabLayout.ViewPagerOnTabSelectedListener(mViewPager));




    }

}
