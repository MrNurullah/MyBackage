package HomeWorks

fun main() {
    println("Gidilecek yolun uzunluğunu yazınız(km)")
    val YolUzunlugu = readln().toDoubleOrNull()
    if (YolUzunlugu == null) {
        println("Lütfen sayısal değerler giriniz")
    } else {
        println("Yol: $YolUzunlugu")

        val cıktı = YolUzunlugu / 25.5 * 3.55
        println("Çıktı:Toplam yolculuk maliyeti : $cıktı")
    }


}