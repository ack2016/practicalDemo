package com.example.practicaldemo

import dagger.Component

@Component(modules = [NetworkModule::class])
interface NetworkComponent {
    fun getApiService(): ApiService
}
