package HomeWorks

fun main() {
    println("Vize Notunuz giriniz")
    val vize = readln().toDoubleOrNull()
    println("Final Notunuz Giriniz")
    val Final = readln().toDoubleOrNull()
    println("Ödev Notunuz Giriniz")
    val OdevNotu = readln().toDoubleOrNull()
    if (vize == null) {
        println("Vize Notunuz Sayı Değeri Olarak Giriniz")
    } else if (Final == null) {
        println("Final Notunuzu Sayı Değeri Olarak Giriniz")
    } else if (OdevNotu == null) {
        println("Ödev Notunuz Sayı Değeri Olarak Giriniz")
    } else {
        println("Vize : $vize")
        println("Final Notu : $Final")
        println("Ödev Notu : $OdevNotu")

        val Ortalama = (vize * 0.3) + (Final * 0.3) + (OdevNotu * 0.2)
        println(Ortalama)
        val Baraj = 45
        if (Ortalama>=Baraj) {
            println("Dersten başarılı Bir Şekilde Geçtiniz") }
        else    {
            println("Dersten Kaldınız") }


    }
}