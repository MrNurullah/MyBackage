fun main() {

    println("İlk sayıyı giriniz:")
    val number1 = readln().toDoubleOrNull()
    println("İkinci sayıyı giriniz:")
    val number2 = readln().toDoubleOrNull()
    println("Üçüncü sayıyı giriniz:")
    val number3 = readln().toDoubleOrNull()

    if (number1 == null) {
        println("Sayısal değer giriniz")
    } else if (number2 == null) {
        println("Sayısal değer giriniz")
    } else if (number3 == null) {
        println("Sayısal değer giriniz")
    } else {
        println(
            "1.sayı:$number1" +"" +
                    " "+

                      "2:sayı:$number2" +" " +
                    ""+

                    "3.sayı:$number3"
        )
    }
    println("Sayıların Artan sıraya göre sılaması")


    if      (number1!! > number2!! && number2 > number3!!) println("$number1>$number2>$number3")
    else if (number1 > number3!! && number3 > number2) println("$number1>$number3>$number2")

    else if (number2 > number1 && number1 > number3) println("$number2>$number1>$number3")
    else if (number2 > number3 && number3 > number1) println("$number2>$number3>$number1")

    else if (number3 > number1 && number1 > number2) println("$number3>$number1>$number2")
    else if (number3 > number2 && number2 > number1) println("$number3>$number2>$number1")


}