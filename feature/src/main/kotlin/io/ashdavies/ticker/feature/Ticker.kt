package io.ashdavies.ticker.feature

import dagger.android.AndroidInjector
import dagger.android.support.DaggerApplication
import io.ashdavies.ticker.feature.inject.DaggerApplicationComponent

class Ticker : DaggerApplication() {

  override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
    return DaggerApplicationComponent.builder()
        .application(this)
        .build()
  }
}
