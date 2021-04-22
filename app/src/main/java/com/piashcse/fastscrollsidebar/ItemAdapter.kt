package com.piashcse.fastscrollsidebar

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.piashcse.fastcrollsidebar.FirstScrollBaseAdapter
import com.piashcse.fastcrollsidebar.ItemEntity
import com.piashcse.fastscrollsidebar.databinding.ItemLayoutBinding

/**
 * Created by Piash on 4/22/21
 * Copyright (c) 2021 bjit. All rights reserved.
 * piash599@gmail.com
 * Last modified $file.lastModified
 */
class ItemAdapter(dataList: List<ItemEntity<String>> ): FirstScrollBaseAdapter<String, ItemAdapter.CountryViewHolder>(dataList) {
    private val items: ArrayList<String> = arrayListOf()

    inner class CountryViewHolder(val binding: ItemLayoutBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(item: String) {
            itemView.setOnClickListener {
            }
        }
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CountryViewHolder {
        val binding =
            ItemLayoutBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return CountryViewHolder(binding)
    }

    override fun onBindViewHolder(holder: CountryViewHolder, position: Int) {
        val item = dataList[position].value
        holder.binding.name.text = item
        return holder.bind(item)
    }

    override fun getItemCount() = dataList.size
}