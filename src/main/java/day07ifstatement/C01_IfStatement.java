package day07ifstatement;

import java.util.Scanner;

public class C01_IfStatement {
    public static void main(String[] args) {


       //If it rains, I will cancel the picnic.
       //Ex 1) Verilen karakter buyuk harf ise ekrana "Buyuk Harf" yazdiran kodu olusturunuz.

        char ch='S';
        if (ch>='A'&&ch<='Z'){
            System.out.println("Buyuk Harf");
        }
        //Ex2) Verilen bir sayi cift sayi ise ekrana cift sayi yazdiran kodu lusturunuz.

        int sayi=20;
        if (sayi % 2 ==0){
            System.out.println("Cift Sayi");
        }
        //Ex3) Verilen bir sayi 300 den kucuk ve ya 1200 den buyuk ise ekrana "Harika Sayi" yazdiran kodu olusturunuz.

        int sayi2=1450;
        if (sayi2<300 || sayi2>1200){
            System.out.println("Harika Sayi");
        }
        //Ex4)Kullanicidan alinan sayinin tek mi cift mi oldugunu yazdiran kodu olusturunuz.
        //1.Yol Burada iki kontrol yaildi.
        Scanner input=new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        int num =input.nextInt();
        if (num%2==0){
            System.out.println("Cift Sayi");
        }
        if (num%2!=0){
            System.out.println("Tek Sayi");
        }
        //2.Yol
        if (num%2==0){
            System.out.println("Cift Sayi");
        }else{
            System.out.println("Tek Sayi");
        }
        //Ex5) Verilen bir sayinin negatif,pozitif ya da notr oldugunu soyleyen kodu yaziniz.
        int numara=105;

        if (numara<0){
            System.out.println("Negatif Sayi");
        } else if (numara==0) {
            System.out.println("Notr Sayi");

        }else{
            System.out.println("Pozitif Sayi");
        }


    }//MB
}//CB
