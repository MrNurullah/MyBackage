package HomeWorks

fun main() {

    /*    Bir program yaz. Bu programın amacı yeni bir kullanıcı kayıt ettirmek (gerçek kayıt değil sadece simüle ediyor).
    Program çalıştığında kullanıcı adı ve şifre sorsun. Eğer kullanıcı adı daha önce kullanılmamışsa ve şifre en az 8
    karakter içeriyorsa ekrana "Kullanıcı oluşturuldu" yazsın ve program sonlansın.
    Eğer kullanıcı adı başkası tarafından kullanılıyorsa "Bu kullanıcı adı zaten alınmış." diyip 2 tane kullanıcı
    adı önersin ve program sonlansın. Önereceği kullanıcı adları ise kullanıcının yazdığı ad+rastgele 2
    basamaklı sayı şeklinde olsun. Eğer kullanıcı adı alınmamışsa ama şifre 8 karakterden kısa ise
    "Şifre en az 8 karakter olmalı" şeklinde ekrana yazsın ve program sonlansın.*/

    //Yeni Kullanıcı kayıt ettirme

    val user1 = "Ali"
    val user2 = "Veli"
    val user3 = "Tuncay"

    println("Kullanıcı adını giriniz")
    val user= readlnOrNull()

    println("Şifreniz:")
    val password= readln().toIntOrNull()

    val range=10..99
    val random=range.random()
    val random1=range.random()

    if (user==null&&password==null) {
        println("Kullanıcı adını giriniz") }

    else if (user==user1) {  println("Kullanıcı adı alınmıştır.Önerilen adlar:$user$random ve $user$random1") }
    else if (user==user2) {  println("Kullanıcı adı alınmıştır.Önerilen adlar:$user$random ve $user$random1") }
    else if (user==user3) {  println("Kullanıcı adı alınmıştır.Önerilen adlar:$user$random ve $user$random1") }

    else if (user!=user1&&password.toString().length>=8) { println("Kullanıcı oluşturuldu") }
    else if (user!=user2&&password.toString().length>=8) { println("Kullanıcı oluşturuldu") }
    else if (user!=user3&&password.toString().length>=8) { println("Kullanıcı oluşturuldu") }

    else if (user!=user1&&password.toString().length<=8) { println("Şifre en az 8 karakterli olmalıdır") }
    else if (user!=user2&&password.toString().length<=8) { println("Şifre en az 8 karakterli olmalıdır") }
    else if (user!=user3&&password.toString().length<=8) { println("Şifre en az 8 karakterli olmalıdır") }

    else { println("Hata101") }

//    val range = 10..99
//    val random: Number = range.random()
//
//    println("Kullanıcı adınızı oluşturunuz:")
//    val name = readln()
//
//    println("Şifrenizi oluşturunuz:")
//    val pasword = readln().toIntOrNull()
//
//    if (name != user1 && name != user2 && name != user3 && pasword!! / 10 / 10 / 10 / 10 / 10 / 10 / 10 > 0) {
//        println("Kullanıcı oluşturuldu")
//    } else if (name == user1 && name == user2 && name == user3) {
//        println("Bu kullanıcı adı zaten alınmış.Önerilen kullanıcı adları:")
//        println("$name+$random")
//        println("$name+$random")
//    } else if (name != user1 && name != user2 && name != user3 && pasword!! / 10 / 10 / 10 / 10 / 10 / 10 / 10 < 0) {
//        println("Şifre en az 8 karakter olmalı")
//    } else if (name == null) {
//        println("Kullanıcı adını giriniz lütfen")
//    } else if (pasword == null) {
//        println("Şifrenizi giriniz")
//    }
//1-)enter enter da hata verdi
//2-)isim denetleme bloğu çalışmıyorISN

//    val user1 = "Ahmet"
//    val pasword1 = 12345
//
//    val user2 = "Mehmet"
//    val pasword2 = 54321
//
//    val user3 = "Cevdet"
//    val pasword3 = "02468"
//
//    val range = 1..9
//    val randomrange = range.random()
//
//    println("Kullanıcı adınızı oluşturunuz:")
//    val name = readln()
//
//    println("Şifrenizi oluşturunuz:")
//    val pasword = readln().toIntOrNull()
//
//    if (name == null) {
//        println("Lütfen kullanıcı adını yazınız")
//    } else if (pasword == null) {
//        println("Parolanızı giriniz")
//    } else if (name == "Ahmet" && name == "Mehmet" && name == "Cevdet") {
//        println("Bu kullanıcı adı zaten alınmış.Önerilenler: $name+$randomrange+$randomrange")
//    } else if (name != user1 && name != user2 && name != user3 && pasword / 10 / 10 / 10 / 10 / 10 / 10 / 10 < 0) {
//        println("Şifre en az 8 karakterli olmalı")
//    } else if (name != user1 && name != user2 && name != user3 && pasword / 10 / 10 / 10 / 10 / 10 / 10 / 10 > 0) {
//        println("Kullanıcı oluşturuldu")
//    }

// null kısmı hata verdi
}