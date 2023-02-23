package day19listsvarargs;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class C02_Lists {
    public static void main(String[] args) {
        /*  Rastgele kullanici adi olusturan JAVA kodu yaziniz.
         *  1. Kullanicidan ismini isteyelim
         *  2. Kullanici adindaki bastaki ve sondaki bosluklari silelim.
         *  3. Kullanici adinin alinabilir olup olmadigina bakalim.
         *  4. Eger bizim listemizde oyle bir kullanici adi yoksa kullanici adi, kullanicinin girdigi isim olsun.
         *  5. Eger bu kullanici adi zaten varsa, sonuna rastgele sayi olusturup ekleyelim, ve gosterelim.
         */

        List<String> databaseIsim=new ArrayList<>();
        databaseIsim.add("AYSE");
        databaseIsim.add("AHMET");
        databaseIsim.add("SERDAR");
        databaseIsim.add("OKAN");
        databaseIsim.add("BETUL");
        System.out.println("databaseIsim = " + databaseIsim);

        Scanner input=new Scanner(System.in);
        System.out.println("Lutfen kullanici adinizi giriniz");
        String username=input.nextLine().toUpperCase().trim(); //1 ve 2 adim yapildi

        //3.Adimda kullanici adinin kullanilabilir olup olmadigini database ile kiyasliyoruz
        if(databaseIsim.contains(username)){
            System.out.println("Bu kullanici adi zaten alinmis ");
        }else{
            System.out.println("Bu kullanici adini kullanabilirsiniz");
        }
        if (databaseIsim.contains(username)){
            int rastgeleSayi=new Random().nextInt(100);

            username=username+""+rastgeleSayi;
            System.out.println("Yeni kullanici adi olarak bunu kullanabilisiniz"+username);


        }else System.out.println("Yeni kullanici adi"+username);







    }
}
