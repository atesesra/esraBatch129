package ssStringManipulation;

import java.util.Scanner;

public class C01_StringManipulation {
    public static void main(String[] args) {
        /*
        Kullanicidan email girmesini isteyin;
        @gmail icermiyorsa Lutfen gmail adresi giriniz
        @gmail.com ile bitiyorsa Email adresiniz kaydedildi
        @gmail.com ile bitmiyorsa lutfen yazimi kontol edin yazdirin.

         */
        Scanner input=new Scanner(System.in);
        System.out.println("Lutfen gmail adresinizi giriniz");
        String mail= input.nextLine();
        if (mail.contains("@gmail")){
            System.out.println("Lutfen gmail adresi giriniz");

        }else if (mail.lastIndexOf("@gmail.com")==(mail.length()-10)){
            System.out.println("Email adresi kaydedildi");

        }else {
            System.out.println("Lutfen yazimi kontrol ediniz");
        }






    }
}
