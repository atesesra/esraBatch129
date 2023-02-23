package day16multidimensionalarrays;

import java.util.Arrays;

public class C02_MultidimensionalArrays {
    public static void main(String[] args) {
        //Bir tane integer multidimensional array olusturunuz
        //Bu array'deki tum sayilarin toplamini veren kodu yaziniz.


        int arr[][] = {{2, 5, 1}, {32, 75}};
        int sum =0;
        System.out.println(Arrays.deepToString(arr));

        for (int[] w: arr ) {
            for (int k:  w) {
                sum=sum+k;

            }

        }
        System.out.println(sum);

        //Multidimensional Arrayi tek katlı Array Cevirme

        /*

        1)Once multidimensional array in eleman sayisini bulun.
        2)Yeni bir array almaliyim.
        Bu arrayin buyuklugu ilk multidimensional arrayin eleman sayisina esit buyuklukte olmali.

         */

        int brr[][]={{2,5,1} ,{32,75}}; //3+2=5 daire
        int toplam=0;
        System.out.println(Arrays.deepToString(brr));//[[2, 5, 1], [32, 75]]
        for (int[] w : brr) {//brr multidimensiional arrayin icinden her bir w arrayini al
            toplam=toplam+ w.length;
        }
        System.out.println(toplam);//5 burada yeni olusturacagimiz arrayin buyuklugunu belirledik

        int idx=0;
        int crr []=new int[toplam];

        for (int [] w : brr) {
            for (int k : w) {//w arrayinin icindeki her bir k degerini getir
                //yeni crr arrayinin icine idx'e gore yerlestir
                crr[idx]=k;
                idx++;
            }
        }
        System.out.println(Arrays.toString(crr));//[2, 5, 1, 32, 75]

    }
}