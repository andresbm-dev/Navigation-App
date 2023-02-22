package com.abm.maasapp.ui.pay

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.addCallback
import androidx.navigation.fragment.findNavController
import com.abm.maasapp.R
import com.abm.maasapp.databinding.FragmentLoaderBinding



class LoaderFragment : Fragment() {

    private lateinit var binding: FragmentLoaderBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentLoaderBinding.inflate(inflater, container, false)
        binding.textLoader.setOnClickListener {
            findNavController().popBackStack(R.id.loaderFragment, false)
            findNavController().navigate(R.id.action_loaderFragment_to_OTPMorePayFragment)
        }
        requireActivity().onBackPressedDispatcher.addCallback(viewLifecycleOwner) {
        }

        return  binding.root
    }

}