package practiceDTNT.practice.practice06;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class HacimRunner {
    public static void main(String[] args) {

        KarePrizma karePrizma=new KarePrizma();
        double karePrizmaHacmi=karePrizma.hacimHesapla(5,6);
        System.out.println("karePrizmaHacmi = " + karePrizmaHacmi);

        NumberFormat obj=new DecimalFormat(".00");
        Koni koni=new Koni();
        double koniHacmi=koni.hacimHesapla(3,5);
        System.out.println("koniHacmi = " + obj.format(koniHacmi));
        /*
        Number format classindan bir obje olusturup DecimalFormat(".00")
        yazdigimizda virgulden sonra iki basamak yazdirir.(".000") uc basamak yazdirir.
         */

        Silindir esra=new Silindir();
        double silindirHacmi= esra.hacimHesapla(1,5);
        System.out.println("silindirHacmi = " + obj.format(silindirHacmi));





    }
}
