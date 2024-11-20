package com.berkerdgn.e_commerce_mobil_app.view

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import com.berkerdgn.e_commerce_mobil_app.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.fragmentContainerView) as NavHostFragment
        val navController = navHostFragment.navController
        val navGraph = navController.navInflater.inflate(R.navigation.nav)
        val startDestination = if (onBoardingIsFinished()) {
            R.id.loginFragment
        } else {
            R.id.onBoardingFragment
        }
        navGraph.setStartDestination(startDestination)
        navController.graph = navGraph

    }

    private fun onBoardingIsFinished(): Boolean {
        val sharedPreferences = getSharedPreferences("onBoarding", MODE_PRIVATE)
        return sharedPreferences.getBoolean("finished", false)
    }


}