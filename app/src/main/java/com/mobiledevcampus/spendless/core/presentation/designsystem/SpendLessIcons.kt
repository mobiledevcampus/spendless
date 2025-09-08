package com.mobiledevcampus.spendless.core.presentation.designsystem

import androidx.compose.foundation.Image
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.vectorResource
import com.mobiledevcampus.spendless.R

object SpendLessIcons {

    val TrendingUp: ImageVector
        @Composable
        get() = ImageVector.vectorResource(R.drawable.trending_up)

    val TrendingDown: ImageVector
        @Composable
        get() = ImageVector.vectorResource(R.drawable.trending_down)

    val Settings: ImageVector
        @Composable
        get() = ImageVector.vectorResource(R.drawable.settings)

    val Notes: ImageVector
        @Composable
        get() = ImageVector.vectorResource(R.drawable.notes)

    val NavigateNext: ImageVector
        @Composable
        get() = ImageVector.vectorResource(R.drawable.navigate_next)

    val NavigateBefore: ImageVector
        @Composable
        get() = ImageVector.vectorResource(R.drawable.navigate_before)

    val Lock: ImageVector
        @Composable
        get() = ImageVector.vectorResource(R.drawable.lock)

    val Logout: ImageVector
        @Composable
        get() = ImageVector.vectorResource(R.drawable.logout)

    val FingerPrint: ImageVector
        @Composable
        get() = ImageVector.vectorResource(R.drawable.fingerprint)

    val Download: ImageVector
        @Composable
        get() = ImageVector.vectorResource(R.drawable.download)

    val Close: ImageVector
        @Composable
        get() = ImageVector.vectorResource(R.drawable.close)

    val CheckIndeterminateSmall: ImageVector
        @Composable
        get() = ImageVector.vectorResource(R.drawable.check_indeterminate_small)

    val Check: ImageVector
        @Composable
        get() = ImageVector.vectorResource(R.drawable.check)

    val Backspace: ImageVector
        @Composable
        get() = ImageVector.vectorResource(R.drawable.backspace)

    val ArrowForward: ImageVector
        @Composable
        get() = ImageVector.vectorResource(R.drawable.arrow_forward)

    val ArrowBack: ImageVector
        @Composable
        get() = ImageVector.vectorResource(R.drawable.arrow_back)

    val ArrowDropDown: ImageVector
        @Composable
        get() = ImageVector.vectorResource(R.drawable.arrow_drop_down)

    val ArrowDropUp: ImageVector
        @Composable
        get() = ImageVector.vectorResource(R.drawable.arrow_drop_up)

    val Add: ImageVector
        @Composable
        get() = ImageVector.vectorResource(R.drawable.add)

    val AccountBalanceWallet: ImageVector
        @Composable
        get() = ImageVector.vectorResource(R.drawable.account_balance_wallet)

    val FAB: ImageVector
        @Composable
        get() = ImageVector.vectorResource(R.drawable.floatingbutton)
}