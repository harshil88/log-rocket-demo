package com.example.logrocketdemo

import android.app.Application
import android.content.Context
import com.logrocket.core.SDK


class LogRocketDemoApp : Application() {
    override fun attachBaseContext(base: Context) {
        super.attachBaseContext(base)

        SDK.init(
            this,
            base
        ) { options ->
            options.appID = "ijwxie/log-rocket-demo"
        }
    }
}