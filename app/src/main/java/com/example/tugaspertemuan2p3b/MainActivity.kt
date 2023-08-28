package com.example.tugaspertemuan2p3b

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.tugaspertemuan2p3b.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    val uname = "salma"
    val pass = "123"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        with(binding) {
            btnGetText.setOnClickListener {
                val username = edtUsername.text.toString()
                val password = edtPassword.text.toString()

                if ((username == uname) && (pass == password)) {
                    Toast.makeText(
                        this@MainActivity, "Login Berhasil", Toast.LENGTH_SHORT,
                    ).show()
                } else {
                    Toast.makeText(
                        this@MainActivity, "Login Gagal", Toast.LENGTH_SHORT
                    ).show()
                }
            }
        }
    }
}