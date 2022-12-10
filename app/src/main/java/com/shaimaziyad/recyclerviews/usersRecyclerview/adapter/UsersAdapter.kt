package com.shaimaziyad.recyclerviews.usersRecyclerview.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.shaimaziyad.recyclerviews.databinding.UserItemBinding
import com.shaimaziyad.recyclerviews.usersRecyclerview.model.Users


class UsersAdapter (val users : MutableList<Users>)
    : RecyclerView.Adapter<UsersAdapter.ViewHolder>(){

    private lateinit var binding: UserItemBinding

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        binding = UserItemBinding.inflate(inflater,parent,false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(users[position])
    }

    override fun getItemCount() = users.size

    inner class ViewHolder(itemView : UserItemBinding) : RecyclerView.ViewHolder(itemView.root){

        fun bind(user : Users){
            binding.apply {
                idUser.text = user.id.toString()
                nameUser.text = user.name
            }
        }
    }
}