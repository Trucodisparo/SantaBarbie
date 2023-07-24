package com.keepcoding.androidavanzado.presentation

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.keepcoding.androidavanzado.databinding.ListFragmentItemBinding
import com.keepcoding.androidavanzado.domain.model.HeroModel

class ListFragmentAdapter: RecyclerView.Adapter<ListFragmentAdapter.ListFragmentViewHolder>(){
    private lateinit var list: List<HeroModel>
    class ListFragmentViewHolder(val binding: ListFragmentItemBinding): RecyclerView.ViewHolder(binding.root){
        fun bind(hero: HeroModel, position: Int){
            with(binding){
                tvName.text = hero.name
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

    fun submit(list: List<HeroModel>){
        this.list = list
        notifyDataSetChanged()
    }
}