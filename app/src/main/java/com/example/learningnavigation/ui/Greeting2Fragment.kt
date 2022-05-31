package com.example.learningnavigation.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.example.learningnavigation.R
import com.example.learningnavigation.databinding.FragmentGreeting2Binding


class Greeting2Fragment : Fragment() {


    private var _binding: FragmentGreeting2Binding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentGreeting2Binding.inflate(inflater, container, false)
        val root: View = binding.root

        var text = arguments?.getString("greeting2 info")
        binding.textViewGreeting2Text.setText(text)

        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}