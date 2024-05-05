package com.akram.jetpackcomposewithmvvmandretrofit.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.akram.jetpackcomposewithmvvmandretrofit.model.UserInfo
import com.akram.jetpackcomposewithmvvmandretrofit.repository.UserInfoRepository
import kotlinx.coroutines.launch

class UserInfoViewModel : ViewModel() {
    private val repository = UserInfoRepository()

    private val _userInfo = MutableLiveData<List<UserInfo>>()
    val userInfo: LiveData<List<UserInfo>> = _userInfo

    fun fetchUserInfo() {
        viewModelScope.launch {
            try {
                val users = repository.getUsersInfo()
                _userInfo.value = users
            } catch (e: Exception) {
                // Handle error
            }
        }
    }
}