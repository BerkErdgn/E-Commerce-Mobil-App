package com.berkerdgn.e_commerce_mobil_app.view.on_boarding_view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager2.widget.ViewPager2
import com.berkerdgn.e_commerce_mobil_app.R
import com.berkerdgn.e_commerce_mobil_app.databinding.FragmentFirstOnBoardingBinding

class FirstOnBoardingFragment : Fragment() {

    private var _binding : FragmentFirstOnBoardingBinding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentFirstOnBoardingBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val viewPager = activity?.findViewById<ViewPager2>(R.id.onBoardingViewPager)

        binding.nextButton.setOnClickListener {
            viewPager?.currentItem = 1
        }


    }


    override fun onDestroy() {
        _binding = null
        super.onDestroy()
    }


}