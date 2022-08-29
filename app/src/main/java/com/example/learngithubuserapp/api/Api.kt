package com.example.learngithubuserapp.api

import com.example.learngithubuserapp.data.model.UserResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Headers
import retrofit2.http.Query

interface Api {
    @GET("search/users")
    @Headers("Authorization: token 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")
    fun getSearchUser(
        @Query("q")query: String
    ):Call<UserResponse>
}