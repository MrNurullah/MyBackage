package HomeWorks

fun main() {
    println("Bir sayı değeri giriniz")
    val sayı = readln().toDoubleOrNull()
    if (sayı == null) {
        println("Sayı değeri giriniz")
    } else {
        println("Sayı:$sayı")
    }
    val bol5 = sayı!! % 5
    val bol6 = sayı % 6


    println("5 ve 6 ile tam bölünebilir mi?")
    if (bol5 == 0.0 && bol6 == 0.0) {
        println("Evet")
    } else {
        println("Hayır")
    }

    println("5 veya 6 ile bölünebilir mi?")
    if (bol5 == 0.0 && bol6 >= 0) {
        println("Evet")
    } else if (bol6 == 0.0 && bol5 >= 0) {
        println("Evet")
    } else {
        println(" ")
    }

    println("5 ile bölünebilir mi?")
    if (bol5 == 0.0) {
        println("Evet")
    } else {
        println("Hayır")
    }

    println("6 ile bölünebilir mi?")
    if (bol6 == 0.0) {
        println("Evet")
    } else {
        println("Hayır")
    }
}