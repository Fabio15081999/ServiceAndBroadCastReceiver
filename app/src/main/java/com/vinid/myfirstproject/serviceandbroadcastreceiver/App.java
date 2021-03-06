package com.vinid.myfirstproject.serviceandbroadcastreceiver;

import android.app.Application;
import android.content.Context;

/**
 * Created by hungnm24 on 5/3/20
 * Copyright (c) {2020} VinID. All rights reserved.
 */

public class App extends Application {

    private static Application instance;

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
    }

    public static Context getAppContext() {
        return instance.getApplicationContext();
    }
}
