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
import com.example.learningnavigation.databinding.FragmentGreetingBinding

class GreetingFragment : Fragment() {

    companion object{
        val BUNDLE_GREETING2_INFO = "greeting2 info"
    }

    private var _binding: FragmentGreetingBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentGreetingBinding.inflate(inflater, container, false)
        val root: View = binding.root

        binding.buttonGreetingSubmit.setOnClickListener {
            val bundle = Bundle()
            bundle.putString(GreetingFragment.BUNDLE_GREETING2_INFO, binding.editTextGreetingStuff.text.toString())
            root.findNavController().navigate(R.id.action_nav_greeting_to_greeting2Fragment, bundle)
        }

        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}