package HomeWorks

fun main() {
    println("Rastgele ay yazdıran uygulamaya hoşgeldiniz")
    println("Başlatmak için sağ üstte bulunan yeşil üçgene tıklayınız")

    val mont = 1..12
    val randommonth = mont.random()

//    when (randommonth) {
//        1 ->  println("$randommonth.Ocak")
//        2 ->  println("$randommonth.Şubat")
//        3 ->  println("$randommonth.Mart")
//        4 ->  println("$randommonth.Nisan")
//        5 ->  println("$randommonth.Mayıs")
//        6 ->  println("$randommonth.Haziran")
//        7 ->  println("$randommonth.Temmuz")
//        8 ->  println("$randommonth.Ağustos")
//        9 ->  println("$randommonth.Eylül")
//        10 ->  println("$randommonth.Ekim")
//        11 ->  println("$randommonth.Kasım")
//        12 ->  println("$randommonth.Aralık")
//    }
        if      (randommonth==1) println("$randommonth.Ocak")
        else if (randommonth==2) println("$randommonth.Şubat")
        else if (randommonth==3) println("$randommonth.Mart")
        else if (randommonth==4) println("$randommonth.Nisan")
        else if (randommonth==5) println("$randommonth.Mayıs")
        else if (randommonth==6) println("$randommonth.Haziran")
        else if (randommonth==7) println("$randommonth.Temmuz")
        else if (randommonth==8) println("$randommonth.Ağustos")
        else if (randommonth==9) println("$randommonth.Eylül")
        else if (randommonth==10) println("$randommonth.Ekim")
        else if (randommonth==11) println("$randommonth.Kasım")
        else if (randommonth==12) println("$randommonth.Aralık") }


