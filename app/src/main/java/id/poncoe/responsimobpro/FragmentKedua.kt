package id.poncoe.responsimobpro

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import id.poncoe.responsimobpro.databinding.FragmentKeduaBinding

class FragmentKedua: Fragment() {
    private lateinit var binding: FragmentKeduaBinding
    private val args: FragmentKeduaArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentKeduaBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val passDataFromFragmentPertama = args.nama
        binding.txtNama.text = passDataFromFragmentPertama
    }
}