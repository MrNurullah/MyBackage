package HomeWorks

fun main() {
    println("Ana Para Miktarını Giriniz: ")
    val AnaPara = readln().toDoubleOrNull()
    println("Faiz Oranını Giriniz: ")
    val YıllıkFaizOranı = readln().toDoubleOrNull()
    if (AnaPara == null) {
        println("Ana Para Miktarını Sayı Değeri Olarak Giriniz")
    } else {
        if (YıllıkFaizOranı == null) {
            println("Faiz Oranını Sayı Değeri Olarak Giriniz")
        } else {
            println("Ana Para : $AnaPara")
            println("Yıllık Faiz Oranı : $YıllıkFaizOranı")
            val BirSonrakiAyınFaizi = AnaPara * (YıllıkFaizOranı / 1200)


            println("Bir Sonraki Ayın Faiz Oranı : $BirSonrakiAyınFaizi")
            println("2 Ay Sonrasına Ait Faizi Görüntülemek İçin Devam Yazın")
            val Devam = readlnOrNull()

            if (Devam == null) {
                println("Lütfen İşlemlerin Devam Etmesi için Devam Yazınız")
            } else if (Devam == "Devam") {
                println("İşleme Devam Ediliyor")

            } else {
                println("İşleme Devam Edilmiyor")
            }

//
//            val İşlemDevamı = readln()
//            val İkiAySonrakiAyınFaizi = BirSonrakiAyınFaizi * 2
//            if (İşlemDevamı == "Devam") {
//                println(İkiAySonrakiAyınFaizi)
//            } else {
//                println("İşlem Bitmiştir")
//            }

        }
    }
}





