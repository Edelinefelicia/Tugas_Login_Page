package com.example.loginpage

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.loginpage.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {
    private lateinit var binding: ActivityMain2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)
        with(binding){
            val username = intent.getStringExtra("Username")
            val password = intent.getStringExtra("Password")
            val tvOutput = binding.tvOutput
            val tvOutput2 = binding.tvOutput2
            tvOutput.text ="Username : " + username
            tvOutput2.text ="Password : " + password



        }
    }
}