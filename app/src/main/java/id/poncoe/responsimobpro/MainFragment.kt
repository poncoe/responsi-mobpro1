package id.poncoe.responsimobpro

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import id.poncoe.responsimobpro.databinding.FragmentMainBinding

class MainFragment : Fragment() {
    lateinit var binding: FragmentMainBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMainBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.btnPertama.setOnClickListener { halamanPertama() }
        binding.btnKedua.setOnClickListener { halamanKetiga() }
    }

    fun halamanPertama(){
        findNavController().navigate(R.id.action_mainFragment_to_fragmentPertama) // Main --> Layout Pertama
    }

    fun halamanKetiga(){
        findNavController().navigate(R.id.action_mainFragment_to_fragmentKetiga) // Main --> Layout ketiga
    }

}