package com.example.patir.pageview_layout;

/**
 * Created by PATIR on 2018/3/22.
 */

import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

/**
 * Created by PATIR on 2018/3/22.
 */

public class PageAdapter extends PagerAdapter
{
    private ArrayList<View> viewLists;

    public PageAdapter(ArrayList<View> viewLists)
    {
        super();
        this.viewLists=viewLists;
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
    public Object instantiateItem(ViewGroup container,int position)
    {
        container.addView(viewLists.get(position));
        return position;
    }

    @Override
    public void destroyItem(ViewGroup container,int position,Object object)
    {
        container.removeView(viewLists.get(position));
    }
}