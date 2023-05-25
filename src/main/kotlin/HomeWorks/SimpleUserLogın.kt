package HomeWorks

fun main() {

//    - Basit kullanıcı girişi
//    Sistemde kayıtlı olduğunu bildiğimiz 3 tane kullanıcı var.
//    Kullanıcıların giriş bilgileri kullanıcı adı - şifre olmak üzere şu şekildedir;
//
//    karnap - 12345
//    samet - 54321
//    tolga - 02468
//
//
//    Bir program yaz. Program çalıştığında kullanıcı adı ve şifre sorsun.
//    Eğer kullanıcı adı ve şifre doğru ise. Hoşgeldin <kullanıcı adı>. şeklinde ekrana yazı yazsın.
//    Eğer kullanıcı adı yanlış ise "böyle bir kullanıcı kayıtlı değildir", eğer şifre yanlış ise "yanlış şifre"
//    şeklinde ekrana yazı yazsın ve program sonlansın.
//
//    val user1 = "Ahmet"
//    val pasword1 = 12345
//    val user2 = "Mehmet"
//    val pasword2 = 54321
//    val user3 = "Cevdet"
//    val pasword3 = "02468"
//
//    println("Merhaba,Kullanıcı adınızı yazarmısınız:")
//    val entered = readlnOrNull()
//
//    if (entered == null) println("Lütfen kullanıcı adını giriniz")
//    else if (entered.toString() == user1 && entered.toString() == user2 && entered.toString() == user3) println("Şifrenizi giriniz:")
//    else println("Böyle bir kullanıcı bulunamadı.")
//
//    val enteredpasword= readlnOrNull()!!
//
//
//    when (enteredpasword.toInt()) {
//        12345 -> println("Hoşgeldin Ahmet")
//        54321 -> println("Hoşgeldin Mehmet")
//        "02468".toInt() -> println("Hoşgeldin Cevdet")


    val user1 = "Ahmet"
    val pasword1 = 12345
    val user2 = "Mehmet"
    val pasword2 = 54321
    val user3 = "Cevdet"
    val pasword3 = "02468"


    println("Kullanıcı adı:")
    val name = readlnOrNull()

    println("Şifreniz")
    val pasword = readlnOrNull()




    if (name == null) println("Lütfen kullanıcı adını yazınız")
    else if (pasword == null) println("Lütfen şifrenizi yazınız")
    else if (name != user1 && name != user2 && name != user3) println("Böyle bir kullanıcı kayıtlı değildir")
    else if (pasword.toInt() != pasword1 && pasword.toInt() != pasword2 && pasword != pasword3) println("Yanlış şifre girdiniz")
    else if (name == user1 && pasword.toInt() == pasword1) println("Hoşgeldin Ahmet")
    else if (name == user2 && pasword.toInt() == pasword2) println("Hoşgeldin Mehmet")
    else if (name == user3 && pasword == pasword3) println("Hoşgeldin Cevdet")
    else println("")

//    else if () println("Böyle bir kullanıcı yok")
//    else if (pasword==null) println("Lütfen şifrenizi yazınız")
//    else if (pasword.toInt()==12345) println("Hoşgeldin Ahmet")
//    else if (pasword.toInt()==54321) println("Hoşgeldin Mehmet")
//    else if (pasword=="02468") println("Hoşgeldin Cevdet")
//    else  println("Şifre yanlış")

}