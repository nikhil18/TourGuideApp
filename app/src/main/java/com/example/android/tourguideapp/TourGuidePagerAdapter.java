package com.example.android.tourguideapp;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;


public class TourGuidePagerAdapter extends FragmentPagerAdapter {

    private Context context;

    public TourGuidePagerAdapter(FragmentManager fm, Context context) {
        super(fm);
        this.context = context;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new GardenFragment();
        } else if (position == 1) {
            return new HotelFragment();
        } else if (position == 2) {
            return new MallFragment();
        } else {
            return new StreetFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return context.getString(R.string.tab_title_1);
        } else if (position == 1) {
            return context.getString(R.string.tab_title_2);
        } else if (position == 2) {
            return context.getString(R.string.tab_title_3);
        } else {
            return context.getString(R.string.tab_title_4);
        }
    }
}
