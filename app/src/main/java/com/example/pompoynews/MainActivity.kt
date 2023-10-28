package com.example.pompoynews

import android.os.Bundle
import androidx.fragment.app.FragmentActivity
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.ui.NavigationUI.setupWithNavController
import com.example.pompoynews.databinding.ActivityMainBinding

class MainActivity : FragmentActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var navigationControler: NavController
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        navigationControler = Navigation.findNavController(this, R.id.nav_host_fragmentContainerView)
        setupWithNavController(binding.rootBottomNavigationView, navigationControler)
//
//        val bottomView: BottomNavigationView = binding.rootBottomNavigationView
    }
}