package HomeWorks

fun main() {

    println("Bugünü giriniz:")
    val today = readLine()

    val GirilenGünSayısalDeger =
        if (today == "Pazartesi")      1
        else if (today == "Salı")      2
        else if (today == "Çarşamba")  3
        else if (today == "Perşembe")  4
        else if (today == "Cuma")      5
        else if (today == "Cumartesi") 6
        else                           7

    println("Bugün dahil kaç gün sonrasını bulmak istiyorsunuz:")

    val plusdays = readln().toInt()
    val Formul = ((plusdays % 7)+GirilenGünSayısalDeger)%7

    if      (plusdays==1)  println("Pazartesi")
    else if (Formul==2)    println("Salı")
    else if (Formul==3)    println("Çarşamba")
    else if (Formul==4)    println("Perşembe")
    else if (Formul==5)    println("Cuma")
    else if (Formul==6)    println("Cumartesi")
    else                   println("Pazar")








}

//val Mon ="Pazartesi"
//val Tue = "Salı"
//val Wed = "Çarşamba"
//val Thu = "Perşembe"
//val Fri = "Cuma"
//val Sat = "Cumartesi"
//val Sun = "Pazar"