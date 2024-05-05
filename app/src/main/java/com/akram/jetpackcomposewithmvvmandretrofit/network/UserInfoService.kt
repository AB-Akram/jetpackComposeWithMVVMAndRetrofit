package com.akram.jetpackcomposewithmvvmandretrofit.network

import com.akram.jetpackcomposewithmvvmandretrofit.model.UserInfo
import retrofit2.http.GET

interface UserInfoService {
    @GET("users")
    suspend fun getUserInfo(): List<UserInfo>
}