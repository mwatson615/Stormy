package com.mw.stormy.adapters;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.mw.stormy.weather.Day;

/**
 * Created by MW on 8/26/17.
 */

public class DayAdapter extends BaseAdapter{

    private Context mContext;
    private Day[] mDays;

    public DayAdapter (Context context, Day[] days) {
        mContext = context;
        mDays = days;
    }

    @Override
    public int getCount() {
        return mDays.length;
    }

    @Override
    public Object getItem(int position) {
        return mDays[position];
    }

    @Override
    public long getItemId(int position) {
        return 0; //tag items for easy reference
    }

    //where the mapping occurs
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        return null;
    }
}
