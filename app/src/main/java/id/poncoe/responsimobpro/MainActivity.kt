package id.poncoe.responsimobpro

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

        binding.btnGo.setOnClickListener { letGo() }
    }

    fun letGo(){
        val bil1 = binding.inputBil1.text.toString()
        val bil2 = binding.inputBil2.text.toString()
        val hasil = bil1.toInt() * bil2.toInt()

        binding.txtHasil.isVisible = true
        binding.txtHasil.text = hasil.toString() // muncul kalkulasi perhitungan.

        val nama = binding.inputNama.text.toString()
        binding.txtNama.isVisible = true
        binding.txtNama.text = nama // muncul nama
    }
}