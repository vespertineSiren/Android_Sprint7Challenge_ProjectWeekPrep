package com.fatehistory.patrickjmartin.fatehistory;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class ViewPageAdapter extends FragmentPagerAdapter {

    private static int NUM_ITEMS = 3;

    @Override
    public Fragment getItem(int i) {
        switch (i) {
            case 0:
                return RandomHFFragment.newInstance();
            case 1:
                return FavoriteFragment.newInstance(1);
            case 2:
                return PastViewedFragment.newInstance(1);
            default:
                return null;
        }
    }

    public ViewPageAdapter(FragmentManager fragmentManager) {
        super(fragmentManager);
    }

    @Override
    public int getCount() {
        return NUM_ITEMS;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {

        switch (position) {
            case 0:
                return "Random Historical Figure";
            case 1:
                return "Favorite Historical Figure";
            case 2:
                return "Past Viewed Historical Figure";
            default:
                return null;

        }
    }


}
