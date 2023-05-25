package HomeWorks

fun main() {
    println("Ana para miktarını giriniz:")

    val AnaPara = readln().toDoubleOrNull()

    if (AnaPara == null) {
        println("Ana para miktarını sayı değeri olarak giriniz")
    } else {
        println("Ana para = $AnaPara")


        val Faız = 0.35
        val Cıktı = AnaPara * (Faız / 1200)
    println("Faiz Miktarı : $Cıktı")


    }
}