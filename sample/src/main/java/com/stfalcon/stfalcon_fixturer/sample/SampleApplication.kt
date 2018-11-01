package com.stfalcon.stfalcon_fixturer.sample

import android.app.Application
import com.stfalcon.stfalcon_fixturer.StfalconFixturer

/*
 * Created by Anton Bevza on 10/30/18.
 */
class SampleApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        StfalconFixturer.init(this, R.raw.fixtures)
    }
}