package HomeWorks

fun main() {
    println("Yıl Sayısı Giriniz")

    val Yıl = readln().toDoubleOrNull()
    if (Yıl == null) {
        println("Yıl sayısını sayısal değer olarak giriniz")
    } else {
        println("")
        val Gün: Int = Yıl.toInt() * 365
        val Dakika: Int = Gün * 60 * 60
        println("Girilen Yıl:$Yıl")
        println("Gün:$Gün")
        println("Dakika:$Dakika")

    }
}