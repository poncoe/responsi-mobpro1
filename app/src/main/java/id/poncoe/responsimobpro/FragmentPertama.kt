package id.poncoe.responsimobpro

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import id.poncoe.responsimobpro.databinding.FragmentPertamaBinding

class FragmentPertama: Fragment() {
    private lateinit var binding: FragmentPertamaBinding


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentPertamaBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.buttonHalamankedua.setOnClickListener { pindahHalaman() }
    }

    fun pindahHalaman(){
        val nama = binding.inputNama.text.toString() // Coedotz
    }
}