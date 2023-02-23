package day18arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayList01 {
    public static void main(String[] args) {


        //ArrayList nasil olusturulur?

        List<Integer> nums = new ArrayList<>();

        //ArrayListler nasi yazdirilir?
        System.out.println(nums); //[] yazdirir cunku daha eleman yuklemedim

        nums.add(37);
        nums.add(38);
        nums.add(39);
        nums.add(40);
        nums.add(41);
        nums.add(42);
        System.out.println("nums = " + nums);

        //List in bos olup olmadigini nasil anlariz?
        boolean bosmu1 = nums.isEmpty();
        System.out.println("bosmu1 = " + bosmu1);

        List<Integer> ages = new ArrayList<>();
        boolean bosmu2 = ages.isEmpty();
        System.out.println("bosmu2 = " + bosmu2);

        //Example 1: nums ArrayList'indeki tum tek sayilari 11
        // artirdiktan sonra ekrana yazdiriniz
        //nums = [37, 38, 39, 40, 41, 42]
        for (int w : nums) {
            if (w % 2 != 0) {
                nums.set(nums.indexOf(w), w + 11);
            }
        }
        System.out.println("nums = " + nums); //nums = [48, 38, 50, 40, 52, 42]

        nums.add(52);
        nums.add(36);
        nums.add(52);

        //Listlerden elema nnasil silinir?

        //Ex:nums Arraylistinden 52 rakaminin gorunumu siliniz.

        System.out.println("nums = " + nums); //nums = [48, 38, 50, 40, 52, 42, 52, 36, 52]

        // nums.remove(52);
        //System.out.println("nums = " + nums);
       /*
       remove() methodunun icerisine tamsayi yazarsaniz;
       Java bunu indeks kabul eder.Silinecek eleman olarak algilamaz.
       Tum tamsayilar aksi belirtilmedigi surece primitive int 'tir.
       Primitive Data Type'lari da ArrayLst'lerin elemani olamazlar.
       Primitive Data Type'larini Wrapper class'a cevirmeliyiz

 */
        Integer sayi = 52;
        nums.remove(sayi);
        System.out.println("nums = " + nums); // İlk gordugu 52 yi sildi.

        List<String> names = new ArrayList<>();
        names.add("Tom");
        names.add("Thomas");
        names.add("Tahsin");
        names.add("Trump");
        names.add("Taceddin");
        System.out.println("names = " + names);

        List<String> emekliOlacaklar = new ArrayList<>();
        emekliOlacaklar.add("Thomas");
        emekliOlacaklar.add("Tahsin");
        emekliOlacaklar.add("Trump");
        names.removeAll(emekliOlacaklar);

        System.out.println("emekliOlacaklar = " + emekliOlacaklar);//emekliOlacaklar = [Thomas, Tahsin, Trump]
        System.out.println("names = " + names);  //names = [Tom, Taceddin]

        List<String> a = new ArrayList<>();
        a.add("Shoes");
        a.add("TV");
        a.add("Radio");
        a.add("Laptop");
        a.add("Shoes");
        a.add("Book");
        a.add("Shoes");
        System.out.println("a = " + a);
        a.remove("Shoes");
        System.out.println("a = " + a);

        /* String x="Shoes";
        a.remove(x);
        System.out.println("a = " + a); Ben boyle yapmistim

         */

        //Listimizde coklu datanin olup olmadigini nasil gosteririz?
        //containsAll() : Bir listin icinde coklu elemanin olup olmadigini kontrol eder
        // Hepsi varsa true; en az bir tanesi yoksa false verir.

        List<String> myNames=new ArrayList<>();
        myNames.add("Burcu");
        myNames.add("Can");
        myNames.add("Zisan");
        myNames.add("Emre");
        myNames.add("Bilal");
        myNames.add("Gul");
        System.out.println("myNames = " + myNames);
        List<String >varMi=new ArrayList<>();
        varMi.add("Burcu");
        varMi.add("Gul");
        varMi.add("Can");

        boolean sonuc=myNames.containsAll(varMi);
        System.out.println("sonuc = " + sonuc);












    }
}
