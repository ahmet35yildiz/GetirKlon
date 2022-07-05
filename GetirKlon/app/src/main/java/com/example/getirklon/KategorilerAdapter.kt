package com.example.getirklon

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.getirklon.databinding.CardTasarimKategorilerBinding

class KategorilerAdapter(var mContext: Context,var kategorilerListesi:List<Kategoriler>)
    : RecyclerView.Adapter<KategorilerAdapter.CardTasarimTutucu2>() {
    inner class CardTasarimTutucu2(tasarim:CardTasarimKategorilerBinding) : RecyclerView.ViewHolder(tasarim.root){
        var tasarim:CardTasarimKategorilerBinding
        init {
            this.tasarim = tasarim
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardTasarimTutucu2 {
        val layoutInflater = LayoutInflater.from(mContext)
        val tasarim = CardTasarimKategorilerBinding.inflate(layoutInflater,parent,false)
        return CardTasarimTutucu2(tasarim)
    }

    override fun onBindViewHolder(holder: CardTasarimTutucu2, position: Int) {
        val kategori = kategorilerListesi.get(position)
        holder.tasarim.chipKategori.text = kategori.kategoriAdi
    }

    override fun getItemCount(): Int {
        return kategorilerListesi.size
    }
}