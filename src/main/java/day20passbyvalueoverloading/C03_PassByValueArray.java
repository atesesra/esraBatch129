package day20passbyvalueoverloading;

import java.util.Arrays;

public class C03_PassByValueArray {
    public static void main(String[] args) {
        int sayilar[]={3,4,5,6};
        elemanDegistir(sayilar);
        System.out.println("main icinde eleman degisince sayilar = " + Arrays.toString(sayilar));

        arrayDegistir(sayilar);
        System.out.println("main icinde array degistir = " + Arrays.toString(sayilar));


    }

    private static void arrayDegistir(int[] sayilar) {
        sayilar=new int[6];
        System.out.println("method icinde array degistir = " + Arrays.toString(sayilar));
    }

    private static void elemanDegistir(int[] sayilar) {
        sayilar[0]=10;
        System.out.println("method icinde eleman degisince sayilar = " + Arrays.toString(sayilar));
    }


}
