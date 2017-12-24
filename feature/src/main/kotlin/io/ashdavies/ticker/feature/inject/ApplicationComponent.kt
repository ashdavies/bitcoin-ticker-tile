package io.ashdavies.ticker.feature.inject

import android.app.Application
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import io.ashdavies.ticker.feature.Ticker
import io.ashdavies.ticker.feature.network.NetworkModule

@Component(modules = [
  ApplicationModule::class,
  AndroidSupportInjectionModule::class,
  ActivityBindingModule::class,
  NetworkModule::class
])
internal interface ApplicationComponent : AndroidInjector<Ticker> {

  @Component.Builder
  interface Builder {

    @BindsInstance
    fun application(application: Application): Builder

    fun build(): ApplicationComponent
  }
}
