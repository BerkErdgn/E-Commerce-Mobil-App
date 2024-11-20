package com.berkerdgn.e_commerce_mobil_app.view.on_boarding_view

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.berkerdgn.e_commerce_mobil_app.R
import com.berkerdgn.e_commerce_mobil_app.databinding.FragmentSecondOnBoardingBinding


class SecondOnBoardingFragment : Fragment() {

    private var _binding : FragmentSecondOnBoardingBinding? = null
    private val binding get() = _binding!!


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentSecondOnBoardingBinding.inflate(inflater,container,false)
        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.finishButton.setOnClickListener {
            onBoardingIsFinish()
            findNavController().navigate(R.id.action_onBoardingFragment_to_loginFragment)
        }


    }

    private fun onBoardingIsFinish() {
        val sharedPreferences = requireActivity().getSharedPreferences("onBoarding", Context.MODE_PRIVATE)
        val editor = sharedPreferences.edit()
        editor.putBoolean("finished",true)
        editor.apply()
    }


    override fun onDestroy() {
        _binding = null
        super.onDestroy()
    }


}