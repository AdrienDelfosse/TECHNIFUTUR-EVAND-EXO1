package com.technipixl.technifutur_evand_exo1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController


import com.technipixl.technifutur_evand_exo1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        findViewById<Button>(R.id.newButton).setOnClickListener {
            val fragment = addFragment()
            val transaction = supportFragmentManager.beginTransaction()
            transaction.add(R.id.container, fragment)
            transaction.addToBackStack(null)
            transaction.commit()
        }
    }
}