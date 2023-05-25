package HomeWorks


fun main() {
//    val genislik= List(1){ Random(0-100) }
//    val yukseklik= List(1){ Random(0-200) }
//
//    println(genislik)
//    println(yukseklik)
    println("Rastgele sayı atamasına hoşgeldiniz")
    println("Aşağıdakı se.eneklerden bırını se.ın")
    println("1- Oyuna Başla")
    println("2- Oyundan :ık")
    val basla = readln()
    ""
    " "
    if (basla == "1") {
        println("Oyun Başlıyor")
        val genislik = 0..100
        val yukseklik = 0..200

        println(genislik.random())
        println(yukseklik.random())

    } else if (basla == "2") {
        println("Oyun kapatılıyor")


    } else {
        println("Lütfen seçiminizi start yada close olarak belirtiniz")


    }






    }