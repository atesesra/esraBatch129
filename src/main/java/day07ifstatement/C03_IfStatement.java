package day07ifstatement;

import java.util.Scanner;

public class C03_IfStatement {
    public static void main(String[] args) {

       /*
       Ikı tane String datnin birbirine esit olup olmadigini anlamak icin "==" degil equals() kullaniriz.
       i) equals()==> Buyuk kucuk haarf onemser.
       ii)equalsIgnoreCase() ==> Buyuk kucuk harf onemsemez.
        */

        //Kullanicidan gun isimlerini aliniz haftaici mi hafta sonumu oldugunu yazdiran kodu olusturunuz.

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir gun ismi giriniz");
        String gunIsmi = input.next();
        if (gunIsmi.equalsIgnoreCase("Cumartesi") || gunIsmi.equalsIgnoreCase("Pazar")) {
            System.out.println("Haftasonu");
        } else if (gunIsmi.equalsIgnoreCase("Pazartesi") ||
                gunIsmi.equalsIgnoreCase("Sali") ||
                gunIsmi.equalsIgnoreCase("Carsamba") ||
                gunIsmi.equalsIgnoreCase("Persembe") ||
                gunIsmi.equalsIgnoreCase("Cuma")) {
            System.out.println("Hafta ici");

        } else {
            System.out.println("Gecerli bir gun ismi giriniz");
        }//else body

            //2.Yol
            boolean haftaici= (gunIsmi.equalsIgnoreCase("Pazartesi") ||
                    gunIsmi.equalsIgnoreCase("Sali") ||
                    gunIsmi.equalsIgnoreCase("Carsamba") ||
                    gunIsmi.equalsIgnoreCase("Persembe") ||
                    gunIsmi.equalsIgnoreCase("Cuma"));
            boolean haftasonu=(gunIsmi.equalsIgnoreCase("Cumartesi") || gunIsmi.equalsIgnoreCase("Pazar"));
            if (haftaici){
                System.out.println("Hafta ici");
            } else if (haftasonu) {
                System.out.println("Hafta sonu");
            }else{
                System.out.println("Gecerli bir gun ismi giriniz");
            }














        }
    }
