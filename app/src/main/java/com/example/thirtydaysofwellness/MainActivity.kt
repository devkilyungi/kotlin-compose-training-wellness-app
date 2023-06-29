package com.example.thirtydaysofwellness

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.thirtydaysofwellness.ui.theme.ThirtyDaysOfWellnessTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ThirtyDaysOfWellnessTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ThirtyDaysOfWellnessApp()
                }
            }
        }
    }
}

@Composable
fun ThirtyDaysOfWellnessApp() {

}

@Preview(showBackground = true)
@Composable
fun ThirtyDaysOfWellnessAppPreview() {
    ThirtyDaysOfWellnessTheme(darkTheme = false) {
        ThirtyDaysOfWellnessApp()
    }
}

@Preview(showBackground = true)
@Composable
fun ThirtyDaysOfWellnessAppDarkThemePreview() {
    ThirtyDaysOfWellnessTheme(darkTheme = true) {
        ThirtyDaysOfWellnessApp()
    }
}