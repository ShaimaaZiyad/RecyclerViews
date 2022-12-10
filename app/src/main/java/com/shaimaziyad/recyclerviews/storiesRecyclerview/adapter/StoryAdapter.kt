package com.shaimaziyad.recyclerviews.storiesRecyclerview.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.shaimaziyad.recyclerviews.R
import com.shaimaziyad.recyclerviews.databinding.StoryItemBinding
import com.shaimaziyad.recyclerviews.storiesRecyclerview.model.StoryModel



class StoryAdapter (private val storyModel: List<StoryModel>): RecyclerView.Adapter<StoryAdapter.StoryViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StoryViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.story_item,parent,false)
        return StoryViewHolder(view)
    }

    override fun onBindViewHolder(holder: StoryViewHolder, position: Int) {
        holder.binding.apply {
            imgStoryPoster.load(storyModel[position].imageUrl)
        }
    }

    override fun getItemCount() = storyModel.size

    inner class StoryViewHolder(itemView : View): RecyclerView.ViewHolder(itemView){
        val binding = StoryItemBinding.bind(itemView)
    }
}