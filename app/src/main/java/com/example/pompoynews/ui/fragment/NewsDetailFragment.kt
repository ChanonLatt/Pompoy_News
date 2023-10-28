package com.example.pompoynews.ui.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.pompoynews.R
import com.example.pompoynews.databinding.NewsDetailBinding

class NewsDetailFragment: Fragment() {
    private lateinit var binding: NewsDetailBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = NewsDetailBinding.inflate(inflater, container, false)
        return binding.root
    }
}