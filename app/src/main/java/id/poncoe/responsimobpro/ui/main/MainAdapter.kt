package id.poncoe.responsimobpro.ui.main

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import id.poncoe.responsimobpro.R
import id.poncoe.responsimobpro.databinding.ListItemBinding
import id.poncoe.responsimobpro.model.Kuchenk
import id.poncoe.responsimobpro.network.KuchenkApi

class MainAdapter : RecyclerView.Adapter<MainAdapter.ViewHolder>() {

    private val data = mutableListOf<Kuchenk>()

    fun updateData(newData: List<Kuchenk>) {
        data.clear()
        data.addAll(newData)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = ListItemBinding.inflate(inflater, parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(data[position])
    }

    override fun getItemCount(): Int {
        return data.size
    }

    class ViewHolder(
        private val binding: ListItemBinding
    ) : RecyclerView.ViewHolder(binding.root) {

        fun bind(kuchenk: Kuchenk) = with(binding) {
            namaTextView.text = kuchenk.namakuchenk
            infoTextView.text = kuchenk.informasi
            Glide.with(imageView.context)
                .load(KuchenkApi.getKuchenkUrl(kuchenk.gambar))
                .error(R.drawable.ic_baseline_broken_image_24)
                .into(imageView)

            root.setOnClickListener {
                Toast.makeText(root.context, kuchenk.namakuchenk, Toast.LENGTH_LONG).show()
            }
        }
    }
}