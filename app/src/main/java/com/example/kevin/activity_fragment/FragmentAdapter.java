package com.example.kevin.activity_fragment;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.kevin.activity_fragment.Fragment.Fragment1;
import com.example.kevin.activity_fragment.Fragment.Fragment2;

public class FragmentAdapter extends FragmentPagerAdapter{


    public FragmentAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return Fragment1.newInstance("Fragmento1");
            case 1:
                return Fragment2.newInstance("Fragmento2");
            default:
                return Fragment1.newInstance("Default");
        }

    }

    @Override
    public int getCount() {
        return 2;
    }
}
