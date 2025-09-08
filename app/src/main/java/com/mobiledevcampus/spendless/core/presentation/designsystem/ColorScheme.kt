package com.mobiledevcampus.spendless.core.presentation.designsystem

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.ColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

val ColorScheme.primaryFixed: Color
    @Composable
    get() = if (isSystemInDarkTheme()) PrimaryFixed else PrimaryFixed


val ColorScheme.onPrimaryFixed: Color
    @Composable
    get() = if (isSystemInDarkTheme()) OnPrimaryFixed else OnPrimaryFixed

val ColorScheme.secondaryFixed: Color
    @Composable
    get() = if (isSystemInDarkTheme()) SecondaryFixed else SecondaryFixed

val ColorScheme.secondaryFixedDim: Color
    @Composable
    get() = if (isSystemInDarkTheme()) SecondaryFixedDim else SecondaryFixedDim

val ColorScheme.success: Color
    @Composable
    get() = if (isSystemInDarkTheme()) Success else Success

val ColorScheme.primaryOpacity12: Color
    @Composable
    get() = if (isSystemInDarkTheme()) PrimaryOpacity12 else PrimaryOpacity12


val ColorScheme.primaryOpacity16: Color
    @Composable
    get() = if (isSystemInDarkTheme()) PrimaryOpacity16 else PrimaryOpacity16


val ColorScheme.primaryContainerOpacity8: Color
    @Composable
    get() = if (isSystemInDarkTheme()) PrimaryContainerOpacity8 else PrimaryContainerOpacity8

val ColorScheme.primaryContainerOpacity12: Color
    @Composable
    get() = if (isSystemInDarkTheme()) PrimaryContainerOpacity12 else PrimaryContainerOpacity12

val ColorScheme.onSecondaryOpacity8: Color
    @Composable
    get() = if (isSystemInDarkTheme()) OnSecondaryOpacity8 else OnSecondaryOpacity8

val ColorScheme.onSecondaryOpacity12: Color
    @Composable
    get() = if (isSystemInDarkTheme()) OnSecondaryOpacity12 else OnSecondaryOpacity12

val ColorScheme.errorOpacity8: Color
    @Composable
    get() = if (isSystemInDarkTheme()) ErrorOpacity8 else ErrorOpacity8

val ColorScheme.errorOpacity12: Color
    @Composable
    get() = if (isSystemInDarkTheme()) ErrorOpacity12 else ErrorOpacity12

val ColorScheme.onPrimaryOpacity12: Color
    @Composable
    get() = if (isSystemInDarkTheme()) OnPrimaryOpacity12 else OnPrimaryOpacity12

val ColorScheme.onBackgroundOpacity8: Color
    @Composable
    get() = if (isSystemInDarkTheme()) OnBackgroundOpacity8 else OnBackgroundOpacity8

val ColorScheme.onBackgroundOpacity12: Color
    @Composable
    get() = if (isSystemInDarkTheme()) OnBackgroundOpacity12 else OnBackgroundOpacity12

val ColorScheme.onSurfaceOpacity12: Color
    @Composable
    get() = if (isSystemInDarkTheme()) OnSurfaceOpacity12 else OnSurfaceOpacity12

val ColorScheme.onSurfaceVariantOpacity12: Color
    @Composable
    get() = if (isSystemInDarkTheme()) OnSurfaceVariantOpacity12 else OnSurfaceVariantOpacity12