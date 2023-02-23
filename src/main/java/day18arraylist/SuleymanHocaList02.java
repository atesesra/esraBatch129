package day18arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SuleymanHocaList02 {
    public static void main(String[] args) {

     //Ex 1.Bir tane Integer List olusturunuz.
     //Bu List'te birbirine en yakin iki tamsayiyi yaziniz.
        //INTERWIEV SORUSU [12.23.9.11.35] ==> 11,12
        List<Integer>nums=new ArrayList<>();

        nums.add(12);
        nums.add(13);
        nums.add(9);
        nums.add(11);

        Collections.sort(nums);

        System.out.println("nums = " + nums); // nums = [9, 11, 12, 23, 35]

        int minDiff=nums.get(1)-nums.get(0);

        for (int i = 1; i < nums.size(); i++) {

            minDiff= Math.min(minDiff, nums.get(i)-nums.get(i-1));

        }
        System.out.println("minDiff = " + minDiff);


        for (int i = 1; i <nums.size() ; i++) {
         if (nums.get(i)-nums.get(i-1)==minDiff){
             System.out.println(nums.get(i-1) +" and " + nums.get(i));
         }
        }





    }
}
