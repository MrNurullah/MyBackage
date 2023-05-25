package HomeWorks

fun main() {
    println("Ders Notunuz Yazınız")

    val DersNotu = readln().toDoubleOrNull()
    if (DersNotu==null) println("Sayısal değer giriniz")
    else if (DersNotu.equals(String)) println("Sayısal değer giriniz")
    else println("Ders Notu : $DersNotu")




    if (DersNotu!! < 45) {
        println("Ders Notunuz FF")
    } else if (45 <= DersNotu && DersNotu < 50) {
        println("Ders Notunuz DD")
    } else if (50 <= DersNotu && DersNotu < 60) {
        println("Ders Notunuz DC")
    } else if (60 <= DersNotu && DersNotu < 70) {
        println("Ders Notunuz CC")
    } else if (70 <= DersNotu && DersNotu < 80) {
        println("Ders Notunuz CB")
    } else if (80 <= DersNotu && DersNotu < 85) {
        println("Ders Notunuz BB")
    } else if (85 <= DersNotu && DersNotu < 90) {
        println("Ders Notunuz BA")
    } else {
        println("Ders Notunuz AA ")
    }


}