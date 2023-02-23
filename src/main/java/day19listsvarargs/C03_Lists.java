package day19listsvarargs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C03_Lists {
    public static void main(String[] args) {

        //SAYİ TAHMİN OYUNU Oyuncudan 1-10 arasi bir sayi isteyiniz.
        // Elinizdeki listede oyuncunun tahmin ettigi sayi varsa "BINGO" yazdiriniz.
        // Yoksa verdigi sayiyi listenize ekleyiniz.
        // Ilk "BIngo" yu tmamlayana " KAZANDINIZ" yazdiriniz. [5,8,2,9]

        Scanner input= new Scanner(System.in);
        List<String> c = new ArrayList<>();
        c.add("5");
        c.add("8");
        c.add("2");
        c.add("9");
        System.out.println("c = " + c);
        String sayi ="";
        int counter=0;

        do {
            System.out.println("Lutfen 1-10 arasinda bir sayi giriniz");
            sayi= input.next().substring(0,1);

            if(c.contains(sayi)){
                c.set(c.indexOf(sayi),"BINGO");
                counter++;

            }else if(!sayi.equals("Q")){
                c.add(sayi);
            }
            System.out.println(c);

        }while (!(counter==4));
        System.out.println("KAZANDINIZ");









    }
}
