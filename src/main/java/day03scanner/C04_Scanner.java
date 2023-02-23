package day03scanner;

import java.util.Scanner;

public class C04_Scanner {
    public static void main(String[] args) {




        //Ex: Kullanicidan alacaginiz bes basamakli bir sayinin ilk iki ve son iki basamagindaki
        // rakamlari toplamini yazdiran kodu yaziniz
       Scanner input=new Scanner(System.in);
        System.out.println("Lutfen bes basamakli bir sayi giriniz");

        int num= input.nextInt();//123 45


        int ilkIkiRkm=num/1000;
        System.out.println("ilkIkiRkm==>"+ilkIkiRkm);

        int ilkIkiTop=(ilkIkiRkm %10)+(ilkIkiRkm/10);
        System.out.println("ilkIkiTop = " + ilkIkiTop);

        int sonIkiRkm=num %100;
        System.out.println("sonIkiRkm==>"+sonIkiRkm);

        int sonIkiTop=(sonIkiRkm %10)+(sonIkiRkm/10);
        System.out.println("sonIkiTop = " + sonIkiTop);

        System.out.println("sonIkiTop+ilkIkiTop = " + (sonIkiTop+ilkIkiTop));




    }


}
