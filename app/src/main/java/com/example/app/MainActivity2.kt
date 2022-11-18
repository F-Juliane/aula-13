package com.example.app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.app.databinding.ActivityMainBinding

class MainActivity2 : AppCompatActivity(), View.OnClickListener {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onClick(view: View) {
        if(view.id == R.id.button_cadastro_produto) {
            var switchActivityIntent = Intent(this, MainActivity2::class.java)
            startActivity(switchActivityIntent)
        }
    }

    fun testBD() {
        val db = AppDatabase.getDatabase(this).ProductDAO()
        val prod = ProductModel().apply {
            this.id = 0
            this.name = "Smartphone"
            this.price = 999f
            this.isAvailable = false
        }
        db.insert(prod)
    }
}