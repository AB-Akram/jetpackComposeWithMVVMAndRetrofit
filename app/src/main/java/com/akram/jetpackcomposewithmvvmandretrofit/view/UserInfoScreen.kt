package com.akram.jetpackcomposewithmvvmandretrofit.view

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import com.akram.jetpackcomposewithmvvmandretrofit.viewmodel.UserInfoViewModel

@Composable
fun UserInfoScreen(viewModel: UserInfoViewModel) {
    val usersInfo by viewModel.userInfo.observeAsState(emptyList())

    LaunchedEffect(Unit) {
        viewModel.fetchUserInfo()
    }

    Column {
        if (usersInfo.isEmpty()) {
            // Show loading indicator or placeholder
            Text(text = "Loading...")
        } else {
            // Display the list of credit cards
            LazyColumn {
                items(usersInfo) { userInfo ->
                    Text(text = userInfo.name)
                    Text(text = userInfo.username)
                    Text(text = userInfo.email)
                    Divider() // Add a divider between items
                }
            }
        }
    }
}