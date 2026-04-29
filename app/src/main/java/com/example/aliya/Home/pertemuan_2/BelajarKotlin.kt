package com.example.aliya.Home.pertemuan_2

fun main () {
    println("Hai rekan-rekan...")
    println("Selamat datang di bahasa pemrograman kotlin")

    println("===================")

    var angka = 15
    println("Hasil dai 15 + 10 = ${angka + 10 }")

    val nilaiInt = 10000
    val nilaiDouble = 100.003
    val nilaiFloat = 100.0f

    println("Nilai Integer =$nilaiInt")
    println("Nilai Double =$nilaiDouble")
    println("Nilai Float =$nilaiFloat")

    println("=========STRING=========")
    val huruf = 'a'
    println("Ini penggunaan karakter '$huruf'")

    val nilaiString = "Mawar"
    println("Halo $nilaiString!\nApa Kabar?")

    println("========Kondisi=========")

    val nilai = 10
    if(nilai<0)
        println("Bilangan negatif")
    else {
        if(nilai%2 == 0)
            println("Bilangan genap")
        else
            println("Bilangan ganjil")
    }

    println("===========Perulangan==========")
    val kampusKu: Array<String> = arrayOf("Kampus", "Politeknik", "Caltex", "Riau")
    for (kampus: String in kampusKu) {
        println(kampus)
    }

}