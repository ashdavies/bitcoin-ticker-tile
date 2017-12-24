package io.ashdavies.ticker.feature.inject

import dagger.Module
import dagger.android.ContributesAndroidInjector
import io.ashdavies.ticker.feature.settings.SettingsActivity
import io.ashdavies.ticker.feature.settings.SettingsModule

@Module
internal interface ActivityBindingModule {

  @ContributesAndroidInjector(modules = [SettingsModule::class])
  fun preferenceActivity(): SettingsActivity
}
