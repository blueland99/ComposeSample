package com.blueland.android_compose_sample

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import com.blueland.android_compose_sample.ui.MainScreen
import com.blueland.android_compose_sample.ui.theme.MyAppTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyApp {
                MainScreen() // MainScreen을 호출하여 화면을 구성
            }
        }
    }
}

@Composable
fun MyApp(content: @Composable () -> Unit) {
    MyAppTheme {
        Surface(color = MaterialTheme.colorScheme.background) {
            content()
        }
    }
}