package com.mw.stormy.ui;

import android.app.Activity;
import android.app.ListActivity;
import android.content.Intent;
import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.mw.stormy.R;
import com.mw.stormy.adapters.DayAdapter;
import com.mw.stormy.weather.Day;

import java.util.Arrays;

import butterknife.BindView;
import butterknife.ButterKnife;

import static android.R.id.message;
import static android.widget.Toast.makeText;

public class DailyForecastActivity extends ListActivity {

    private  Day[] mDays;

    //if want to use listview in regular activity --fragment?

    //change extends to Activity or ActionBarActivity
    //lose access to setlistadapter and onlistitemclick so must
    //set them on the listview itself

//    @BindView(android.R.id.list) ListView mListView;
//    @BindView(android.R.id.empty) TextView mEmptyTextview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daily_forecast);
//        ButterKnife.bind(this);

        Intent intent = getIntent();
        Parcelable[] parcelables = intent.getParcelableArrayExtra(MainActivity.DAILY_FORECAST);
        mDays = Arrays
                .copyOf(parcelables, parcelables.length, Day[].class);

        DayAdapter adapter = new DayAdapter(this, mDays);
        setListAdapter(adapter);
        //replace ^^ with
        //mListView.setAdapter(adapter);
//        mListView.setEmptyView(mEmptyTextView);
//        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                String dayOfTheWeek = mDays[position].getDayOfTheWeek();
//                String conditions = mDays[position].getSummary();
//                String highTemp = mDays[position].getTemperatureMax() + "";
//                String message = String.format("On %s the high will be %s and it will be %s",
//                        dayOfTheWeek,
//                        highTemp,
//                        conditions);
//                Toast.makeText(DailyForecastActivity.this, message, Toast.LENGTH_LONG).show();
//            }
//        });
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);

        String dayOfTheWeek = mDays[position].getDayOfTheWeek();
        String conditions = mDays[position].getSummary();
        String highTemp = mDays[position].getTemperatureMax() + "";
        String message = String.format("On %s the high will be %s and it will be %s",
                dayOfTheWeek,
                highTemp,
                conditions);
        Toast.makeText(this, message, Toast.LENGTH_LONG).show();
    }
}
