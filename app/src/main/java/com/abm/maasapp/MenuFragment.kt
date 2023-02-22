package com.abm.maasapp

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import com.abm.maasapp.databinding.FragmentMenuBinding


class MenuFragment : Fragment() {

    private lateinit var binding: FragmentMenuBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentMenuBinding.inflate(inflater, container, false)

        when(requireActivity()){
            MainActivity::class.java->{
                binding.ivHome.setBackgroundColor(ContextCompat.getColor(requireContext(),R.color.purple_500))
            }
            KeyCardActivity::class.java->{
                binding.ivKeyCard.setBackgroundColor(ContextCompat.getColor(requireContext(),R.color.purple_500))
            }
            MorePayActivity::class.java->{
                binding.ivMorePay.setBackgroundColor(ContextCompat.getColor(requireContext(),R.color.purple_500))
            }

        }
        initListeners()
        return binding.root
    }

    private fun initListeners() {
        binding.ivHome.setOnClickListener {

            goScreen(MainActivity::class.java)
        }
        binding.ivKeyCard.setOnClickListener {
            goScreen(KeyCardActivity::class.java)
        }
        binding.ivMorePay.setOnClickListener {
            goScreen(MorePayActivity::class.java)
        }
    }

    private fun goScreen(screen: Class<*>) {
        val intent = Intent(activity,screen)
        startActivity(intent)
    }

    companion object {

        fun newInstance(): Fragment {
            return MenuFragment()
        }
    }

}