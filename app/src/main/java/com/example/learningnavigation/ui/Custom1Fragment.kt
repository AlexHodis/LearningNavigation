package com.example.learningnavigation.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.example.learningnavigation.R
import com.example.learningnavigation.databinding.FragmentCustom1Binding


class Custom1Fragment : Fragment() {

    companion object{
        val BUNDLE_GALLERY_INFO = "gallery info"
    }

    private var _binding: FragmentCustom1Binding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentCustom1Binding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textView2
        textView.text = "This is the Custom 1 fragment"

        binding.buttonGallery.setOnClickListener {
            val bundle = Bundle()
            bundle.putString(BUNDLE_GALLERY_INFO, "Greetings from Custom1")
            root.findNavController().navigate(R.id.action_custom1Fragment3_to_nav_gallery)
        }

        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}