package com.example.guitarista.citem;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by smdojt on 1/11/2017.
 */

public class PagerAdapter extends FragmentStatePagerAdapter{
    int mNumOfTabs;
    public PagerAdapter(FragmentManager fm, int NumOfTabs) {
        super(fm);
        this.mNumOfTabs = NumOfTabs;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                TabInternationalFragment tab1 = new TabInternationalFragment();
                return tab1;
            case 1:
                TabLocalFragment tab2 = new TabLocalFragment();
                return tab2;
            case 2:
                TabAllFragment tab3 = new TabAllFragment();
                return tab3;
            case 3:
                TabVIPFragment tab4 = new TabVIPFragment();
                return tab4;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return mNumOfTabs;
    }
}
