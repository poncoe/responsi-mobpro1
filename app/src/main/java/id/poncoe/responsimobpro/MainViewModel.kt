package id.poncoe.responsimobpro

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import id.poncoe.responsimobpro.model.Angka
import id.poncoe.responsimobpro.model.Hasil

class MainViewModel : ViewModel() {
    private val hasilHitung = MutableLiveData<Hasil?>()

    fun tampungData(bil1: Int, bil2: Int) {
        val dataHitung = Angka(
            bil1 = bil1,
            bil2 = bil2
        )
        hasilHitung.value = dataHitung.hitungPerkalian()
    }

    fun Angka.hitungPerkalian(): Hasil {
        val hasil = bil1 * bil2
        return Hasil(hasil)
    }

    fun getHasilPerkalian(): LiveData<Hasil?> = hasilHitung
}