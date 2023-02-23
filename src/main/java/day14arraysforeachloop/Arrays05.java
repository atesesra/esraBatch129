package day14arraysforeachloop;

import java.util.Arrays;

public class Arrays05 {
    public static void main(String[] args) {

        //Note: sort() methodu sayisal data type larini kucukten buyuge siralar (ascending order)
        //Note: sort() methodu String data type larini alfabetik siralar (alphabetical order)
        //Note:ascending order+alphabetical order==> Natural Order
        //Note:sort() methodu array elemanlarini "NAtural order"a gore siralar.

        //Note:binarySearch() methodu bir elemanin bir array de olup olmadigini kontrol etmek icin kullanilir.
        // binarySearch methodunu kullanmadan once sort() methodunu kullaniriz.
        String colors[] = new String[6];
        colors[0] = "Red";
        colors[1] = "Orange";
        colors[2] = "Blue";
        colors[3] = "Yellow";
        colors[4] = "Green";
        colors[5] = "Brown";

        Arrays.sort(colors);
        System.out.println(Arrays.toString(colors));
        int num1=Arrays.binarySearch(colors,"Blue");
        System.out.println(num1);
        int num2=Arrays.binarySearch(colors,"Orange");
        System.out.println(num2);
        int num3=Arrays.binarySearch(colors,"Tarik");
        System.out.println(num3);  //-6 ==> "-" bu eleman yok demek olsaydi 6.eleman olurdu


    }
}
