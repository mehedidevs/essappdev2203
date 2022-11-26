package com.cit.k_nested_nav

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.cit.k_nested_nav.databinding.FragmentHome2Binding
import com.cit.k_nested_nav.databinding.FragmentHomeBinding


class HomeFragment : Fragment() {
    lateinit var binding: FragmentHome2Binding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        var bundle = Bundle()


        binding = FragmentHome2Binding.inflate(layoutInflater, container, false)

        binding.goSecondScreen.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_secondFragment)
        }

        binding.goNested1Screen.setOnClickListener {
            bundle.putString("key", "one")
            findNavController().navigate(R.id.action_homeFragment_to_nested1Fragment)
        }
        binding.goNested2Screen.setOnClickListener {
            bundle.putString("key", "two")
            findNavController().navigate(R.id.action_homeFragment_to_nested2Fragment)
        }


        return binding.root
    }

}