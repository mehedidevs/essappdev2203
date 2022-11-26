package com.cit.k_nested_nav

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController


class Nested1Fragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        var key = requireArguments().getString("key")

        if (key == "two") {
            findNavController().navigate(R.id.action_homeFragment_to_nested2Fragment)
        } else {
            findNavController().navigate(R.id.action_homeFragment_to_nested1Fragment)
        }



        return inflater.inflate(R.layout.fragment_nested1, container, false)
    }

}