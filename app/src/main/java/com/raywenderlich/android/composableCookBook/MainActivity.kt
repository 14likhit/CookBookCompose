package com.raywenderlich.android.composableCookBook

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.Text
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.setContent
import androidx.compose.ui.text.TextStyle
import androidx.ui.tooling.preview.Preview

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column(modifier = Modifier.fillMaxSize()) {
                TopAppBar(title = {
                    Text(text = "ComposableCookBook")
                })
                RecipeList(recipes = defaultRecipes)
            }
        }
    }

    @Composable
    @Preview
    fun Greetings() {
        Column {
            Text(text = "Hello, World!", style = TextStyle(color = Color.Red))
            Text(text = "Hello, Second World!", style = TextStyle(color = Color.Red))
            Text(text = "Hello, Third World!", style = TextStyle(color = Color.Red))
        }
    }
}
