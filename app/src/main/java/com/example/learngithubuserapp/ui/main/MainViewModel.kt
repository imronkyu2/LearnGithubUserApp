package com.example.learngithubuserapp.ui.main

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.learngithubuserapp.api.RetrofitClient
import com.example.learngithubuserapp.data.model.User
import com.example.learngithubuserapp.data.model.UserResponse
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainViewModel : ViewModel() {

    val listUser = MutableLiveData<ArrayList<User>>()

    fun setSearchUser(query: String){
        RetrofitClient.apiInstance
            .getSearchUser(query)
            .enqueue(object :Callback<UserResponse>{
                override fun onResponse(
                    call: Call<UserResponse>,
                    response: Response<UserResponse>
                ) {
                    if (response.isSuccessful){
                        listUser.postValue(response.body()?.items)
                    }
                }

                override fun onFailure(call: Call<UserResponse>, t: Throwable) {
                    Log.d("failure", t.message.toString());
                }

            })
    }

    fun getSearchUser():LiveData<ArrayList<User>>{
        return listUser
    }
}