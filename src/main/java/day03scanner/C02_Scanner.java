package day03scanner;

import java.util.Scanner;

public class C02_Scanner {
    //Scanner classi kullanici ile etkilesim kurmamizi saglar.
    //Scanner bir Class'tir.Jva util kutuphanesinden getirildigi icin import(ice aktarma) ister.


    public static void main(String[] args) {

        //Kullanicidan Data Almak İcin
        //1.Adim Scanner Classindan obje olusturun.
        Scanner input = new Scanner(System.in);


        //2.Adim Kullaniciya ne yapacagini soyle.
        System.out.println("Lutfen yasinizi giriniz");

        //3.Adim Kullanicidan aldiginiz datayi veiable icine koyun
        byte age = input.nextByte();

        //Kullaniciya ad,memleket,yas,boy, yasadigi yeri sevim sevmedigini soran bir program yaziniz.

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen isminizi giriniz...");
        String isim=scan.nextLine();//Kullanicidan String bir deger istedik tum satırı alması icin nextLine sectik.
        System.out.println("Lutfen memleketinizi giriniz...");
        String memleket=scan.nextLine();
        System.out.println("Lutfen yasinizi giriniz...");
        int yas=scan.nextInt();
        System.out.println("Lutfen boyunuzu giriniz...");
        short boy= scan.nextShort();
        System.out.println("Lutfen yasadiginiz yeri sevip sevmediginizi yaziniz...");
        boolean seviyorMu=scan.nextBoolean();

        System.out.println("***********");
        System.out.println("isim = " + isim);
        System.out.println("memleket = " + memleket);
        System.out.println("yas = " + yas);
        System.out.println("boy = " + boy);
        System.out.println("seviyorMu = " + seviyorMu);









    }//main body


}//Class body
