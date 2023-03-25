package com.example.practicaldemo

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel

class ListViewModel(private val apiService: ApiService) : ViewModel() {
    val userList: LiveData<List<String>> = apiService.getList()
}