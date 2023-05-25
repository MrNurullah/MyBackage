package HomeWorks

fun main() {
    println("ISBN sayı hesaplama programına hoşgeldiniz")
    println("9 Basamaklı bir sayı giriniz")

    val number= readln().toIntOrNull()

    if (number==null)      {         println("Bir değer giriniz") }
    else if (number.toString().length!=9) { println("9 basamaklı bir sayı giriniz") }
    else if (number.toString().length==9) { //d1=1.rakam d2=2.rakam gibi ilerliyor
        val d1=number/100000000
        val d2=number/10000000%10
        val d3=number/1000000%10
        val d4=number/100000%10
        val d5=number/10000%10
        val d6=number/1000%10
        val d7=number/100%10
        val d8=number/10%10
        val d9=number%10
        val d10 = (d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 + d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9) % 11



        if (d10==10) println("$number"+"X")
        else         println("$number"+"$d10")
    }
    else if (number.equals(String)){ println("Sayısal değer giriniz")}
        else                         {   println("")}





}