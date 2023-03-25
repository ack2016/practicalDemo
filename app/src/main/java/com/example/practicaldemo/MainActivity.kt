package com.example.practicaldemo

import android.R
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.practicaldemo.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var viewModel: ListViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding: ActivityMainBinding = DataBindingUtil.setContentView(this, com.example.practicaldemo.R.layout.activity_main)
        binding.viewModel = viewModel

//        val userService = DaggerNetworkComponent.create().getApiService()
//        viewModel = ViewModelProvider(this, ListViewModelFactory(userService)).get(ListViewModel::class.java)

//        viewModel.userList.observe(this, { userList ->
//            binding.userList.adapter = ListAdapter(userList)
//        })
    }
}
