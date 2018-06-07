package com.thomaskioko.safaricomapi.util

import android.app.Application
import android.content.Context
import android.support.test.runner.AndroidJUnitRunner
import com.thomaskioko.safaricomapi.TestApp

/**
 * Custom runner to disable dependency injection.
 */
class SafaricomTestRunner : AndroidJUnitRunner() {
    override fun newApplication(cl: ClassLoader, className: String, context: Context): Application {
        return super.newApplication(cl, TestApp::class.java.name, context)
    }
}