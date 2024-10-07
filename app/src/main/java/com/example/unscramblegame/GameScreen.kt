package com.example.unscramblegame

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.unscramblegame.ui.theme.UnscrambleGameTheme

@Composable
fun GameScreen(
    modifier: Modifier = Modifier
) {
    Column(modifier = modifier) {
        Text(
            text = "Unscramble"
        )
        GameLayout()
        GameBtn()
        GameBtn()
        GameStatus()
    }
}

@Composable
fun GameLayout(
    modifier: Modifier = Modifier
) {

}

@Composable
fun GameBtn(
    modifier: Modifier = Modifier
) {

}

@Composable
fun GameStatus(
    modifier: Modifier = Modifier
) {

}

@Preview(showBackground = true, name = "GameScreen")
@Composable
fun GameScreenPreview() {
    UnscrambleGameTheme(darkTheme = false) {
        GameScreen(modifier = Modifier.fillMaxSize())
    }
}