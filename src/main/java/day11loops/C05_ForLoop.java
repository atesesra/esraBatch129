package day11loops;

import java.util.Scanner;

public class C05_ForLoop {
    public static void main(String[] args) {

      //5 ten 10 a kadar tam sayilarin toplamini bulan kodu yazinz.
        int sum=0;

        for (int i = 5; i <11 ; i++) {
            sum=sum+i;


        }
        System.out.println(sum);

        // 6 dan 3 e kdar tamsayilarin carpimi

        int carp=1;
        for (int i = 6; i >2 ; i--) {
            carp=carp*i;

        } System.out.println(carp);

        //Bir rakamlarinn tamsayinin toplamini yazan kodu olusturunuz.

        //2543==>

        Scanner input=new Scanner(System.in);
        System.out.println("Lutfen bir tamsayi giriniz");
        int num=input.nextInt();
        num=Math.abs(num);
        int sonuc=0;
        for (int i=num;i>0;     i=i/10){
            sonuc=sonuc+i%10;
        } System.out.println(sonuc);










    }
}
