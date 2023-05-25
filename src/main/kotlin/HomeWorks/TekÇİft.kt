fun main() {
    //Çift ve Tek Sayı Hesaplatma

    println("Sayı Değerini Giriniz:")

    val sayı = readln().toInt()

     if (sayı == null) {
        println("Sayısal değer giriniz")
    } else {
        println("İşlem ilerliyor")
    }
    val cift = sayı % 2
    if (cift == 0) {
        println("Girilen sayı çift sayıdır")
    } else {
        println("Girilen sayı tek sayıdır")
    }

    }

//    if (sayı == null) {
//        println("Sayısal değer giriniz")
//    } else {
//        println("Girilen değer:$sayı") }


//    val tek = sayı % 3
//    val cift = sayı % 2

//    if (tek == Double) {
//        println("Girilen sayı çift sayıdır")
//    } else {println("Girilen sayı tek sayıdır") }
//

