package com.example.getirklon

import android.content.Context
import android.graphics.Paint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.getirklon.databinding.CardTasarimBinding

class UrunlerAdapter(var mContext: Context,var urunlerListesi:List<Urunler>) : RecyclerView.Adapter<UrunlerAdapter.CardTasarimTutucu>() {
    inner class CardTasarimTutucu(tasarim:CardTasarimBinding) : RecyclerView.ViewHolder(tasarim.root){
        var tasarim:CardTasarimBinding
        init {
            this.tasarim = tasarim
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardTasarimTutucu {
        val layoutInflater = LayoutInflater.from(mContext)
        val tasarim = CardTasarimBinding.inflate(layoutInflater,parent,false)
        return CardTasarimTutucu(tasarim)
    }

    override fun onBindViewHolder(holder: CardTasarimTutucu, position: Int) {
        val urun = urunlerListesi.get(position)
        val u = holder.tasarim
        u.imageViewUrunResim.setImageResource(mContext.resources.getIdentifier(urun.urunResimAdi,"drawable",mContext.packageName))
        u.textViewUrunAdi.text = urun.urunAdi
        u.textViewUrunEskiFiyat.text = "₺${urun.urunEskiFiyat}"
        u.textViewUrunEskiFiyat.apply {
            paintFlags = paintFlags or Paint.STRIKE_THRU_TEXT_FLAG
        }
        u.textViewUrunFiyat.text = "₺${urun.urunFiyat}"
        u.textViewGram.text = urun.urunGram
    }

    override fun getItemCount(): Int {
        return urunlerListesi.size
    }
}