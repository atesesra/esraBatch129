package day18arraylist;

import java.util.ArrayList;
import java.util.List;

public class SuleymanHocaList01 {
    public static void main(String[] args) {

       //Ex1.Integer bir list olusturunuz,Liste 5 eleman ekleyiniz,Bu elemanlardan 12'yi siliniz.

        List<Integer> ages=new ArrayList<>();
        ages.add(10);
        ages.add(25);
        ages.add(12);
        ages.add(8);
        ages.add(12);
        System.out.println("ages = " + ages);

        Integer a=12; //   2.yol   ages.remove((Integer)12); direk bu da yazilir.
                      //   3.yol   ages.remove(Integer.valueOf(12));
                      //   4.yol   ages.remove(ages.indexOf(12));
        ages.remove(a);
        System.out.println("ages = " + ages);


        //Ex2.Tum 12 leri silelim

        List<Integer> nums=new ArrayList<>();
        nums.add(10);
        nums.add(25);
        nums.add(12);
        nums.add(8);
        nums.add(12);
        System.out.println("nums = " + nums);

        List<Integer> silinecekler=new ArrayList<>();
        silinecekler.add(12);

        nums.removeAll(silinecekler);
        System.out.println("nums = " + nums);





    }
}
