package com.practice.rxkotlin

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.practice.rxkotlin.databinding.FragmentViewBindingBinding


class ViewBindingFragment : Fragment() {

    private lateinit var binding : FragmentViewBindingBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentViewBindingBinding.inflate(layoutInflater)
        val view = binding.root
        // Inflate the layout for this fragment
        return view
    }

    
}