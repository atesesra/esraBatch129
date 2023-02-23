package practiceDTNT.practice.practice01;

import java.util.Scanner;

public class C02_IfStatement {
    public static void main(String[] args) {

      /*
      Kullanicidan alacaginiz 2 sayiyi yine kullanicidan
      alacaginiz dort islemden biri ileisleme koyup yazdiriniz
       */
        Scanner input=new Scanner(System.in);
        System.out.println("Lutfen\n toplama yapmak icin 1,\n cikarma yapmak icin "+
                "2,\n carpma yapmak icin 3,\n bolme yapmak icin 4,\n giriniz");

        int islem= input.nextInt();

        System.out.println("Lutfen iki tane tam sayi giriniz");
        double num1= input.nextDouble();
        double num2= input.nextDouble();

        if (islem==1){
            System.out.println("Toplama islemi sonucu :"+ num1+"+"+num2+"="+(num1+num2));
        } else if (islem==2) {
            System.out.println("Cikarma islemi sonucu :"+ num1+"-"+num2+"="+(num1-num2));
        } else if (islem==3) {
            System.out.println("Carpma islemi sonucu :"+ num1+"*"+num2+"="+(num1*num2));
        } else if (islem==4) {
            System.out.println("Bolme islemi sonucu :"+ num1+"/"+num2+"="+(num1/num2));
        }else{
            System.out.println("Hatali secim yaptiniz tekrar deneyiniz");
        }



    }
}
