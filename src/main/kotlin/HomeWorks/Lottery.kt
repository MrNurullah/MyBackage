package HomeWorks

fun main() {
    println("Lottery oyununa hoş geldiniz")
    println("İki basamaklı bir sayı giriniz")
    val guessnumber = readln().toIntOrNull()
    if (guessnumber == null) println("sayısal değer giriniz")
    else if (guessnumber.equals(String)) println("Sayısal değer giriniz")
    else println("Girilen sayı:$guessnumber")

    val number = 10..99
    val randomnumber = number.random()
    println(randomnumber)

    //Bilgisayar tahminli sayı basamak değerleri
    val birlerbasamagirandomnumber = randomnumber % 10
    val onlarbasamagirandomnumber = randomnumber / 10

    //Kullanıcı girişli sayı basamak değerleri
    val birlerbasamagiguessnumber = guessnumber!! % 10
    val onlarbasamagiguessnumber = guessnumber / 10

    if (randomnumber == guessnumber) println("10.000 Tl değerinde para ödülü kazandınız")
    else if (onlarbasamagirandomnumber == birlerbasamagiguessnumber && birlerbasamagirandomnumber == onlarbasamagiguessnumber)
        println("3.000 Tl dğerinde para ödülü kazandınız")
    else if (birlerbasamagirandomnumber ==birlerbasamagiguessnumber&&onlarbasamagirandomnumber==onlarbasamagiguessnumber)
        println("1.000 Tl değerinde para ödülü kazandınız")
    else println("Kazanamadınız")


}