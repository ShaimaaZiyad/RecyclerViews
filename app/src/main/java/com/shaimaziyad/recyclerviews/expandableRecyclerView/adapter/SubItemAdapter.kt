package com.shaimaziyad.recyclerviews.expandableRecyclerView.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.shaimaziyad.recyclerviews.R
import com.shaimaziyad.recyclerviews.databinding.SubListItemBinding
import com.shaimaziyad.recyclerviews.expandableRecyclerView.model.SubItemModel

class SubItemAdapter (private val subItemModel: List<SubItemModel>) : RecyclerView.Adapter<SubItemAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.sub_list_item,parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.binding.apply {
            tvSubItemTitle.text = subItemModel[position].subItemTitle
        }
    }

    override fun getItemCount() = subItemModel.size

    inner class ViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView){
        val binding = SubListItemBinding.bind(itemView)
    }
}