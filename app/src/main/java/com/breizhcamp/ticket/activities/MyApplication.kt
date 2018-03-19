package com.breizhcamp.ticket.activities

import android.app.Application


class MyApplication : Application() {


    override fun onCreate() {
        super.onCreate()
        instance = this
    }

    companion object {


        @get:Synchronized
        var instance: MyApplication? = null
            private set
    }
}
