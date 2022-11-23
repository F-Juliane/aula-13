package com.example.app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.app.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity(), View.OnClickListener {
    private lateinit var binding: ActivityMain2Binding
    var num_id : Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onClick(view: View) {
        if(view.id == R.id.button_cadastro_produto) {
            testBD(R.id.check_disponivel)
            val switchActivityIntent = Intent(this, MainActivity::class.java)
            startActivity(switchActivityIntent)
        }
    }

    fun testBD(disponivel: Int) {
        val db = AppDatabase.getDatabase(this).ProductDAO()
        val prod = ProductModel().apply {
            this.id = num_id
            this.name = R.id.digite_nome.toString()
            this.price = R.id.digite_preco.toFloat()
            this.isAvailable = disponivel == 1
            num_id += 1
        }
        db.insert(prod)
    }
}