package com.example.patir.pageview_layout;

import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

/**
 * Created by PATIR on 2018/3/22.
 */

public class PageAdapter2 extends PagerAdapter {
    private ArrayList<View> viewLists;
    private ArrayList<String> titleLists;

    public PageAdapter2(ArrayList<View> viewLists,ArrayList<String> titleLists) {
        this.viewLists = viewLists;
        this.titleLists = titleLists;
    }

    @Override
    public int getCount()
    {
        return viewLists.size();
    }

    @Override
    public boolean isViewFromObject(View view, Object object)
    {
        return view == viewLists.get((int)Integer.parseInt(object.toString()));
    }

    @Override
    public int getItemPosition(Object object) {
        return super.getItemPosition(object);
    }


    @Override
    public Object instantiateItem(ViewGroup container, int position)
    {
        container.addView(viewLists.get(position));
        return position;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object)
    {
        container.removeView(viewLists.get(position));
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return "Page1";
            case 1:
                return "Page2";
            case 2:
                return "Page3";

            default:
                return "";
        }
    }
}
