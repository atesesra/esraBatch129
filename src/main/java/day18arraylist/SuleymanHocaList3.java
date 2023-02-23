package day18arraylist;

import java.util.ArrayList;
import java.util.List;

public class SuleymanHocaList3 {
    public static void main(String[] args) {

        //Bir Integer Listteki 7 haric tum elemanlarin degerini 3 arttiriniz.

        List<Integer> nums=new ArrayList<>();

        nums.add(12);
        nums.add(13);
        nums.add(7);
        nums.add(12);
        nums.add(11);

        //1.YOL
        // listlerde ilk tercihimiz for eachdir.
        // listte tekrarli eleman var ise set kullanirken  index kullandigimiz icin
        // indexin oldugu yerde for each yerine fori kullanmak daha risksiz olur

        for (Integer w : nums) {
            if (w==7){
                continue;
            }
            nums.set(nums.indexOf(w),w+3);

        }
        System.out.println("nums = " + nums);

        //2.YOL
        for (int i = 0; i < nums.size(); i++) {
            int element= nums.get(i);
            if (element==7){
                continue;
            }
            nums.set(i,element+3);
        }
        System.out.println("nums = " + nums);












    }
}
