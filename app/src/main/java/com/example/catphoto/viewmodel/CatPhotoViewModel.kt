package com.example.catphoto.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.catphoto.repository.CatPhotoRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class CatPhotoViewModel: ViewModel() {
    var cRepo = CatPhotoRepository()

    val photoURL = MutableStateFlow<String?>(null)
    val _photoURL: StateFlow<String?> = photoURL

    val isLoading = MutableStateFlow(false)
    val _isLoading: StateFlow<Boolean> = isLoading

    fun loadingPhoto(){
        viewModelScope.launch {
            isLoading.value = true
            val response = cRepo.fetchCatPhoto()
            if (response.isSuccessful)
                photoURL.value = response.body()?.url
            isLoading.value = false
        }
    }

}