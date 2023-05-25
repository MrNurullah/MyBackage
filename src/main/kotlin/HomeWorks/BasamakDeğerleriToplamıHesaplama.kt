package HomeWorks

fun main() {
    //Doğal Sayı Rakamlarının Toplamı
    println("Doğal Sayı Değeri Giriniz")
    val sayı = readln().toDoubleOrNull()
    if (sayı == null) {
        println("Sayısal değer olarak giriniz")
    } else if (sayı > 1000) {
        println("Girilen sayı değeri 1000 den küçük olmalıdır") }
        else {
            println("Girilen değer=$sayı")

            val BirlerBasamagı = sayı % 100 % 10
            val OnlarBasamagı: Double = sayı % 100 / 10
            val YüzlerBasamagı: Double = sayı / 100
            println("BirlerBasamağı = ${BirlerBasamagı.toInt()}")
            println("OnlarBasamağı = ${OnlarBasamagı.toInt()}")
            println("YüzlerBasamağı = ${YüzlerBasamagı.toInt()}")

            val Toplam = (BirlerBasamagı + OnlarBasamagı + YüzlerBasamagı).toInt()
            println("Basamak değerleri toplamı= $Toplam")

        }
    }
