package com.lihan.androidnavigationtwonavigate.feature.register.presentation.gender

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.lihan.androidnavigationtwonavigate.R
import com.lihan.androidnavigationtwonavigate.databinding.FragmentGenderBinding

class GenderFragment : Fragment() {

    private lateinit var binding: FragmentGenderBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentGenderBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.apply {
            genderButton.setOnClickListener {
                findNavController().navigate(
                    GenderFragmentDirections.actionGenderFragmentToAgeFragment()
                )
            }
        }
    }

}