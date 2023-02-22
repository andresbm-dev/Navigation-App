package com.abm.maasapp.ui.otp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.addCallback
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.abm.maasapp.R
import com.abm.maasapp.databinding.FragmentOTPMorePayBinding
import com.abm.maasapp.ui.home.viewmodel.NavigationViewModelImp


class OTPMorePayFragment : Fragment() {

    private lateinit var binding: FragmentOTPMorePayBinding
    private lateinit var viewModel: NavigationViewModelImp


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentOTPMorePayBinding.inflate(inflater, container, false)
        viewModel = ViewModelProvider(requireActivity())[NavigationViewModelImp::class.java]


        binding.textOtp.setOnClickListener {
            findNavController().navigate(R.id.morePayFragment2)
        }

        requireActivity().onBackPressedDispatcher.addCallback(viewLifecycleOwner) {

        }
        return binding.root
    }
}