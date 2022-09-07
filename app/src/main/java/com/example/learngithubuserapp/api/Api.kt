package com.example.learngithubuserapp.api

import com.example.learngithubuserapp.data.model.DetailUserResponse
import com.example.learngithubuserapp.data.model.User
import com.example.learngithubuserapp.data.model.UserResponse
import retrofit2.Call
import retrofit2.http.*

interface Api {
    @GET("search/users")
    fun getSearchUser(
        @Query("q") query: String
    ):Call<UserResponse>

    @GET("users/{username}")
    fun getUserDetail(
        @Path("username") username: String
    ):Call<DetailUserResponse>

    @GET("users/{username}/followers")
    fun getFollowers(
        @Path("username") username: String
    ):Call<ArrayList<User>>

    @GET("users/{username}/following")
    fun getFollowing(
        @Path("username") username: String
    ):Call<ArrayList<User>>
}