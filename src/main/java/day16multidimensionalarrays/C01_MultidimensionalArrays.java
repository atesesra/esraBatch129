package day16multidimensionalarrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class C01_MultidimensionalArrays {
    public static void main(String[] args) {

        /*
        Bir Array in icindeki data yine bir Array ise buna multidimensional Array denir.
         */

        //Multidimensional Array nasil olusturulur?

        int arr[][]=new int[3][2]; //auter array==>3 inner array==>2 olan bir multidimensional array olusturduk.
        // Bu yontemle inner arryler sabit olmak zorunda.
        System.out.println(Arrays.toString(arr));  //[[I@19dfb72a, [I@17c68925, [I@7e0ea639]

        //Icindeki data non-primitive oldugu icin adresleri gorurum.
        System.out.println(Arrays.toString(arr[1]));  //[0, 0]
        System.out.println(Arrays.toString(arr[2]));  //[0, 0]
        System.out.println(Arrays.deepToString(arr)); //[[0, 0], [0, 0], [0, 0]] MULTIDIMENSION ARRAYLER BOYLE YAZDIRILIR

        //Arraylere eleman eklemenin 2.yontemi ile hem declare edip hemde deger atama yontemi

        int arr2 [][]={  {2,3}, {9}, {78,6,4,5}  };
        System.out.println("Hem declare hem deger atamasi ile" +Arrays.deepToString(arr2));
        System.out.println("Hem declare hem deger atamasi ile" +Arrays.toString(arr2[2])); //deep to string icine
        // [2] yazip cagirmaya izin vermiyor o yuzden to string yapmak lazim.
        //Multidimensional Arraylere eleman nasil eklenir?

        arr [1][0]=6;
        arr [0][0]=3;
        arr [0][1]=-4;
        arr [1][1]=18;
        arr [2][0]=-7;
        arr [2][1]=0;
        System.out.println(Arrays.deepToString(arr));
        System.out.println(arr[1][0]);//6

        //Ex: String bir multidimensonal Array olusturunuz
        // icerisine datalari ekleyin
        //toplam eleman sayisini yazdirin
        String brr[][]=new String [3][2];
        brr[0][0]="a";
        brr[0][1]="b";
        brr[1][0]="c";
        brr[1][1]="d";
        brr[2][0]="e";
        brr[2][1]="f";
        System.out.println(Arrays.deepToString(brr));


        int sum=0; //toplam kac daire oldugu bilgisi burada
        for (String[] w:brr){
            sum=sum+w.length;
        }
        System.out.println(sum);









    }
}
