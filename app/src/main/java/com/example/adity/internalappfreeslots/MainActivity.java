package com.example.adity.internalappfreeslots;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    public ViewPager viewPager1;
    public FragAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewPager1= (ViewPager) findViewById(R.id.myPager);
        adapter=new FragAdapter(getSupportFragmentManager(),1);
        viewPager1.setAdapter(adapter);
        TabLayout tabLayout= (TabLayout) findViewById(R.id.myTab);
        tabLayout.setupWithViewPager(viewPager1);
        final Button button1= (Button) findViewById(R.id.FYear);
        final Button button2= (Button) findViewById(R.id.SYear);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                yrfunc1(button1,button2);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                yrfunc2(button2,button1);
            }
        });
    }

    public void yrfunc1(Button v1,Button v2){

        viewPager1= (ViewPager) findViewById(R.id.myPager);
        adapter=new FragAdapter(getSupportFragmentManager(),1);
        viewPager1.setAdapter(adapter);
        TabLayout tabLayout= (TabLayout) findViewById(R.id.myTab);
        tabLayout.setupWithViewPager(viewPager1);
        toblue(v1);
        towhite(v2);
    }

    public void yrfunc2(Button v1,Button v2){

        viewPager1= (ViewPager) findViewById(R.id.myPager);
        adapter=new FragAdapter(getSupportFragmentManager(),2);
        viewPager1.setAdapter(adapter);
        TabLayout tabLayout= (TabLayout) findViewById(R.id.myTab);
        tabLayout.setupWithViewPager(viewPager1);
        toblue(v1);
        towhite(v2);
    }
    public void toblue(Button v1){
        Drawable drawable = getDrawable(R.drawable.buttonblue);
        v1.setBackground(drawable);
        v1.setTextColor(Color.WHITE);
    }

    public void towhite(Button v1){
        Drawable drawable = getDrawable(R.drawable.buttonborder);
        v1.setBackground(drawable);
        v1.setTextColor(Color.rgb(2, 152, 226));
    }



}
