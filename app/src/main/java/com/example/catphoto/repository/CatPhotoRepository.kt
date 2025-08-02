package com.example.catphoto.repository

import androidx.lifecycle.MutableLiveData
import com.example.catphoto.model.CatPhoto
import com.example.catphoto.retrofit.CatApiService
import com.example.catphoto.retrofit.RetrofitClient
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch
import retrofit2.Response

class CatPhotoRepository {
    var catPhoto: MutableLiveData<CatPhoto> = MutableLiveData()

    suspend fun fetchCatPhoto(): Response<CatPhoto>{
       return RetrofitClient.apiService.getCatPhoto()
    }
}