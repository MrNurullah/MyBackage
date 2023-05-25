package HomeWorks

fun main() {
//Kitle İndeksi

    val boy = 1.60
    val kilo: Double = 80.0

    val vucutKitleIndeksi = kilo / (boy * boy)

    println(vucutKitleIndeksi)

    if (18.5 > vucutKitleIndeksi) {
        println("Underweight")
    } else if (25 > vucutKitleIndeksi && vucutKitleIndeksi >= 18.5) {
        println("Normal")
    } else if (30 > vucutKitleIndeksi && vucutKitleIndeksi >= 25) {
            println("Overweight")
        } else {
            println("obez")
        }
    }


