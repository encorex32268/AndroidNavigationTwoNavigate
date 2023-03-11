package com.lihan.androidnavigationtwonavigate.feature.register.presentation.name

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.lihan.androidnavigationtwonavigate.R
import com.lihan.androidnavigationtwonavigate.databinding.FragmentNameBinding

class NameFragment : Fragment(R.layout.fragment_name) {

    private lateinit var binding: FragmentNameBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentNameBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.apply {
            nameButton.setOnClickListener {
                findNavController().navigate(
                    NameFragmentDirections.actionNameFragmentToGenderFragment()
                )
            }
        }
    }

}