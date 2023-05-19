package id.poncoe.responsimobpro

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import id.poncoe.responsimobpro.databinding.FragmentMainBinding
import id.poncoe.responsimobpro.model.Hasil

class MainFragment : Fragment() {
    lateinit var binding: FragmentMainBinding

    private val viewModel: MainViewModel by lazy {
        ViewModelProvider(this)[MainViewModel::class.java]
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMainBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.btnHitung.setOnClickListener { hitung() }
        viewModel.getHasilPerkalian().observe(requireActivity()) {showResult(it)}
    }

    fun hitung(){
        val bil1 = binding.inpBil1.text.toString()
        val bil2 = binding.inpBil2.text.toString()

        viewModel.tampungData(
            bil1.toInt(),
            bil2.toInt())
    }

    private fun showResult(result: Hasil?){
        if (result == null) return
        binding.txtHasil.visibility = View.VISIBLE
        binding.txtHasil.text = result.hasil.toString()
    }

}