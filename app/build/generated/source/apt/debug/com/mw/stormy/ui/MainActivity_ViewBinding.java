// Generated code from Butter Knife. Do not modify!
package com.mw.stormy.ui;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.mw.stormy.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class MainActivity_ViewBinding implements Unbinder {
  private MainActivity target;

  private View view2131427436;

  @UiThread
  public MainActivity_ViewBinding(MainActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public MainActivity_ViewBinding(final MainActivity target, View source) {
    this.target = target;

    View view;
    target.mTemperatureLabel = Utils.findRequiredViewAsType(source, R.id.temperatureLabel, "field 'mTemperatureLabel'", TextView.class);
    target.mTimeLabel = Utils.findRequiredViewAsType(source, R.id.timeLabel, "field 'mTimeLabel'", TextView.class);
    target.mHumidityValue = Utils.findRequiredViewAsType(source, R.id.humidityValue, "field 'mHumidityValue'", TextView.class);
    target.mPrecipValue = Utils.findRequiredViewAsType(source, R.id.precipValue, "field 'mPrecipValue'", TextView.class);
    target.mSummaryLabel = Utils.findRequiredViewAsType(source, R.id.summaryLabel, "field 'mSummaryLabel'", TextView.class);
    target.mIconImageView = Utils.findRequiredViewAsType(source, R.id.iconImageView, "field 'mIconImageView'", ImageView.class);
    target.mRefreshImageView = Utils.findRequiredViewAsType(source, R.id.refreshImageView, "field 'mRefreshImageView'", ImageView.class);
    target.mProgressBar = Utils.findRequiredViewAsType(source, R.id.progressBar, "field 'mProgressBar'", ProgressBar.class);
    view = Utils.findRequiredView(source, R.id.dailyButton, "method 'startDailyActivity'");
    view2131427436 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.startDailyActivity(p0);
      }
    });
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

    view2131427436.setOnClickListener(null);
    view2131427436 = null;
  }
}
