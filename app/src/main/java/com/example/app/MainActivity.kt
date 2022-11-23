package com.example.app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.app.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onClick(view: View) {
        if(view.id == R.id.button_cadastrar_produto) {
            var switchActivityIntent = Intent(this, MainActivity2::class.java)
            startActivity(switchActivityIntent)
        }
        if(view.id == R.id.button_visualizar_produto) {
            var switchActivityIntent = Intent(this, MainActivity3::class.java)
            startActivity(switchActivityIntent)
        }
    }
}