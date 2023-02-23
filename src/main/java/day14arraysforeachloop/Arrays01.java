package day14arraysforeachloop;

import java.util.Arrays;

public class Arrays01 {
    public static void main(String[] args) {
      //Ex1) String array olusturun icine 5 tane eleman ekleyin
        // ilk eleman ile son elemanin icerdigi karakter sayilari toplamini ekrana yazdirirn.
        String arr[]=new String[5];
        arr[0]="Math";
        arr[1]="Science";
        arr[2]="Music";
        arr[3]="English";
        arr[4]="Art";
        System.out.println(Arrays.toString(arr));
        System.out.println(arr[0].length()+arr[arr.length-1].length());

        //Ex2) String array olusturun icine 5 tane eleman ekleyin
        // tum elemanlarin icerdigi karakte syilari toplamini ekrana yazdirin.

        String brr[]=new String[5];
        brr[0]="Miami";
        brr[1]="Istanbul";
        brr[2]="Frankfurt";
        brr[3]="Dhaka";
        brr[4]="Athena";

        int totalChar=0;

        for (int i = 0; i < brr.length; i++) {
            totalChar=totalChar +brr[i].length();

        }
        System.out.println(totalChar);
        //2.Yol For each loop ( enhanced loop)==>baslangic degeri, loopun calisma sarti ve increment/decrement kismini kendisi halleder.
        // for each loop Arreylerde ve Colectionlarda kullanilir.
        //Index kullanmaniz gerektiginde bazen for each loop caresiz kalir mecburen diger looplari kullaniriz.
        int sum=0;
        for (String w: brr) {
            sum=sum+w.length();

        }
        System.out.println(sum);




    }
}
