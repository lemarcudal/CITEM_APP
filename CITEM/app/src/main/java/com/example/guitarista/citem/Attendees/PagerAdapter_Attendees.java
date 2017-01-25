package com.example.guitarista.citem.Attendees;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by Guitarista on 13/01/2017.
 */

public class PagerAdapter_Attendees extends FragmentStatePagerAdapter {
    int mNumOfTabs;

    public PagerAdapter_Attendees(FragmentManager fm, int NumOfTabs) {
        super(fm);
        this.mNumOfTabs = NumOfTabs;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                TabAllFragment tab1 = new TabAllFragment();
                return tab1;
            case 1:
                TabVIPFragment tab2 = new TabVIPFragment();
                return tab2;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return mNumOfTabs;
    }
}
