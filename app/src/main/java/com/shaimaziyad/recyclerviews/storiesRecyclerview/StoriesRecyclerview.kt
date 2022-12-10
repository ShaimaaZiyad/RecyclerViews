package com.shaimaziyad.recyclerviews.storiesRecyclerview

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.shaimaziyad.recyclerviews.databinding.StoriesRecyclerviewBinding
import com.shaimaziyad.recyclerviews.storiesRecyclerview.adapter.MainAdapter
import com.shaimaziyad.recyclerviews.storiesRecyclerview.utils.StoriesData

class StoriesRecyclerview : Fragment() {

    private lateinit var binding: StoriesRecyclerviewBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = StoriesRecyclerviewBinding.inflate(layoutInflater)

        setViews()

        return binding.root
    }

    private fun setViews() {
        binding.apply {
            rvMainStories.adapter = MainAdapter(StoriesData.collections)
        }
    }

}