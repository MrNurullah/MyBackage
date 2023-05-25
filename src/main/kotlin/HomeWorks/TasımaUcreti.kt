package HomeWorks

fun main() {
    run {
        println("Paket Ağırlınız : ")
        val PaketAgırlıgı = readln().toDoubleOrNull()
        if (PaketAgırlıgı==null) println("Sayısal değer giriniz")
        else if (PaketAgırlıgı.equals(String)) println("Sayısal değer giriniz")
        else println("")

        if (0 < PaketAgırlıgı!! && PaketAgırlıgı <= 1) {
            println("Ücretiniz 3.5 Tldir")
        } else if (1 < PaketAgırlıgı && PaketAgırlıgı <= 3) {
            println("Ücretiniz 5.5 Tldir")
        } else if (3 < PaketAgırlıgı && PaketAgırlıgı <= 10) {
            println("Ücretiniz 8.5 Tldir")
        } else if (10 < PaketAgırlıgı && PaketAgırlıgı <= 20) {
            println("Ücretiniz 10 Tldir")
        } else {
            println("Paket Taşınamaz")
        }
    }

    }