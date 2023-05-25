fun main() {
    println("3 basamaklı sayı giriniz:")
    val number= readlnOrNull()?.toInt()
    if (number==null) println("Sayısal değer giriniz")
    else if (number<100&&number>1000) println("3 basamaklı bir sayı giriniz")
    else println("Sayı:$number")

    val birlerbasamagı=number!!%10
    val yüzlerbasamagı=number/100
    if (birlerbasamagı==yüzlerbasamagı) println("$number palimdrome dur")
    else  println("$number palindrome değildir")
}