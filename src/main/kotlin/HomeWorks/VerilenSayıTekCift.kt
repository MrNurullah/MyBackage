package HomeWorks

fun main() {
    println("Bir sayı değeri yazınız")
    val sayı = readln().toIntOrNull()

    if (sayı==null) println("Tam sayı değer giriniz")
   // else if (sayı.equals(String)) println("Sayısal değer giriniz")
    else {
        println("Sayı:${sayı.toInt()}")
        val cift = sayı % 2

        if (cift > 0) {
            println("$sayı tek sayıdır")
        } else {
            println("$sayı çift sayıdır")
        }
    }


}