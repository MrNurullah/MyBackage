package HomeWorks

fun main() {
    println("Notları Giriniz")
    println("Vize notunuzu giriniz:")
    val vize: Double = readln().toDouble()
    println("Final notunuzu giriniz:")
    val ödev = readln().toDouble()
    val final: Double = readln().toDouble()
    println("Ödev notunuzu giriniz.")
    if (vize==null) {
        println("Sayısal değer girilmelidir") }
    else if (final==null) {
        println("Sayısal değer girilmelidir") }
    else if (ödev==null){
        println("Sayısal değer girilmelidir") }
    else {
        println("Vize:$vize") }
    println("Final:$final")
    println("Ödev:$ödev")


    val baraj: Double = 45.0
    val not: Double = (vize * 30 / 100 + final * 50 / 100 + ödev * 20 / 100)
    if (baraj >= not) {
        println("Dersten Kaldınız.Ortalamanız $not dur")
    } else {
        println("Dersten Geçtiniz.Ortalamanız $not  dur")
    }
}