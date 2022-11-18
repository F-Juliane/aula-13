package com.example.app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        testBD()
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