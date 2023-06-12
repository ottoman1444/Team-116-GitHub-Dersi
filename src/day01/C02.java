package day01;

public class C02 {
 /*
   git.init komutu, bir workingDirectory'u git ile irtibatlandiri
            bu komut her proje icin sadece 1 kere calistirilir
            bu komut ile birlikte git icinde bulunan kalsoru kontrol etmeye baslar.

   Bu klasorde her yedek almak istedigimizde
   commit yapmaliyiz
   assagidaki 3 komut bizim dosyalarimizi her yedeklemek istedigimizde kullanilir.

   1 - git add .    : son kaydedilen versiyondan sonra
                      projede yapilan degisiklikleri ekler

   2 git commit -m "commit ismi"  :  yazdigimiz anda, projenin son durumunu bir
                                     versiyon olarak kaydeder. Burada "" icinde yazilan commit ismi
                                     anlamli olmasinda fayda vardir.
                                     ilerleyen asamalarda geri donus yapmak istersek hangi
                                     commite geri donmek istersek aciklamalardan bulabiliriz

   git ile iliskilendirdigimiz dosyadaki class isimleri
   git durumuna gore renklenir

   kirmizi : bu class herhangi bir versiyona eklenmedi
   mavi    : bu dosya bir versiyona eklendi ama sonradan degisiklik yapilmis
   siyah   : bu class bir versiyona son haliyle yedeklendi
             sonrasinda hic bir degisiklik yapilmadi

   3- git push : local repo'da commit ettigimiz dosyalarimizi
               uzak masaustu(github) yollamak icin kullanilir

               Local bilgisayarda olusturdugumuz bir repo'yu
               GitHub'a yollamak ve orada yedeklemek istiyorsak
               oncelikle Github hesabi olustumamaiz ve sonrasinda projemizi
               gonderecegimiz github reosunu hazirlamamiz gerekir

               GitHub'da yeni bir repository olustudugumuzda
               bir kereye mahsus olarak ilk kullanimda local repo ile
               remote repo arasinda baglanti kurmamiz gerekir


  */
}
