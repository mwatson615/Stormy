// Generated code from Butter Knife. Do not modify!
package com.mw.stormy;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.mw.stormy.ui.MainActivity;

import butterknife.Unbinder;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;

public class MainActivity_ViewBinding implements Unbinder {
  private MainActivity target;

  @UiThread
  public MainActivity_ViewBinding(MainActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public MainActivity_ViewBinding(MainActivity target, View source) {
    this.target = target;

    target.mTemperatureLabel = Utils.findRequiredViewAsType(source, R.id.temperatureLabel, "field 'mTemperatureLabel'", TextView.class);
    target.mTimeLabel = Utils.findRequiredViewAsType(source, R.id.timeLabel, "field 'mTimeLabel'", TextView.class);
    target.mHumidityValue = Utils.findRequiredViewAsType(source, R.id.humidityValue, "field 'mHumidityValue'", TextView.class);
    target.mPrecipValue = Utils.findRequiredViewAsType(source, R.id.precipValue, "field 'mPrecipValue'", TextView.class);
    target.mSummaryLabel = Utils.findRequiredViewAsType(source, R.id.summaryLabel, "field 'mSummaryLabel'", TextView.class);
    target.mIconImageView = Utils.findRequiredViewAsType(source, R.id.iconImageView, "field 'mIconImageView'", ImageView.class);
    target.mRefreshImageView = Utils.findRequiredViewAsType(source, R.id.refreshImageView, "field 'mRefreshImageView'", ImageView.class);
    target.mProgressBar = Utils.findRequiredViewAsType(source, R.id.progressBar, "field 'mProgressBar'", ProgressBar.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    MainActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mTemperatureLabel = null;
    target.mTimeLabel = null;
    target.mHumidityValue = null;
    target.mPrecipValue = null;
    target.mSummaryLabel = null;
    target.mIconImageView = null;
    target.mRefreshImageView = null;
    target.mProgressBar = null;
  }
}
