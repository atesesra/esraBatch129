package day06stringmanipulationsifstatement;

import java.util.Scanner;

public class StringManipulations01 {
    public static void main(String[] args) {
        //Ex1: Bir Stringin bas ve sonunda space character varsa siliniz.
        //       "   Ali Can   " ==> "Ali Can"

        String s="   Ali Can  ";
        System.out.println(s);
        //Note:Trim methodu bir Stringin bas ve sonundaki space karakterlerini siler aradaki spacelere dokunmaz.
        String sTrimmed=s.trim();
        System.out.println(sTrimmed);

        //Ex2: Asagida fiyatlari verilen urunlerin toplam fiyatini bulunuz.
        //     String tv="$456.99" ;  String laptop="$875.99"; ==>456.99+875.99=1332.98
        String tv1="$456.99";
        String laptop1="$875.99";
        String tv2=tv1.replace("$","");
        System.out.println(tv2);
        String laptop2=laptop1.replace("$","");
        System.out.println(laptop2);
        Double totalPrice=Double.valueOf(tv2)+Double.valueOf(laptop2);
        System.out.println(totalPrice);

        //Ex3: Verilen ismin ilk isminin ilk harfini ve soy isminin ilk harfini ekrana yazdiriniz.
        //     "Ali Can" ==>AC
        String name ="   ali cAN  ";
        char first=name.trim().toUpperCase().charAt(0);
        System.out.println(first);
        char second=name.trim().toUpperCase().split(" ")[1].charAt(0);
        System.out.println(second);

        System.out.println(""+first+second);
        //Ex4: Bir String'in hic character icermedigini (Bos String) kontrol eden kodu yaziniz.
        String str="";
        //1.Yol:lenght() kullan
        boolean result1=str.length()==0;
        System.out.println("String bos mu?"+result1);
        //2.Yol:BUNU KULLAN.Java bir konuda method urettiyse bunu kullaniriz.
        boolean result2=str.isEmpty();
        System.out.println("String bos mu?"+result2);
        //Ex5: Bir String'in space haric hicbir character icermedigini kontrol eden kodu yaziniz.
        String t="     ";
        //1.Yol
        boolean result3=t.replace(" ","").length()==0;
        System.out.println("Sadece space mi var?"+result3);
        //2.Yol
        boolean result4=t.replace(" ","").isEmpty();
        System.out.println("Sadece space mi var?"+result4);
        //3.Yol
        //isBlank methodu sadece space iceren String'ler icin true verir, space disinda bir character icerirse false verir.
        //isBlank methodu bos Stringler icinde true verir.
        boolean result5=t.isBlank();
        System.out.println("Sadece space mi var?"+result5);

        //Ex6: Bir String'de a,e,i characterlerinin ilk gorunumlerinin indexleri toplamini ekrana yazdiriniz.
        //     "Java is easy to learn"==>
        String r="Java is easy to learn";
        int idxA=r.indexOf('a');
        System.out.println(idxA);

        int idxI=r.indexOf('i');
        System.out.println(idxI);

        int idxE=r.indexOf('e');
        System.out.println(idxE);
        System.out.println("Indexler toplami: "+(idxA+idxI+idxE));
        //Ex7: Bir String'de Java kelimesinin ilk kacinci indexde kullanildigini gosteren kodu yaziniz.
        //     "Ah Java vah Java sensiz olmuyor Java."

        String u="Ah Java vah Java sensiz olmuyor Java.";
        //indexOf("Java") kullaniminda siz "Java" kelimesninin ilk gorunumundeki ilk harfin(J nin) indexini almis olursunuz.
        int idxJava=u.indexOf("Java");
        System.out.println(idxJava);
        //indexOf() methodu olamayan character icin her zaman -1 verir.
        int idxOfXyz=u.indexOf("xyz");
        System.out.println(idxOfXyz);
        //Ex8:Bir String'de a,i,e chractelerinin "son" gorunumlerinin indexleri toplamini ekrana yazdiriniz.
        //       //        "Java is easy to learn" ==> 18+5+17=40
        String v="Java is easy to learn";
        int idxOfA=v.lastIndexOf('a');
        System.out.println(idxOfA);
        int idxOfI=v.lastIndexOf('i');
        System.out.println(idxOfI);
        int idxOfE=v.lastIndexOf('e');
        System.out.println(idxOfE);
        System.out.println("Son indexler toplamı "+(idxOfA+idxOfI+idxOfE));

        //Ex9:Bir Stringdeki tekrarsiz karakterleri ekrana yazdiriniz. (EBAY MULAKAT SORUSU)
        //    abbccdc==>ad
        String y="aac";

        char ch1=y.charAt(0);

        if (y.indexOf(ch1)==y.lastIndexOf(ch1)){
            System.out.println(ch1);
        }
        char ch2=y.charAt(1);
        if (y.indexOf(ch2)==y.lastIndexOf(ch2)){
            System.out.println(ch2);
        }
        char ch3=y.charAt(2);
        if (y.indexOf(ch3)==y.lastIndexOf(ch3)){
            System.out.println(ch3);
        }



        //Note:Bazi kodlarin bazi sartlara bagli olarak calismasi gerekir.
        //     Bazi kodlari bazi sartlara gore calistimak icin "if statement" kullanilir.
        //     If you study hard, you will learn Java.

        //Ex10:Sayi pozitif ise ekrana "pozitif" yazdirin.
        int num=12;
        if(num>0){
            System.out.println("Pozitif");
        }
        //Ex11:Sayi -1ile 10 arasinda ise ekrana "Rakam" yazdirin.
        int number=3;
        if (number>-1 && number<10){
            System.out.println("Rakam");
        }

        //Ex12: Sayi üc basamakli ise ekrana "Woow!" yazdirin.
        int n=123;
        n=Math.abs(n);
        if (n>99 && n<1000){
            System.out.println("Wooow!");

        }



    }
}
