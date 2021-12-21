package com.raywenderlich.android.composableCookBook

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumnFor
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun RecipeList(recipes: List<Recipe>) {
    LazyColumnFor(items = recipes) { item ->
        RecipeCard(recipe = item, Modifier.padding(16.dp))
    }
}