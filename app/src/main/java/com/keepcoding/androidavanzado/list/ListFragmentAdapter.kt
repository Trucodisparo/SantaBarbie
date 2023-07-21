package com.keepcoding.androidavanzado.list

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.keepcoding.androidavanzado.databinding.ListFragmentItemBinding

class ListFragmentAdapter: RecyclerView.Adapter<ListFragmentAdapter.ListFragmentViewHolder>(){
    private lateinit var list: List<String>
    class ListFragmentViewHolder(val binding: ListFragmentItemBinding): RecyclerView.ViewHolder(binding.root){
        fun bind(name: String, position: Int){
            println(name)
            with(binding){
                tvName.text = name
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListFragmentViewHolder {
        val binding = ListFragmentItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ListFragmentViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: ListFragmentViewHolder, position: Int) {
        holder.bind(list[position], position)
    }

    fun submit(list: List<String>){
        this.list = list
        notifyDataSetChanged()
    }
}