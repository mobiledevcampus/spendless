package com.mobiledevcampus.spendless.app.navigation

import androidx.navigation3.runtime.NavKey
import kotlinx.serialization.Serializable

@Serializable
sealed interface Routes : NavKey {

    @Serializable
    data object Login : Routes

    @Serializable
    data object Registration : Routes

    @Serializable
    data object CreatePin : Routes

    @Serializable
    data object RepeatPin : Routes

    @Serializable
    data object Onboarding : Routes

    @Serializable
    data object Dashboard : Routes

    @Serializable
    data object Transactions : Routes

    @Serializable
    data object Settings : Routes

    @Serializable
    data object Export : Routes
}