package HomeWorks

/*- Müzik Uygulaması
Bir müzik uygulamasında kullanıcılar çalma listeleri oluşturabiliyor ve bu çalma listelerinde rastgele şarkı çalabiliyorlar
(Spotify gibi). Bir kullanıcının 3 tane L1, L2, L3 isminde çalma listeleri mevcut.
L1 içinde 10 tane, L2 içinde 15 tane, L3 içinde 20 tane şarkı var. Her çalma listesinde şarkılar 1'den başlayarak numaralandırılıyor.
 Örn; L1 içinde şarkılar 1,2,3,...,10 şeklinde, L2 içinde ise 1,2,3,...,15 şeklinde numaralandırılmıştır.

 Kullanıcıdan çalma listesi ismini alıp rastgele bir tane şarkıyı seçen uygulama yaz.
 Kullanıcı olmayan bir çalma listesi girerse "Böyle bir çalma listesi bulunmamaktadır" şeklinde ekrana bastır ve program sonlansın.
 Eğer varsa içinden rastgele bir şarkı seçip "X. şarkı çalınıyor..." şeklinde ekrana bastır ve program sonlansın

Örn çalışma 1;
Çalma listesini giriniz: L1
3. şarkı çalınıyor... /---EKSİK---

Örn çalışma 2;
Çalma listesini giriniz: L3
17. şarkı çalınıyor /---EKSİK---

Örn çalışma 3;
Çalma listesini giriniz: L6
Böyle bir çalma listesi bulunmamaktadır /---EKSİK---

Örn çalışma 4;
Çalma listesini giriniz: 4asd
Böyle bir çalma listesi bulunmamaktadır /---EKSİK---*/
fun main() {
    val L1=1..10
    val L2=1..15
    val L3=1..20

    println("Lütfen L1,L2 ve L3 çalma listelerinden seçim yapınız")

    val choise= readlnOrNull()

    if (choise==null) println("Lütfen çalma listesi giriniz")
    else if (choise=="L1") println("L1 çalma listesinden ${L1.random()} çalınıyor")
    else if (choise=="L2") println("L2 çalma listesinden ${L2.random()} çalınıyor")
    else if (choise=="L3") println("L3 çalma listesinden ${L3.random()} çalınıyor")
    else    println("Böyle bir çalma listesi bulunmamaktadır")




}