package com.example.unscramblegame

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.unscramblegame.ui.theme.UnscrambleGameTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            UnscrambleGameTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) {
                    UnscrambleGameApp(modifier = Modifier.padding(it))
                }
            }
        }
    }
}

@Composable
fun UnscrambleGameApp(
    modifier: Modifier = Modifier
) {

}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    UnscrambleGameTheme {
        UnscrambleGameApp()
    }
}