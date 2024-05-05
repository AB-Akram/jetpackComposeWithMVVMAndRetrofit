package com.akram.jetpackcomposewithmvvmandretrofit

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import com.akram.jetpackcomposewithmvvmandretrofit.ui.theme.JetpackComposeWithMVVMAndRetrofitTheme
import com.akram.jetpackcomposewithmvvmandretrofit.viewmodel.UserInfoViewModel
import androidx.activity.viewModels
import com.akram.jetpackcomposewithmvvmandretrofit.view.UserInfoScreen

class MainActivity : ComponentActivity() {

    private val viewModel: UserInfoViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackComposeWithMVVMAndRetrofitTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    UserInfoScreen(viewModel = viewModel )
                }
            }
        }
    }
}