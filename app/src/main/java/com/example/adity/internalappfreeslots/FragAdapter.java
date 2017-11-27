package com.example.adity.internalappfreeslots;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;


public class FragAdapter extends FragmentStatePagerAdapter {

    public int Store;

    public FragAdapter(FragmentManager fm,int val) {
        super(fm);
        this.Store=val;
    }

    @Override
    public Fragment getItem(int position) {

        if (Store==1) {
            switch (position) {
                case 0:
                    MonFrag monFrag = new MonFrag();
                    return monFrag;
                case 1:
                    TueFrag tueFrag = new TueFrag();
                    return tueFrag;
                case 2:
                    WedFrag wedFrag = new WedFrag();
                    return wedFrag;
                case 3:
                    ThursFrag thursFrag = new ThursFrag();
                    return thursFrag;
                case 4:
                    FriFrag friFrag = new FriFrag();
                    return friFrag;
            }
        }
        else if(Store==2){
            switch (position) {
                case 0:
                    SMonFrag smonFrag = new SMonFrag();
                    return smonFrag;
                case 1:
                    STueFrag stueFrag = new STueFrag();
                    return stueFrag;
                case 2:
                    SWedFrag swedFrag = new SWedFrag();
                    return swedFrag;
                case 3:
                    SThursFrag sthursFrag = new SThursFrag();
                    return sthursFrag;
                case 4:
                    SFriFrag sfriFrag = new SFriFrag();
                    return sfriFrag;
            }

        }
        return null;
    }

    @Override
    public int getCount() {
        return 5;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch(position) {
            case 0: return "M";
            case 1: return "T";
            case 2: return "W";
            case 3: return "T";
            case 4: return "F";
        }
        return null;

    }
}
