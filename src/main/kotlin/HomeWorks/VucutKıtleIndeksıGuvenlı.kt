package HomeWorks

fun main() {
    println("Vucüt Kitle İndeksi Hesaplama")
    println("Kilonuzu Kilogram Cinsinden Giriniz")
    val Kilo = readln().toDoubleOrNull()
    println("Boyunuzu m Cinsinden Giriniz")

    val Boy = readln().toDoubleOrNull()
    if (Kilo == null) {
        println("Kilonuzu sayı olarak giriniz")
    } else if (Boy == null) {
        println("Boyunuzu sayı olarak giriniz")
    } else {
        println("Girilen Kilo:$Kilo")
        println("Girilen Boy:$Boy")

        val vki = Kilo / (Boy * Boy)
        println("Vucüt Kitle İndeksiniz $vki'dir.")

        if (vki < 18.5) {
            println("Underweight")
        } else if (18.5 <= vki && vki < 25) {
            println("Normal")
        } else if (25 <= vki && vki < 30) {
            println("Overweight")
        } else {
            println("Obes")
        }

        // val vki = Kilo / (Boy * Boy)
        // println("Vucüt Kitle İndeksiniz $vki'dir")
    }
}


