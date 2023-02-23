package ssStringManipulation;

import java.util.Scanner;

public class C02_StringManipulation {
    public static void main(String[] args) {

        /*
        Cumle "buyuk" kelimesi iceriyorsa tum cumleyi buyuk harf olarak,
      "kucuk" kelimesi iceriyorsa tum cumleyi kucuk harf olarak yazdirin,
       iki kelimeyi de icermiyorsa "Cumle kucuk yada buyuk kelimesi icermiyor"
       iki kelimeyi de iceriyorsa karar ver buyuk mu yazdirayim, kucuk mu? yazdirin
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir cumle giriniz");
        String cumle=scan.nextLine();
        cumle=cumle.toLowerCase();

        if (cumle.contains("buyuk")){
            System.out.println(cumle.toUpperCase());
        } else if (cumle.contains("kucuk")) {
            System.out.println(cumle.toLowerCase());

        }else if(cumle.contains("buyuk") &&cumle.contains("kucuk")){
            System.out.println("Karar ver buyuk mu yazdirayim, kucuk mu?");
        }else System.out.println("Cumle kucuk ya da buyuk kelimesi icermiyor");

    }
}
