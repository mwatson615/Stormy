package com.mw.stormy.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.mw.stormy.R;
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
        ViewHolder holder;

        if (convertView == null) {
            convertView = LayoutInflater.from(mContext)
                    .inflate(R.layout.daily_list_item, null);
            holder = new ViewHolder();
            holder.iconImageView = (ImageView) convertView
                    .findViewById(R.id.iconImageView);
            holder.temperatureLabel = (TextView) convertView
                    .findViewById(R.id.temperatureLabel);
            holder.dayLabel = (TextView) convertView
                    .findViewById(R.id.dayNameLabel);
            convertView.setTag(holder);
            holder.circleImageView = (ImageView) convertView
                    .findViewById(R.id.circleImageView);

            holder.circleImageView.setImageResource(R.drawable.bg_temperature);
        }
        else {
            holder = (ViewHolder) convertView.getTag();
        }

        Day day = mDays[position];

        holder.iconImageView.setImageResource(day.getIconId());
        holder.temperatureLabel.setText(day.getTemperatureMax() + "");

        if (position == 0) {
            holder.dayLabel.setText("Today");
        }
        else {
            holder.dayLabel.setText(day.getDayOfTheWeek());
        }
        return convertView;
    }

    private static class ViewHolder {
        ImageView iconImageView;
        TextView temperatureLabel;
        TextView dayLabel;
        ImageView circleImageView;
    }
}
