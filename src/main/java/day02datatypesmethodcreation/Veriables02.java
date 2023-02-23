package day02datatypesmethodcreation;

public class Veriables02 {

  /*
     Non-Primitive Data Types: String bir non-primitive data type'dir.
                               Uretilen her bir class ayni zamanda "non-primitive data type" dir.
                               Bu yuzden "non-primitive data type" lar sinirsiz sayidadir denebilir.
                               Non-primitive data typelarin ismi büyük harfle baslar.
                               Non-primitive data typelarin tamami icin Java memory'de ayni miktarda yer ayirir.

       Interview Sorusu: "primitive"ve "nonprimitive" data type'lari arasindaki fark nedir?
                       1)"primitive" ler sadece bizim atadigimiz degeri icerir,
                         "non-primitive" ler bizim atadigimiz deger ve methodlari icerir.
                       2)"primitive" ler kucuk harfle baslar "non-primitive" ler buyuk harfle baslar.
                       3)"primitive" leri java uretmistir ve 8 tanedir,
                         "non-primitive"  leri Java ve developerlar uretebilir, sinirsiz sayidadir.
                       4)"primitive" ler memory'de data type ina göre yer kaplar,
                         "non-primitive" ler icin Java memoryde hep ayni buyuklukte yer ayirir.
   */
  public static void main(String[] args) {

      //Ornek 1:Sehir ismi icin bir veriable olusturun ve bir deger atayip onu ekrana yazdirin.
      String cityName = "Dubai";

      System.out.println(cityName);


  }



}
