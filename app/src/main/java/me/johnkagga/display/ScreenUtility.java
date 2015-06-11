package me.johnkagga.display;

import android.app.Activity;
import android.util.DisplayMetrics;
import android.view.Display;

/**
 * Created by John on 6/11/2015.
 */
public class ScreenUtility {
    private Activity activity;
    private float dpHeight;
    private float dpWidth;

    public float getDpHeight() {
        return dpHeight;
    }

    public float getDpWidth() {
        return dpWidth;
    }

    public ScreenUtility(Activity activity) {
        this.activity = activity;

        Display display = activity.getWindowManager().getDefaultDisplay();
        DisplayMetrics metrics = new DisplayMetrics();
        display.getMetrics(metrics);

        float density = activity.getResources().getDisplayMetrics().density;
        dpHeight = metrics.heightPixels/density;
        dpWidth = metrics.widthPixels/density;
    }
}
