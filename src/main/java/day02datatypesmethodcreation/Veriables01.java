package day02datatypesmethodcreation;

public class Veriables01 {

    //primitive data types -->char - boolean - byte - short - int - long - float - double
    //float:Virgullu sayilar(Ondalik sayilar-decimial numbers) icin kullanilir.(Fiyatlandirma-12.99)
    //double:Virgullu sayilar(Ondalik sayilar-decimial numbers) icin kullanilir.(Hucre agirligi 0.0000000112)

    //Note 1: primitive data type lari Java olusturmustur, biz olusturamayiz.
    //Note 2: primitive data type larinin isimlerinde sadece kucuk harf kullanilir.
    //Note 3: primitive data'lar data type lara gore memory de farkli farkli yer kaplarlar.
    //Note 4: primitive data'lar iclerinde sadece sizin atadiginiz degeri barindirirlar.



    public static void main(String[] args) {

        //Ornek 1: Gomlek ve ayakkabi fiyatlari icin iki tane veriable olusturup toplam fiyati ekrana yazdiriniz.
        //Note: Java "Decimial Numbers" i otomatik olarak "double" kabul eder.
        //   Siz data type'ini "float" yazarsaniz hata verir.
        //   float olmasinda israr ediyorsaniz sonuna "F" veya "f" koymalisiniz.
        //   float memory de 4 byte,double 8 byte yer kaplar.
        float shirtPrice = 12.99F;
        float shoesPrice = 15.89F;
        //System.outprintln() ekrana yazdirir ve "pointer" i bir sonraki satira koyar.
        //System.outprint() ekrana yazdirir ve "pointer" i ayni satirda tutar.

        System.out.println(shirtPrice+shoesPrice);


        //System.outprintln() yazdirmanin kısa yolu ==> "sout"yaz ve Enter2a bas.
        System.out.println();

        //Ornek 2:Hucre agirligi ve Amip'in agirligi icin iki tane veriable tabani olusturun ve agirliklari farkini ekrana yazdirin.
        double weightCell = 0.000000000000112;
        double weightAmip = 0.000000000000023;

        System.out.println(weightCell-weightAmip);//8.9E-14 ==> "8.9 carpi 10 üzeri -14" "E ==>Exponent"










    }


}
