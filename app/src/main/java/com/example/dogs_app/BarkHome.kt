package com.example.dogs_app

import android.security.identity.AccessControlProfile
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.unit.dp
import com.example.dogs_app.data.DataProvider
import com.example.dogs_app.data.Puppy
import androidx.compose.foundation.lazy.items

@Composable
fun BarkHomeContent(navigateToProfile: (Puppy) -> Unit) {
    val puppies = remember { DataProvider.puppyList }
    LazyColumn(
        contentPadding = PaddingValues(horizontal = 16.dp, vertical = 8.dp)
    ) {
        items(
            items = puppies,
            itemContent = {
                PuppyListItem(puppy = it, navigateToProfile)
            }
        )
    }
}