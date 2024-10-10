package com.tunahankaryagdi.mapster.presentation.components

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.Dp
import com.tunahankaryagdi.mapster.ui.theme.Dimensions


@Composable
fun MapsterVerticalSpacer(
    modifier: Modifier = Modifier,
    height: Dp = Dimensions.MediumPadding
) {
    Spacer(modifier = modifier.height(height))
}