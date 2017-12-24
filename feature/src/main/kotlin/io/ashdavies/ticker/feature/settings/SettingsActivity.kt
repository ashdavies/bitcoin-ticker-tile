package io.ashdavies.ticker.feature.settings

import android.os.Bundle
import dagger.android.support.DaggerAppCompatActivity
import io.ashdavies.ticker.feature.R
import io.ashdavies.ticker.feature.architecture.ViewModelFactory
import io.ashdavies.ticker.feature.databinding.ActivitySettingsBinding
import io.ashdavies.ticker.feature.extensions.getDataBinding
import io.ashdavies.ticker.feature.extensions.getViewModel
import kotlinx.android.synthetic.main.activity_settings.toolbar
import javax.inject.Inject

class SettingsActivity : DaggerAppCompatActivity() {

  private lateinit var binding: ActivitySettingsBinding

  @Inject internal lateinit var factory: ViewModelFactory

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)

    binding = getDataBinding(R.layout.activity_settings)
    binding.model = getViewModel(factory)

    setSupportActionBar(toolbar)
  }
}
