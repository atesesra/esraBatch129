package day05typecastingstringmanipulations;

import java.util.Scanner;

public class StringManipulations03 {
    public static void main(String[] args) {

      /*
      Ex1:Asagidaki kurallara gore kullanicinin girdigi password'u kontrol ediniz.
             1.En az 8 character olsun.
             2.Space character password de olmasin
             3.En az bir tane buyuk harf olsun.
             4.En az bir tane kucuk harf olsun
             5.En az bir tane sembol olsun
             6.En az bir tane rakam olsun

       */
        Scanner input= new Scanner(System.in);
        System.out.println("Lutfen passwordunuzu giriniz");
        String pwd=input.nextLine();

        boolean first=pwd.length()>7;
        System.out.println(first);
        boolean second=!pwd.contains(" ");
        System.out.println(second);
        //En az bir tane buyuk harf olsun.Buyuk harf olmayanlari sil kalan karakter sayisina bak.
        // karakter sayisi o ise buyuk harf yok demektir.sifirdan buyuk ise buyuk harf var demektir.
        boolean third=pwd.replaceAll("[^A-Z]","").length()>0;
        System.out.println(third);
        boolean fourth=pwd.replaceAll("[^a-z]","").length()>0;
        System.out.println(fourth);
        boolean fifth=pwd.replaceAll("[a-zA-Z0-9]","").length()>0;
        System.out.println(fifth);
        boolean sixth=pwd.replaceAll("[^0-9]","").length()>0;
        System.out.println(sixth);

        System.out.println("Password gecerli mi? " + (first && second && third && fourth && fifth && sixth));






    }
}
