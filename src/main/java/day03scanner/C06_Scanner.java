package day03scanner;

import java.util.Scanner;

public class C06_Scanner {
    public static void main(String[] args) {


   //Kullanicidan aldiginiz sekil ile asagidaki gibi bir gorsel olusturunuz.
   /*
             A
            A A
           A A A
    */
        Scanner input=new Scanner(System.in);
        System.out.println("Lutfen bir karakter giriniz.");
        char ch=input.next().charAt(0);
        System.out.println("  "+ch+"  ");
        System.out.println(" "+ch+" "+ch+" ");
        System.out.println(ch+" "+ch+" "+ch);


        // Kisayol  \n alt satira atar  \t bir tab bosluk birakir  ctrl+alt+l classi duzenler
        // \b gerisindeki ilk harfi siler







    }
}
