package com.example.patir.pageview_layout;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

    /*private ViewPager vpager_one;
    private ArrayList<View> aList;
    private PageAdapter mAdapter;*/
    private ViewPager vpager_two;
    private ArrayList<View> aList;
    private ArrayList<String> sList;
    private PageAdapter2 mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);
        //viewP=findViewById(R.id.vpager_one);
        init();
    }


    /*public void onClick(View view) {
       // viewP.setCurrentItem(0);
                Intent intent = new Intent(this, TwoActivity.class);
                startActivity(intent);

    }*/
    public void init()
    {
            vpager_two =  findViewById(R.id.vpager_two);
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
