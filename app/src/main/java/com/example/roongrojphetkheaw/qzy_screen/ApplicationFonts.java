package com.example.roongrojphetkheaw.qzy_screen;

import android.app.Application;

import uk.co.chrisjenx.calligraphy.CalligraphyConfig;

/**
 * Created by Kotchaphan Muangsan on 19/8/2558.
 */
public class ApplicationFonts extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        CalligraphyConfig.initDefault(new CalligraphyConfig.Builder()
                .setDefaultFontPath("font/thsarabunnew.ttf")
                .setFontAttrId(R.attr.fontPath)
                .build());

    }
}