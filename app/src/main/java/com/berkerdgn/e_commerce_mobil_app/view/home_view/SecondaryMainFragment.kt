package com.berkerdgn.e_commerce_mobil_app.view.home_view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.berkerdgn.e_commerce_mobil_app.R
import com.berkerdgn.e_commerce_mobil_app.databinding.FragmentSecondaryMainBinding


class SecondaryMainFragment : Fragment() {

    private var _binding: FragmentSecondaryMainBinding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentSecondaryMainBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        replace(HomeFragment())

        binding.navView.setOnItemSelectedListener {
            when (it.itemId) {
                R.id.navigation_home -> replace(HomeFragment())
                R.id.navigation_liked -> replace(LikedFragment())
                R.id.navigation_user -> replace(HomeFragment())
            }
            true
        }


    }

    private fun replace(fragment: Fragment) {
        val fragmentManager = requireActivity().supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.navHostFrameLayout, fragment)
        fragmentTransaction.commit()
    }

    override fun onDestroy() {
        _binding = null
        super.onDestroy()
    }

}