package day08nestedif;

import java.util.Scanner;

public class C03_NestedIf {
    /*
    Kullanicidan 0 dan kucuk 120 den buyuk deger giremeyecek sekilde datalari aldiktan sonra
    Eger calisan kadinsa 60 yasindan buyukse emekli olabilir yazdirin
    Eger calisan erkekse 65 yasindan buyukse emekli olabilir yazdiran kodu olusturunuz.
    */

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Lutfen cinsiyetinizi giriniz \nKadin icin K harfi \nErkek icin E harfi");
        char cinsiyet=input.next().toUpperCase().charAt(0);

        System.out.println("Lutfen yasinizi giriniz");
        int yas=input.nextInt();

        if (cinsiyet=='K'){
            if (yas<0 || yas>120){
                System.out.println("Lutfen girdiginiz yas degerini kontrol ediniz");
            } else if (yas>60) {
                System.out.println("Emekli olabilirsin");
            }else {
                System.out.println("Emekli olamazsın"+"K"+ (60-yas) +"yil daha calisman gerekir");
            }

        } else if (cinsiyet=='E') {
            if (yas<0 || yas>120){
                System.out.println("Lutfen girdiginiz yas degerini kontrol ediniz");
            } else if (yas>65) {
                System.out.println("Emekli olabilirsin");
            }else {
                System.out.println("Emekli olamazsın"+"E"+ (65-yas) +"yil daha calisman gerekir");
            }

        }else{
            System.out.println("Lutfen cinsiyet icin gecerli bir harf giriniz");
        }


    }//MB

}//CB
