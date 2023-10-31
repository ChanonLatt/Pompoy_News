package com.example.pompoynews.ui.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView.LayoutManager
import com.example.pompoynews.databinding.FragmentBreakingNewsBinding
import com.example.pompoynews.ui.adaptor.NewsAdaptor

class BreakingNewsFragment : Fragment() {
    private lateinit var binder: FragmentBreakingNewsBinding
    private lateinit var adaptor: NewsAdaptor
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binder = FragmentBreakingNewsBinding.inflate(inflater, container, false)
        return binder.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val news = listOf<String>("Chanon", "Sreynat")
        adaptor = NewsAdaptor(news)
        binder.recyclerView.apply {
         adapter = adaptor
            layoutManager = LinearLayoutManager(context)
        }
    }
}