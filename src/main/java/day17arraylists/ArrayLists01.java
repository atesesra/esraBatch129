package day17arraylists;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ArrayLists01 {
    /*
    1) ArrayList(List)'ler coklu data depolamak icin kullanilir.
     2) ArrayList(List)'ler non-primitive data type'inda ki coklu datalari depolamak icin kullanilir.
        List'ler "non-primitive" data kabul ederler, "Array" ler ise "primitive" data veya reference kabul eder.
     3) ArrayList(List)'leri olustururken icine koyacaginiz eleman sayisini basta soylemeye gerek yoktur.
        List'ler eleman sayisinda "flexible" dirlar ama "Array"ler "flexible" degildirler.
     4) Madem "Array" ler eleman sayisinda flexible degil nicin Java "Array" leri iptal etmedi?
          i) Eleman sayisi belli olan data'lari depolamak icin Array'ler tercih edilir.
          ii) Array'ler cok hizli calisir.
          iii) Array'ler memory'de cok az yer kaplar.

     */
    public static void main(String[] args) {

        //List nasil olusturulur?
        ArrayList<Integer>ages=new ArrayList<>();
        System.out.println(ages);

        //Listlere eleman nasil eklenir?
        //Liste eleman eklemek icin add methodunu kullaniriz.
        //add() methodu elemanlari sizin verdiginiz sirada liste ekler.
        ages.add(12);
        ages.add(9);
        ages.add(10);
        ages.add(888);

        ages.add(1,656);
        ages.add(3,777);
        System.out.println(ages);//[9,656,12,777,10,888]

        //Liste coklu eleman nasil eklenir? ve ya liste baska bi list nasil eklenir?
        //Bir liste coklu eleman eklemek, o elemanlari once bir listin icine koymalisiniz.
        ArrayList<Integer> newAges=new ArrayList<>();
        newAges.add(8);
        newAges.add(9);
        newAges.add(10);
        ages.addAll(newAges);
        ages.addAll(2,newAges);
        System.out.println(ages);
        // Bir listteki tum elemanlari nasil silebilirim
 //       ages.clear();
 //       System.out.println(ages);

        //Bir elemanin listte var olup olmadigini nasil kontol ederiz.
        boolean r=ages.contains(656);
        System.out.println(r);
        //Bir Listin baska bir List ile ayni olup olmadigini nasil kontol ederiz?
        //Iki listin esit olablmesi icin ayni indexte ayni elemanlar olmali.
        ArrayList<String> names1=new ArrayList<>();
        names1.add("Tom");
        names1.add("Jim");
        names1.add("Kim");

        ArrayList<String> names2=new ArrayList<>();
        names2.add("Tom");
        names2.add("Kim");
        names2.add("Jim");

        boolean s=names1.equals(names2);
        System.out.println(s);
        //Example 1:Verilen iki Integer Listte tamamiyla aynı elemanlarin olup olmadigni kontol eden kodu yaziniz.
        ArrayList<Integer>nums1=new ArrayList<>();
        nums1.add(8);
        nums1.add(7);
        nums1.add(9);

        ArrayList<Integer>nums2=new ArrayList<>();
        nums2.add(8);
        nums2.add(9);
        nums2.add(10);
        Collections.sort(nums1);
        Collections.sort(nums2);

        boolean t=nums1.equals(nums2);
        System.out.println(t);

    }
}