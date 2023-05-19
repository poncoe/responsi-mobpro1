package id.poncoe.responsimobpro

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.view.isVisible
import id.poncoe.responsimobpro.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnPertama.setOnClickListener { halamanPertama() }
        binding.btnKedua.setOnClickListener { halamanKedua() }
    }

    fun halamanPertama(){
        val intent = Intent(this, ActivityPertama::class.java)
        startActivity(intent)
    }

    fun halamanKedua(){
        val intent = Intent(this, ActivityKedua::class.java)
        startActivity(intent)
    }

}