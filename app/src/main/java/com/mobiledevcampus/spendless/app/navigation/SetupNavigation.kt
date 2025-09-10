package com.mobiledevcampus.spendless.app.navigation

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.navigation3.rememberViewModelStoreNavEntryDecorator
import androidx.navigation3.runtime.NavEntry
import androidx.navigation3.runtime.rememberNavBackStack
import androidx.navigation3.runtime.rememberSavedStateNavEntryDecorator
import androidx.navigation3.ui.NavDisplay

@Composable
fun SetupNavigation() {
    val backStack = rememberNavBackStack(Routes.Login)
    NavDisplay(
        backStack = backStack,
        entryDecorators = listOf(
            rememberSavedStateNavEntryDecorator(),
            rememberSavedStateNavEntryDecorator(),
            rememberViewModelStoreNavEntryDecorator()
        ),
    ) { key ->
        when (key) {
            is Routes.Login -> {
                NavEntry(
                    key = key
                ) {
                    Screen(key.toString())
                }
            }

            is Routes.Registration -> {
                NavEntry(
                    key = key
                ) {
                    Screen(key.toString())
                }
            }

            is Routes.CreatePin -> {
                NavEntry(
                    key = key
                ) {
                    Screen(key.toString())
                }
            }

            is Routes.RepeatPin -> {
                NavEntry(
                    key = key
                ) {
                    Screen(key.toString())
                }
            }

            is Routes.Onboarding -> {
                NavEntry(
                    key = key
                ) {
                    Screen(key.toString())
                }
            }

            is Routes.Dashboard -> {
                NavEntry(
                    key = key
                ) {
                    Screen(key.toString())
                }
            }

            is Routes.Transactions -> {
                NavEntry(
                    key = key
                ) {
                    Screen(key.toString())
                }
            }

            is Routes.Settings -> {
                NavEntry(
                    key = key
                ) {
                    Screen(key.toString())
                }
            }

            is Routes.Export -> {
                NavEntry(
                    key = key
                ) {
                    Screen(key.toString())
                }
            }

            else -> throw IllegalStateException("Unknown route $key")
        }
    }
}

@Composable
fun Screen(
    key: String
) {
    Text(
        text = key,
        modifier = Modifier
            .statusBarsPadding()
            .fillMaxSize()
            .wrapContentSize()
    )
}