package com.berkerdgn.e_commerce_mobil_app.view.auth_view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.berkerdgn.e_commerce_mobil_app.R
import com.berkerdgn.e_commerce_mobil_app.databinding.FragmentLoginBinding


class LoginFragment : Fragment() {

    private var _binding : FragmentLoginBinding ?= null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentLoginBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.loginButton.setOnClickListener {
            findNavController().navigate(R.id.action_loginFragment_to_secondaryMainFragment)
        }

        binding.signUpTextView4.setOnClickListener {
            findNavController().navigate(R.id.action_loginFragment_to_singUpFragment)
        }


    }


    override fun onDestroy() {
        _binding = null
        super.onDestroy()
    }


}