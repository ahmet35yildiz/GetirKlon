package com.example.getirklon

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.getirklon.databinding.FragmentUrunlerSayfasiBinding

class UrunlerSayfasiFragment : Fragment() {
    private lateinit var tasarim:FragmentUrunlerSayfasiBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        tasarim = FragmentUrunlerSayfasiBinding.inflate(inflater, container, false)

        //Ürünler
        //tasarim.toolbarUrunlerSayfasi.setLogo(R.drawable.getirlogo2)
        tasarim.rv.layoutManager = StaggeredGridLayoutManager(3,StaggeredGridLayoutManager.VERTICAL)

        val urunlerListesi = ArrayList<Urunler>()
        val u1 = Urunler(1,"Ruffles Original Sade Patates Cipsi",14.99,12.99,"107 gr","ruffles")
        val u2 = Urunler(2,"Dimes %100 Karışık Meyve Suyu",15.99,14.99,"1000 ml","dimes")
        val u3 = Urunler(3,"Magnum Classic",17.99,14.99,"100 ml","magnum")
        val u4 = Urunler(4,"Nutella Kakaolu Fındık Kreması",70.99,54.99,"750 gr","nutella")
        val u5 = Urunler(5,"Signal White Now",54.99,49.99,"75 ml","signal")
        val u6 = Urunler(6,"Sütaş Tam Yağlı Süt",21.99,20.99,"1 L","sutassut")
        val u7 = Urunler(7,"Sütaş Kaymaksız Yoğurt",49.99,45.99,"1000 gr","sutasyogurt")
        val u8 = Urunler(8,"Ülker Antep Fıstıklı Tablet Çikolata",18.99,16.99,"65 gr","ulkercikolata")
        val u9 = Urunler(9,"Dove Original Deodorant",51.99,47.99,"150 ml","dove")
        urunlerListesi.add(u1)
        urunlerListesi.add(u2)
        urunlerListesi.add(u3)
        urunlerListesi.add(u4)
        urunlerListesi.add(u5)
        urunlerListesi.add(u6)
        urunlerListesi.add(u7)
        urunlerListesi.add(u8)
        urunlerListesi.add(u9)

        val adapter = UrunlerAdapter(requireContext(),urunlerListesi)
        tasarim.rv.adapter = adapter

        //Kategoriler
        tasarim.rvKategori.layoutManager = StaggeredGridLayoutManager(1,StaggeredGridLayoutManager.HORIZONTAL)

        val kategorilerListesi = ArrayList<Kategoriler>()
        val k1 = Kategoriler(1,"Yeni Ürünler")
        val k2 = Kategoriler(2,"İndirimler")
        val k3 = Kategoriler(3,"Yaza Özel")
        val k4 = Kategoriler(4,"Su & İçecek")
        val k5 = Kategoriler(5,"Meyve & Sebze")
        val k6 = Kategoriler(6,"Fırından")
        val k7 = Kategoriler(7,"Temel Gıda")
        val k8 = Kategoriler(8,"Atıştırmalık")
        val k9 = Kategoriler(9,"Dondurma")
        val k10 = Kategoriler(10,"Süt Ürünleri")
        val k11 = Kategoriler(11,"Kahvaltılık")
        val k12 = Kategoriler(12,"Yiyecek")
        val k13 = Kategoriler(13,"Fit & Form")
        val k14 = Kategoriler(14,"Kişisel Bakım")
        val k15 = Kategoriler(15,"Ev Bakım")
        val k16 = Kategoriler(16,"Ev & Yaşam")
        val k17 = Kategoriler(17,"Teknoloji")
        val k18 = Kategoriler(18,"Evcil Hayvan")
        val k19 = Kategoriler(19,"Bebek")
        kategorilerListesi.add(k1)
        kategorilerListesi.add(k2)
        kategorilerListesi.add(k3)
        kategorilerListesi.add(k4)
        kategorilerListesi.add(k5)
        kategorilerListesi.add(k6)
        kategorilerListesi.add(k7)
        kategorilerListesi.add(k8)
        kategorilerListesi.add(k9)
        kategorilerListesi.add(k10)
        kategorilerListesi.add(k11)
        kategorilerListesi.add(k12)
        kategorilerListesi.add(k13)
        kategorilerListesi.add(k14)
        kategorilerListesi.add(k15)
        kategorilerListesi.add(k16)
        kategorilerListesi.add(k17)
        kategorilerListesi.add(k18)
        kategorilerListesi.add(k19)

        val adapterK = KategorilerAdapter(requireContext(),kategorilerListesi)
        tasarim.rvKategori.adapter = adapterK



        return tasarim.root
    }
}