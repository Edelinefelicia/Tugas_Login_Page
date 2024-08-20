package com.example.loginpage

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.loginpage.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        with(binding){
            val btnlogin = binding.btnLogin
            val editTextusername = binding.etUser
            val editTextpass = binding.etPass
            btnlogin.setOnClickListener {
                val textusername = editTextusername.text.toString()
                val textpass = editTextpass.text.toString()
                val intent = Intent(this@MainActivity, MainActivity2::class.java)
                intent.putExtra("Username", textusername)
                intent.putExtra("Password", textpass)
                startActivity(intent)
            }
        }
    }


}


