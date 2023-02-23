package day08nestedif;

import java.util.Scanner;

public class C05_Ternary {
    //Kullanicidan bir sayi alin ve mutlak degerini yazdirin

    public static void main(String[] args) {

      Scanner input=new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        int sayi=input.nextInt();


        System.out.println(sayi<=0  ?   -1*sayi   : sayi);
        //Kullanicidan bir sayi aliniz poztifse pozitif negatifse negatif yazdiriniz.

        System.out.println("Lutfen bir sayi giriniz");
        int number= input.nextInt();


        String sonuc=(number>=0 ? "Sayi pozitif"  :  "Sayi negatif");

        ////Kullanicidan bir sayi aliniz Pozitifse Pozitif Negatifse sayinin karesini yazdirin







    }


}
