package com.blueland.android_compose_sample.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.blueland.android_compose_sample.R
import com.blueland.android_compose_sample.ui.theme.LocalShapes
import com.blueland.android_compose_sample.ui.theme.LocalTextStyles
import com.blueland.android_compose_sample.viewmodel.MainViewModel
import kr.co.buddypay.mpay.ui.component.BottomButton

@Composable
fun MainScreen(viewModel: MainViewModel = hiltViewModel()) {
    Scaffold(
        Modifier.padding(20.dp)
    ) { paddingValues ->
        Column(
            Modifier.padding(paddingValues),
            verticalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            BottomButton(
                text = stringResource(R.string.next),
                onClick = { /* TODO */ }
            )
            BottomButton(
                text = stringResource(R.string.next),
                shape = LocalShapes.large,
                textStyle = LocalTextStyles.current.boldBodySm,
                onClick = { /* TODO */ }
            )
        }
    }
}