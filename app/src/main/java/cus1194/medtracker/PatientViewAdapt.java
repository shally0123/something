package cus1194.medtracker;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.ArrayList;

/**
 * Created by pruan086 on 3/7/2017.
 */

public class PatientViewAdapt extends FragmentStatePagerAdapter
{


    public PatientViewAdapt(FragmentManager fm)
    {
        super(fm);
    }



    @Override
    public Fragment getItem(int position)
    {
        Fragment fragment = null;
        if(position==0)
        {
            fragment = new PatientCurrentFragment();
        }
        if (position==1)
        {
            fragment = new PatientCalendarFragment();
        }
        return fragment;
    }

    @Override
    public int getCount()
    {
        return 2;
    }

    public CharSequence getPageTitle(int position)
    {
        return "Tab"+position;
    }


}
