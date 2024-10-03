package com.blueland.android_compose_sample.ui

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel
import com.blueland.android_compose_sample.viewmodel.MainViewModel

@Composable
fun MainScreen(viewModel: MainViewModel = hiltViewModel()) {
    val data = viewModel.data.value ?: "Loading..."
    Text(text = data)
}