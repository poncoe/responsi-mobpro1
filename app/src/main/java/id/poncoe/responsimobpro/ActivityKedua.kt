package id.poncoe.responsimobpro

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import id.poncoe.responsimobpro.databinding.ActivityKeduaBinding

class ActivityKedua: AppCompatActivity() {
    private lateinit var binding: ActivityKeduaBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityKeduaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val i = this.intent
        val nama = i.extras!!.getString("nama") // akan mengambil nilai dari activity sebelumnya

        binding.txtNama.text = nama
    }

    override fun onBackPressed() {
        this.finish()
    }
}