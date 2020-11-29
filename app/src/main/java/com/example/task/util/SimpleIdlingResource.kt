package com.example.task.util

import androidx.test.espresso.idling.CountingIdlingResource
import com.example.task.BuildConfig

/**
 * Created by Rajat Sangrame
 * http://github.com/rajatsangrame
 */
object SimpleIdlingResource {

    private const val RESOURCE = "GLOBAL"

    @JvmField
    val countingIdlingResource = CountingIdlingResource(RESOURCE)

    fun increment() {
        if (BuildConfig.DEBUG) {
            countingIdlingResource.increment()
        }
    }

    fun decrement() {
        if (!countingIdlingResource.isIdleNow && BuildConfig.DEBUG) {
            countingIdlingResource.decrement()
        }
    }
}