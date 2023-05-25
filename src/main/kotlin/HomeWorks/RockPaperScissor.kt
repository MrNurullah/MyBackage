package HomeWorks

fun main() {

    println("Taş(1),Kağıt(2) yada Makas(3) seçiminizi yazınız:")

    val userinput = readln().toIntOrNull()

    if (userinput == null) println("Lütfen bir seçim yapınız")
    else if (userinput.equals(String)) println("Seçiminizi sayısal olarak giriniz")
    else println("")
    when (userinput) {
        1 -> println("Taş")
        2 -> println("Kağıt")
        3 -> println("Makas")
    }

    val number = 1..3
    val randomnumber = number.random()
    when (randomnumber) {
        1 -> println("Taş")
        2 -> println("Kağıt")
        3 -> println("Makas")
    }
    if (userinput == 1) {
        if (randomnumber == 1) {
            println("Taş vs Taş. Berabere")
        } else if (randomnumber == 2) {
            println("Taş vs Kağıt.Kaybettiniz")
        } else if (randomnumber == 3) {
            println("Taş vs Makas.Kazandınız")
        }
    } else if (userinput == 2) {
        when (randomnumber) {
            1 -> println("Kağıt vs Taş.Kazandınız")
            2 -> println("Kağıt vs Kağıt.Berabere")
            3 -> println("Kağıt vs Makas.Kaybettiniz")
        }
    }
        else
            when (randomnumber) {
                1 -> println("Makas vs Taş.Kaybettiniz")
                2 -> println("Makas vs Kağıt.Kazandınız")
                3 -> println("Makas vs Makas.Beraber")
            }



        }





//    val comshose=when (randomnumber)
//    {1->  println("Taş")
//     2->  println("kağıt")
//     3-> println("Makas")
//    }


