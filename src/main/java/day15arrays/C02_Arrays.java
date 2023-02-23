package day15arrays;

import java.util.Arrays;

public class C02_Arrays {
    public static void main(String[] args) {
       //Bir stringdeki sesli harflerin sayisini bulan kodu yaziniz.
        //a-e-i-o-u-A-E-I-O-U
        String str="Java ogrenince para kazanmak ne kolay, ogrenmeyince nekadar zor";
        String harfler[]=str.split("");
        System.out.println(Arrays.toString(harfler));

        int counter=0;
        for (String w:harfler) {
            switch (w){
                case "a":
                case "e":
                case "o":
                case "u":
                case "i":
            }


        }








    }
}
