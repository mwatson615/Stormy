package com.mw.stormy.ui;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;

import com.mw.stormy.R;
import com.mw.stormy.weather.Hour;

import java.util.Arrays;

public class HourlyForecastActivity extends AppCompatActivity {

    private Hour[] mHours;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hourly_forecast);

        Intent intent = getIntent();
        Parcelable[] parcelables = intent
                .getParcelableArrayExtra(MainActivity.HOURLY_FORECAST);
        //copies parc array to mhours, then length of parc, then type creating
        mHours = Arrays.copyOf(parcelables, parcelables.length, Hour[].class);
    }

}
