package HomeWorks

fun main() {

       //Celcius to fahrenheit
        val celcius=49
    println((celcius.toDouble()-32)*9.0/5)

    //Fahrenheit to Celcius
    val fahrenhait=255
    println((fahrenhait-32)*5.0/9)


    //Poundan kilogramam çevirme
     val pound=54
    println(pound*454/1000 )

    //Kilogramdan paunda çevirme
    val kilogram=100
    println(kilogram*454/1000)

    //Feet ten cm çevirme
    val feet=100
    println(feet*305/1000)

    //Daire alanı
     val x=10
    val y=20
    println((x*y)/2)
    println(2*(x+y))

    //Çember alan ve çevresi
     val r=10
    println(3.14*r*r)
    println(2*3.14*r)

    //Silindir alan ve çevresi
    val Silindirr=2
    val Silindirh=5
    val Pi=3.14
    println((2*Pi*Silindirr*Silindirh) +(2*Pi*Silindirr*Silindirr))
    println((2*Pi*(Silindirr+Silindirh)))



}