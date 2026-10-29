package com.nabil;

import android.app.Application;
import com.google.android.gms.games.PlayGamesSdk;

public class GeserApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        PlayGamesSdk.initialize(this);
    }
}
