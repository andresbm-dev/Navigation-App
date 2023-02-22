package com.abm.maasapp.ui.pay

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.addCallback
import androidx.navigation.fragment.findNavController
import com.abm.maasapp.R
import com.abm.maasapp.databinding.FragmentMorePayBinding

class MorePayFragment : Fragment() {

    private lateinit var binding: FragmentMorePayBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentMorePayBinding.inflate(inflater, container, false)
        /*binding.text.setOnClickListener {
            findNavController().navigate(R.id.action_morePayFragment2_to_loaderFragment)
        }*/

        return binding.root
    }

}