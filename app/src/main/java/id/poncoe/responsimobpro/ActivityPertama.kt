package id.poncoe.responsimobpro

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import id.poncoe.responsimobpro.databinding.ActivityPertamaBinding

class ActivityPertama: AppCompatActivity() {
    private lateinit var binding: ActivityPertamaBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityPertamaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonHalamankedua.setOnClickListener { pindahHalaman() }
    }

    fun pindahHalaman(){
        val nama = binding.inputNama.text.toString() // Coedotz

        val i = Intent(this,ActivityKedua::class.java)
        i.putExtra("nama", nama) // key : nama | value : Coedotz
        startActivity(i) // panggil activity
    }

    override fun onBackPressed() {
        this.finish()
    }
}