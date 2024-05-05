package com.akram.jetpackcomposewithmvvmandretrofit.repository

import com.akram.jetpackcomposewithmvvmandretrofit.model.UserInfo

class UserInfoRepository {
    private val userInfoService = RetrofitInstance.userInfoService

    suspend fun getUsersInfo(): List<UserInfo> {
        return userInfoService.getUserInfo()
    }
}
