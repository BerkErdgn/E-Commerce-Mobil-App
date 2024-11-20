package com.berkerdgn.e_commerce_mobil_app.view.on_boarding_view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.berkerdgn.e_commerce_mobil_app.R
import com.berkerdgn.e_commerce_mobil_app.databinding.FragmentOnBoardingBinding
import com.berkerdgn.e_commerce_mobil_app.view.on_boarding_view.adapter.ViewPagerAdapter


class OnBoardingFragment : Fragment() {

    private var _binding : FragmentOnBoardingBinding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentOnBoardingBinding.inflate(inflater,container,false)

        val fragmentList = arrayListOf<Fragment>(
            FirstOnBoardingFragment(),
            SecondOnBoardingFragment(),
        )

        val adapter = ViewPagerAdapter(fragmentList,requireActivity().supportFragmentManager,lifecycle)

        val viewPager = binding.onBoardingViewPager
        viewPager.adapter = adapter
        binding.dotsIndicator.attachTo(viewPager)

        return binding.root
    }


}