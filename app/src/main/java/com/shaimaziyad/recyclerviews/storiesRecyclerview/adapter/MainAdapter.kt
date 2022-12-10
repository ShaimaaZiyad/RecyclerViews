package com.shaimaziyad.recyclerviews.storiesRecyclerview.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.shaimaziyad.recyclerviews.R
import com.shaimaziyad.recyclerviews.databinding.MainStoriesItemBinding
import com.shaimaziyad.recyclerviews.storiesRecyclerview.model.Story


class MainAdapter (private val collection : List<Story>) : RecyclerView.Adapter<MainAdapter.CollectionViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CollectionViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.main_stories_item,parent,false)
        return CollectionViewHolder(view)
    }

    override fun onBindViewHolder(holder: CollectionViewHolder, position: Int) {
        holder.binding.apply {
            val collection = collection[position]
            tvGenreStory.text = collection.title
            val storyAdapter = StoryAdapter(collection.storyModels)
            rvStoryChild.adapter = storyAdapter
        }
    }

    override fun getItemCount() = collection.size

    inner class CollectionViewHolder(itemView : View): RecyclerView.ViewHolder(itemView){
        val binding = MainStoriesItemBinding.bind(itemView)
    }
}