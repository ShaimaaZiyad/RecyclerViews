package com.shaimaziyad.recyclerviews

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.shaimaziyad.recyclerviews.databinding.HomeBinding

class Home : Fragment() {

    private lateinit var binding: HomeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = HomeBinding.inflate(layoutInflater)

        setViews()

        return binding.root
    }

    private fun setViews() {
        binding.apply {
            usersRecyclerviewFragmentBtn.setOnClickListener {
                findNavController().navigate(R.id.action_home_to_usersRecyclerview)
            }
            storiesRecyclerviewFragmentBtn.setOnClickListener {
                findNavController().navigate(R.id.action_home_to_storiesRecyclerview)
            }
            expandableRecyclerviewFragmentBtn.setOnClickListener {
                findNavController().navigate(R.id.action_home_to_expandableRecyclerView)
            }
        }
    }

}