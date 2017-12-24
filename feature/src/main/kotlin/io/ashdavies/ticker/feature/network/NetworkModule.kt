package io.ashdavies.ticker.feature.network

import dagger.Module
import dagger.Provides
import dagger.Reusable
import io.ashdavies.ticker.feature.BuildConfig
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import okhttp3.logging.HttpLoggingInterceptor.Level
import java.util.concurrent.TimeUnit

@Module
internal class NetworkModule {

  @Provides
  @NetworkAgent
  fun agent() = "ANDROID"

  @Provides
  fun logging() = HttpLoggingInterceptor().apply { level = if (BuildConfig.DEBUG) Level.BODY else Level.NONE }

  @Provides
  @Reusable
  fun client(headers: HeadersInterceptor, logging: HttpLoggingInterceptor) = OkHttpClient.Builder()
      .connectTimeout(TIMEOUT_IN_SECONDS.toLong(), TimeUnit.SECONDS)
      .readTimeout(TIMEOUT_IN_SECONDS.toLong(), TimeUnit.SECONDS)
      .writeTimeout(TIMEOUT_IN_SECONDS.toLong(), TimeUnit.SECONDS)
      .addInterceptor(headers)
      .addInterceptor(logging)
      .build()

  companion object {

    private const val TIMEOUT_IN_SECONDS = 5
  }
}
