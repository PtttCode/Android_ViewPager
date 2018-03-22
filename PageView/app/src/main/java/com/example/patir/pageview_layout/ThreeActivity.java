package com.example.patir.pageview_layout;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;

import java.util.ArrayList;

/**
 * Created by PATIR on 2018/3/22.
 */

public class ThreeActivity extends AppCompatActivity{

    private ArrayList<View> aList;
    private ArrayList<String> sList;
    private PageAdapter2 mAdapter;


    @Override
    public void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_two);
            ViewPager vpager_two =  findViewById(R.id.vpager_two);
            aList = new ArrayList<View>();
            LayoutInflater li = getLayoutInflater();
            aList.add(li.inflate(R.layout.page1,null,false));
            aList.add(li.inflate(R.layout.page2,null,false));
            aList.add(li.inflate(R.layout.page3, null, false));
            sList = new ArrayList<String>();
            sList.add("Page1");
            sList.add("Page2");
            sList.add("Page3");
            mAdapter = new PageAdapter2(aList,sList);
            vpager_two.setAdapter(mAdapter);
    }
}
