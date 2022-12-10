package com.shaimaziyad.recyclerviews.usersRecyclerview

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.shaimaziyad.recyclerviews.R
import com.shaimaziyad.recyclerviews.databinding.UsersRecyclerviewBinding
import com.shaimaziyad.recyclerviews.usersRecyclerview.adapter.UsersAdapter
import com.shaimaziyad.recyclerviews.usersRecyclerview.model.Users


class UsersRecyclerview : Fragment() {

    private lateinit var binding: UsersRecyclerviewBinding

    private var nameList : MutableList<Users> = mutableListOf()
    private lateinit var userAdapter : UsersAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = UsersRecyclerviewBinding.inflate(layoutInflater)

        loadData()
        setViews()

        return binding.root
    }

    private fun loadData() {
       nameList.add(Users(1,"Moaz"))
        nameList.add(Users(2,"Shaimaa"))
        nameList.add(Users(3,"Yahia"))
        nameList.add(Users(4,"Zain"))
        nameList.add(Users(5,"Ahmed"))
        nameList.add(Users(6,"Doaa"))
        nameList.add(Users(7,"Mostafa"))
        nameList.add(Users(8,"Leen"))
        nameList.add(Users(9,"Mohammed"))
        nameList.add(Users(10,"Hasnaa"))
        nameList.add(Users(11,"Tareq"))

    }

    private fun setViews() {
        binding.apply {

            userAdapter = UsersAdapter(nameList)

            rvUsers.apply {
                layoutManager = LinearLayoutManager(requireContext())
                adapter = userAdapter
            }
        }
    }
}