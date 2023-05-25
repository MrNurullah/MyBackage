package HomeWorks

fun main() {
    println("Hizmet Bedeli Tutarını Giriniz :")

    val HizmetBedeli = readln().toDoubleOrNull()

    if (HizmetBedeli == null) {
        println("Hizmet Bedeli Tutarı sayı Olmalıdır")
    } else {
        println("Girilen Hizmet Bedeli : $HizmetBedeli")

        val Bahsis = HizmetBedeli * 15 / 100
        val Cikti = HizmetBedeli + Bahsis
        println("Total ÜCretiniz : $Cikti")
    }
}
