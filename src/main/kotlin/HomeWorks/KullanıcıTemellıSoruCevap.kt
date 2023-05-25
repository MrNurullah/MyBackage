package HomeWorks

import java.security.KeyStore.TrustedCertificateEntry

fun main() {
//    println("İsminizi yazınız")
//    val isim = readLine()!!
//
//    println("İsminiz" + " " + isim)
//
//    println("Yaşınız")
//    val yas = readln()!!
//
//    println("Yaşınız"+" "+yas)
//    var doğruCevapSayısı = 0
//    var soru1DoğruMu = false
//    var soru2DoğruMu = false
    println("Soruların cevaplarını giriniz")

    val soru1 = "8 ile 11'in toplamının sonuçu nedir?"
    println(soru1)
    println("Cevabınız: ")
    val cevap1 = readln().toIntOrNull()


    val soru2 = "48 ile 56'ın çarpımının sonuçu nedir?"
    println(soru2)
    println("Cevabınız: ")
    val cevap2 = readlnOrNull()!!.toInt()

    val soru3 = "64 ile 81'in kareköklerinin çarpımının sonuçu nedir?"
    println(soru3)
    println("Cevabınız: ")
    val cevap3 = readlnOrNull()!!.toInt()

    val soru4 =
        "Aynı hızda akan 4 musluk bir havuzu 32 saate doldurmaktadır.Muslukların hızı iki kat artarsa havuz kaç saatte dolacaktır?"
    println(soru4)
    println("Cevabınız: ")
    val cevap4 = readlnOrNull()!!.toInt()

    if (cevap1!! == null && cevap2!! == null && cevap3!! == null && cevap4!! == null) println("Sayısal değer giriniz")
    else if (cevap1.equals(String) && cevap2.equals(String) && cevap3.equals(String) && cevap4.equals(String))
        println("Sayısal değer giriniz")

    if (cevap1 == 19 && cevap2 == 2688 && cevap3 == 72 && cevap4 == 4) println("4 doğru cevap")

    else if (cevap1 != 19 && cevap2 == 2688 && cevap3 == 72 && cevap4 == 4) println("3 doğru cevap")
    else if (cevap1 == 19 && cevap2 != 2688 && cevap3 == 72 && cevap4 == 4) println("3 doğru cevap")
    else if (cevap1 == 19 && cevap2 == 2688 && cevap3 != 72 && cevap4 == 4) println("3 doğru cevap")
    else if (cevap1 == 19 && cevap2 == 2688 && cevap3 == 72 && cevap4 != 4) println("3 doğru cevap")

    else if (cevap1 != 19 && cevap2 != 2688 && cevap3 == 72 && cevap4 == 4) println("2 doğru cevap")
    else if (cevap1 != 19 && cevap2 == 2688 && cevap3 != 72 && cevap4 == 4) println("2 doğru cevap")
    else if (cevap1 != 19 && cevap2 == 2688 && cevap3 == 72 && cevap4 != 4) println("2 doğru cevap")
    else if (cevap1 == 19 && cevap2 != 2688 && cevap3 != 72 && cevap4 == 4) println("2 doğru cevap")
    else if (cevap1 == 19 && cevap2 != 2688 && cevap3 == 72 && cevap4 != 4) println("2 doğru cevap")
    else if (cevap1 == 19 && cevap2 == 2688 && cevap3 != 72 && cevap4 != 4) println("2 doğru cevap")

    else if (cevap1 == 19 && cevap2 != 2688 && cevap3 != 72 && cevap4 != 4) println("1 doğru cevap")
    else if (cevap1 != 19 && cevap2 == 2688 && cevap3 != 72 && cevap4 != 4) println("1 doğru cevap")
    else if (cevap1 != 19 && cevap2 != 2688 && cevap3 == 72 && cevap4 != 4) println("1 doğru cevap")
    else if (cevap1 != 19 && cevap2 != 2688 && cevap3 != 72 && cevap4 == 4) println("1 doğru cevap")
    else println("")

    println("Yanlış yapılan sorular:")
    if (cevap1!=19) println(soru1)
    else if (cevap2!=2688) println(soru2)
    else if (cevap3!=72) println(soru3)
    else if (cevap4!=4) println(soru4)
    else println("Yanlış yapılan soru yoktur.")
}
