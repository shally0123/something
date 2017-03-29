package cus1194.medtracker;

import android.app.ActionBar;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

/**
 * Created by pruan086 on 3/7/2017.
 */

public class PatientMain extends AppCompatActivity
{

    Toolbar toolbar;
    TabLayout tabLayout;
    ViewPager viewPager;
    PatientViewAdapt patientViewAdapt;

    protected void onCreate(Bundle savedIntanceState)
    {

        super.onCreate(savedIntanceState);
        //setContentView(R.layout.patient_main);

        final ActionBar actionBar = getActionBar();
        patientViewAdapt = new PatientViewAdapt(getSupportFragmentManager());
        //toolbar = (Toolbar)findViewById(R.id.toolBar);
        //setSupportActionBar(toolbar);
        //tabLayout = (TabLayout)findViewById(R.id.tabLayout);
        viewPager = (ViewPager)findViewById(R.id.viewPager);
        //patientViewAdapt = new PatientViewAdapt(getSupportFragmentManager());

        //patientViewAdapt.addFragments(new PatientCurrentFragment(), "Current");
        //patientViewAdapt.addFragments(new PatientCalendarFragment(), "Calendar");
        viewPager.setAdapter(patientViewAdapt);
        //tabLayout.setupWithViewPager(viewPager);


    }


}
