package com.example.dogs_app

import android.content.Intent
import android.os.Bundle
import android.security.identity.AccessControlProfile
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.dogs_app.data.Puppy
import com.example.dogs_app.ui.theme.Dogs_appTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Dogs_appTheme {
                MyApp {
                    startActivity(ProfileActivity.newIntent(this, it))
                }
            }
        }
    }
}

@Composable
fun MyApp(navigateToProfile: (Puppy) -> Unit) {
    Scaffold (content = {
        BarkHomeContent(navigateToProfile = navigateToProfile)
        }
    )
}