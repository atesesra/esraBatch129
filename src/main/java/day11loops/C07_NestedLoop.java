package day11loops;

import java.util.Scanner;

public class C07_NestedLoop {
    public static void main(String[] args) {

        /*
        Type code to print the following image on the console
        X X X X X
        X X X X X
        X X X X X
                */

        Scanner input=new Scanner(System.in);
        System.out.println("Lutfen bir satir ve sutun bilgisi giriniz");
        int satir=input.nextInt();
        int sutun=input.nextInt();

        for (int i = 0; i < satir; i++) {
            String str="";
            for (int j = 0; j < sutun; j++) {
                str=str+"X ";
            }
            System.out.println(str);
        }




    }
}
