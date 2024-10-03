package com.blueland.android_compose_sample.ui

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel
import com.blueland.android_compose_sample.viewmodel.DetailViewModel

@Composable
fun DetailScreen(viewModel: DetailViewModel = hiltViewModel()) {
    val detail = viewModel.detailData.value ?: "Loading..."
    Text(text = detail)
}