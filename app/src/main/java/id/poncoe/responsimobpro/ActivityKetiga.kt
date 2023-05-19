package id.poncoe.responsimobpro

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import id.poncoe.responsimobpro.databinding.ActivityKetigaBinding

class ActivityKetiga : AppCompatActivity() {
    private lateinit var binding: ActivityKetigaBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityKetigaBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}