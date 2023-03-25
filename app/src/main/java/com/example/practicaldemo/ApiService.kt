package com.example.practicaldemo

import androidx.lifecycle.LiveData
import retrofit2.http.GET

interface ApiService {
    @GET()
    fun getList(): LiveData<PlaylistResponse>
}
