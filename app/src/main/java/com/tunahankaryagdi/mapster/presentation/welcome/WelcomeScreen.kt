package com.tunahankaryagdi.mapster.presentation.welcome

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import com.tunahankaryagdi.mapster.R
import com.tunahankaryagdi.mapster.presentation.components.MapsterPrimaryButton
import com.tunahankaryagdi.mapster.presentation.components.MapsterSecondaryButton
import com.tunahankaryagdi.mapster.presentation.components.MapsterVerticalSpacer
import com.tunahankaryagdi.mapster.ui.theme.Dimensions
import com.tunahankaryagdi.mapster.ui.theme.MapsterTheme


@Composable
fun WelcomeScreen(modifier: Modifier = Modifier) {

    Column {

        MapsterVerticalSpacer(height = Dimensions.ExtraLargePadding)

        Text(
            text = stringResource(id = R.string.welcome_to_lobby),
            style = MaterialTheme.typography.headlineMedium.copy(fontWeight = FontWeight.Bold)
        )

        MapsterVerticalSpacer()

        Text(
            text = stringResource(id = R.string.you_can_create),
            style = MaterialTheme.typography.bodyLarge
        )

        MapsterVerticalSpacer()

        MapsterPrimaryButton(
            modifier = Modifier
                .fillMaxWidth(),
            onClick = { },
            text = stringResource(id = R.string.create_new_lobby)
        )

        MapsterVerticalSpacer(height = Dimensions.SmallPadding)

        MapsterSecondaryButton(
            modifier = Modifier
                .fillMaxWidth(),
            onClick = { },
            text = stringResource(id = R.string.join_existing_lobby)
        )

    }


}


@Preview(showBackground = true)
@Composable
private fun WelcomeScreenPreview() {
    MapsterTheme {
        WelcomeScreen()
    }
}

