package com.shaimaziyad.recyclerviews.expandableRecyclerView

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.shaimaziyad.recyclerviews.databinding.ExpandableRecyclerViewBinding
import com.shaimaziyad.recyclerviews.expandableRecyclerView.utils.SampleData
import com.shaimaziyad.recyclerviews.expandableRecyclerView.adapter.MainAdapter


class ExpandableRecyclerView : Fragment() {

    private lateinit var binding: ExpandableRecyclerViewBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = ExpandableRecyclerViewBinding.inflate(layoutInflater)

        setViews()

        return binding.root
    }
    private fun setViews(){
        binding.apply {
            rvMain.adapter = MainAdapter(SampleData.collections)
        }
    }

}