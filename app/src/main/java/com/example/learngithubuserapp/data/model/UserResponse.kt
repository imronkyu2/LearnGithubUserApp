package com.example.learngithubuserapp.data.model

import com.google.gson.annotations.SerializedName

data class UserResponse(
//    @SerializedName("items") // Bila beda nama variable
    val items : ArrayList<User>
)
