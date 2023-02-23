package advanced_practice.practice01;

import java.util.Scanner;

public class Q02_Veriable_Hipotenus {
    public static void main(String[] args) {

     //Hipotenus hesaplayan kodu yaziniz

        Scanner input=new Scanner(System.in);
        System.out.println("Lutfen ucgenin dik kenar degerlerini giriniz");
        int a=input.nextInt();
        int b=input.nextInt();

        double c=Math.sqrt(a*a+b*b);
        System.out.println(c);






    }
}
