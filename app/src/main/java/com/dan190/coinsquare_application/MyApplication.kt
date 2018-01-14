package com.dan190.coinsquare_application

import android.app.Application

import timber.log.Timber

/**
 * Created by dougouk on 2018-01-13.
 */

class MyApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        if (BuildConfig.DEBUG) {
            Timber.plant(Timber.DebugTree())
        } else {
            // Plant Crashanalytics tree
        }
    }
}
