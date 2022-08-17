package com.example.fifa22search.retrofit

import com.example.fifa22search.Player
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

interface Players{
    @GET("players")
    suspend fun getAllPlayers(): List<Player>
}

object RetrofitClient {
    private var retrofit: Retrofit? = null

    fun getData(baseUrl: String): Retrofit {
        if (retrofit == null) {
            retrofit = Retrofit.Builder()
                .baseUrl(baseUrl)
                .client(OkHttpClient())
                .addConverterFactory(GsonConverterFactory.create())
                .build()
        }
        return retrofit!!
    }
}

