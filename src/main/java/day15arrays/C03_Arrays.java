package day15arrays;

import java.util.Arrays;

public class C03_Arrays {
    public static void main(String[] args) {

        //Interview Questions
        //[0,2,3,0,12,0] sifirleri en sona koyunuz.

        int original []={0,2,3,0,12,0};
        int yeni[]=new int[original.length]; // bunu yazdirirsam su an [0,0,0,0,0,0] gorurum

        int idx=0;
        for (int i = 0; i < original.length;   i++) { //orjinal array icin calisti

            if (original[i]!=0){
                yeni[idx]=original[i];


                idx++; //bir sonraki indexe gecer


            }

        }

        System.out.println(Arrays.toString(yeni));



    }
}
