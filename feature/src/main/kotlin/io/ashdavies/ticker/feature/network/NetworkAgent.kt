package io.ashdavies.ticker.feature.network

import javax.inject.Qualifier
import kotlin.annotation.AnnotationRetention.RUNTIME

@Qualifier
@Retention(RUNTIME)
internal annotation class NetworkAgent
