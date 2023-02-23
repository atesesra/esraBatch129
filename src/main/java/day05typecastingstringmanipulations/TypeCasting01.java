package day05typecastingstringmanipulations;

public class TypeCasting01 {

    /*
    Numeric primitive data type'larinin birbirine donusturulmesine "Type Casting" denir.
    Numeric Data Type'lar byte-short-int-long-float-double

    Note1:Kucuk data typelarini buyuk dataya type'larina cevirmeyi java otomatik olarak yapabilir.
    Bu isleme "Autowidening"(Otomatik genişletme) denir.
    Note2:Buyuk data type'larini kucuk data type'larina cevirmek riskli bir istir.Java bu riskli isi otomatik olarak yapmaz.
    Bu islemi kod yazanlar yapar.
    Bu isleme "ExplicitNarrowing"(Aciktan daraltma) denir.
     */

    public static void main(String[] args) {

        //byte data type ini int data type ina ceviriniz.
        byte age = 13;
        int ageInt=age;
        //long data type ini short data type a cevirelim.
        long weight =234;
        short weightShort=(short)weight;//Explicit Narrowing parantez icine aldik
        //int data type i float data type a ceviriniz
        int population=700000;
        System.out.println(population);
        float populationFloat=population;
        System.out.println(populationFloat);
        //double data type i short data type a ceviriniz.
        double price=234.3948754893;
        System.out.println(price);
        short priceShort=(short)price;
        System.out.println(priceShort);

        //Dikkat!
        short num=260;
        System.out.println(num);
        byte numByte=(byte)num;
        System.out.println(numByte);//byte *128 ile +127 arasinda toplam 256 tane sayi var.
        //Eger short gibi 260 i byte yaparsan java 260 i 256 ya boler kalani cikti verir.
        short n=1023;
        System.out.println(n);
        byte nByte=(byte) n;
        System.out.println(nByte); //-1 cikar cunku 1023 u 256 ya bolerken bolume 3 degil 4 yazar.








    }//Main Body



}//Class body
