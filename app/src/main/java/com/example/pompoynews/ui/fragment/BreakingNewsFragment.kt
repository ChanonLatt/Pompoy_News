package com.example.pompoynews.ui.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.pompoynews.databinding.FragmentBreakingNewsBinding

class BreakingNewsFragment : Fragment() {
    private lateinit var binder: FragmentBreakingNewsBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binder = FragmentBreakingNewsBinding.inflate(inflater, container, false)
        return binder.root
    }
}