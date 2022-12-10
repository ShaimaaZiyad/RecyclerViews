package com.shaimaziyad.recyclerviews.expandableRecyclerView.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.shaimaziyad.recyclerviews.R
import com.shaimaziyad.recyclerviews.databinding.ParentItemBinding
import com.shaimaziyad.recyclerviews.expandableRecyclerView.model.MainModel

class MainAdapter(private val collections: List<MainModel>) :
    RecyclerView.Adapter<MainAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.parent_item, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.binding.apply {
            val collection = collections[position]
            tvParentTitle.text = collection.title
            val subItemAdapter = SubItemAdapter(collection.subItemModels)
            rvSubItem.adapter = subItemAdapter

            tvParentTitle.setOnClickListener {
                rvSubItem.visibility = if (rvSubItem.isShown) View.GONE else View.VISIBLE
            }
        }
    }

    override fun getItemCount() = collections.size


    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val binding = ParentItemBinding.bind(itemView)
    }
}