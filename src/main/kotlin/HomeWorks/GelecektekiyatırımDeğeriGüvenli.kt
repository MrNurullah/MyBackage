package HomeWorks

fun main() {
    println("Yatırım yapacağınız miktarı yazınız")
    val YatırımMiktari= readln().toDoubleOrNull()

    println("Kaç yıllık yatırım yapacağınız yazınız")
    val YılSayısı= readln().toDoubleOrNull()
    if (YatırımMiktari==null) {
        println("Yatırım Miktarını Sayı değeri olarak giriniz")
    } else if (YılSayısı==null) { println("Yıl sayısını sayı değeri olarak giriniz") }
    else {
        println("Yatırım Miktari:$YatırımMiktari")
        println("Yıl Sayısı:$YılSayısı")
        val FaizOranı = 0.0325
        val altformul = Math.pow(1 + FaizOranı, YılSayısı * 12)
        val GelecektekiMiktar: Double = YatırımMiktari * altformul
        println("Yıllık Faiz Oranı : $GelecektekiMiktar")

    }


}