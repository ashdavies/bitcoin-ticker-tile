package io.ashdavies.ticker.feature.inject

import android.app.Application
import android.arch.lifecycle.ViewModelProvider
import android.preference.PreferenceManager
import dagger.Module
import dagger.Provides
import io.ashdavies.ticker.feature.architecture.ViewModelFactory
import io.ashdavies.ticker.feature.network.SchedulingStrategy
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

@Module
internal class ApplicationModule {

  @Provides
  fun model(model: ViewModelFactory): ViewModelProvider.Factory = model

  @Provides
  fun preferences(application: Application) = PreferenceManager.getDefaultSharedPreferences(application)

  @Provides
  fun strategy() = SchedulingStrategy(Schedulers.io(), AndroidSchedulers.mainThread())
}
