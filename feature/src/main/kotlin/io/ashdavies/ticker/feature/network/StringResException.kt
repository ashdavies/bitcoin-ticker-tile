package io.ashdavies.ticker.feature.network

import android.support.annotation.StringRes

internal class StringResException(@StringRes val resId: Int) : RuntimeException()
