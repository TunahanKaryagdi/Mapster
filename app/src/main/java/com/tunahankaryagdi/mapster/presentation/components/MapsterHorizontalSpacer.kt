package com.tunahankaryagdi.mapster.presentation.components

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.Dp
import com.tunahankaryagdi.mapster.ui.theme.Dimensions


@Composable
fun MapsterHorizontalSpacer(
    modifier: Modifier = Modifier,
    width: Dp = Dimensions.MediumPadding
) {
    Spacer(modifier = modifier.width(width))
}