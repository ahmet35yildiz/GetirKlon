package com.example.widgetskullanimiodevi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.widgetskullanimiodevi.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var tasarim:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        tasarim = ActivityMainBinding.inflate(layoutInflater)
        setContentView(tasarim.root)

        var textViewBaslangic = ""

        tasarim.button0.setOnClickListener {
            val sayi0 = "0"
            textViewBaslangic += sayi0
            tasarim.textView.setText("$textViewBaslangic")
        }
        tasarim.button1.setOnClickListener {
            val sayi1 = "1"
            textViewBaslangic += sayi1
            tasarim.textView.setText("$textViewBaslangic")
        }

        tasarim.button2.setOnClickListener {
            val sayi2 = "2"
            textViewBaslangic += sayi2
            tasarim.textView.setText("$textViewBaslangic")
        }

        tasarim.button3.setOnClickListener {
            val sayi3 = "3"
            textViewBaslangic += sayi3
            tasarim.textView.setText("$textViewBaslangic")
        }

        tasarim.button4.setOnClickListener {
            val sayi4 = "4"
            textViewBaslangic += sayi4
            tasarim.textView.setText("$textViewBaslangic")
        }

        tasarim.button5.setOnClickListener {
            val sayi5 = "5"
            textViewBaslangic += sayi5
            tasarim.textView.setText("$textViewBaslangic")
        }

        tasarim.button6.setOnClickListener {
            val sayi6 = "6"
            textViewBaslangic += sayi6
            tasarim.textView.setText("$textViewBaslangic")
        }

        tasarim.button7.setOnClickListener {
            val sayi7 = "7"
            textViewBaslangic += sayi7
            tasarim.textView.setText("$textViewBaslangic")
        }

        tasarim.button8.setOnClickListener {
            val sayi8 = "8"
            textViewBaslangic += sayi8
            tasarim.textView.setText("$textViewBaslangic")
        }

        tasarim.button9.setOnClickListener {
            val sayi9 = "9"
            textViewBaslangic += sayi9
            tasarim.textView.setText("$textViewBaslangic")
        }

        tasarim.buttonSifirla.setOnClickListener {
            textViewBaslangic = ""
            tasarim.textView.setText("$textViewBaslangic")
        }
        tasarim.buttonToplama.setOnClickListener {
            val toplama = "+"
            textViewBaslangic += toplama
            tasarim.textView.setText("$textViewBaslangic")
        }
        tasarim.buttonEsittir.setOnClickListener {
            var toplanacaklar = textViewBaslangic.split("+").toTypedArray()
            var toplam:Int = 0
            for (i in toplanacaklar) {
                 toplam += i.toInt()
            }
            tasarim.textView.setText("${toplam.toString()}")




        }









    }
}