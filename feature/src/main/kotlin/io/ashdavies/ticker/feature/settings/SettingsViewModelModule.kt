package io.ashdavies.ticker.feature.settings

import android.arch.lifecycle.ViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap
import io.ashdavies.ticker.feature.inject.ViewModelKey

@Module
internal interface SettingsViewModelModule {

  @Binds
  @IntoMap
  @ViewModelKey(SettingsViewModel::class)
  fun settingsViewModel(model: SettingsViewModel): ViewModel
}
