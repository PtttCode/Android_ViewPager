package com.example.patir.pageview_layout;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by PATIR on 2018/3/22.
 */

public class OneActivity extends AppCompatActivity{

    private ViewPager vpager_one;
    private ArrayList<View> aList;
    private PageAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one);
        init();
    }

    public void init()
    {
        vpager_one=findViewById(R.id.vpager_one);

        aList=new ArrayList<View>();
        LayoutInflater li=getLayoutInflater();
        aList.add(li.inflate(R.layout.page1,null,false));
        aList.add(li.inflate(R.layout.page2,null,false));
        aList.add(li.inflate(R.layout.page3,null,false));
        mAdapter=new PageAdapter(aList);
        vpager_one.setAdapter(mAdapter);
        TextView textView=findViewById(R.id.textView);
        textView.setText("Test");
    }
}
