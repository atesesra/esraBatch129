package day15arrays;

import java.util.Arrays;
import java.util.Comparator;

public class C05_Arrays {
    public static void main(String[] args) {
      //Arama motorunda "guzel isimler" adli bir application icin simleri kucukten buyuge siralayan kodu yaziniz.

        String arr[]={"Abdurrahman","Emre","Akin","Arda","Yunus","Ali","Mehmet","Can","Veli"};
        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr, Comparator.comparingInt(String::length));
        System.out.println(Arrays.toString(arr));

        //String array elemanlarini karakter sayisina gore ve
        // ayni karakter sayisinda ise natural order(alfabetik sira) a gore
        // ve tersten buyukten kucuge siralayiniz.

        String brr[]={"Abdurrahman","Emre","Akin","Arda","Yunus","Ali","Mehmet","Can","Veli"};
        Arrays.sort(   brr, Comparator.comparingInt(String::length).reversed().thenComparing(Comparator.naturalOrder()));
        System.out.println(Arrays.toString(brr));










    }
}
