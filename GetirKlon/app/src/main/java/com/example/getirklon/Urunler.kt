package com.example.getirklon

import java.io.Serializable

data class Urunler(var urunId:Int,var urunAdi:String,var urunEskiFiyat:Double,var urunFiyat:Double,var urunGram:String,var urunResimAdi:String) : Serializable {
}