package com.keepcoding.androidavanzado.presentation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.keepcoding.androidavanzado.databinding.FragmentListBinding
import org.koin.androidx.viewmodel.ext.android.viewModel

class ListFragment : Fragment() {
    private val listViewModel: ListFragmentViewModel by viewModel()
    private lateinit var binding: FragmentListBinding
    private var adapter = ListFragmentAdapter()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentListBinding.inflate(layoutInflater)
        binding.rvHeroList.adapter = adapter
        binding.rvHeroList.layoutManager = LinearLayoutManager(this@ListFragment.context)
        // Inflate the layout for this fragment
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        listViewModel.heroList.observe(viewLifecycleOwner){ heroList ->
            adapter.submit(heroList)
        }
        listViewModel.getData()
    }
}