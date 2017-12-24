package io.ashdavies.ticker.feature.settings

import android.support.v4.app.FragmentActivity
import dagger.Binds
import dagger.Module

@Module(includes = [SettingsViewModelModule::class])
internal interface SettingsModule {

  @Binds
  fun activity(activity: SettingsActivity): FragmentActivity
}
