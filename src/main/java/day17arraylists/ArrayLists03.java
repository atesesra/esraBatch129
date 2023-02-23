package day17arraylists;

import java.util.ArrayList;
import java.util.List;

public class ArrayLists03 {
    public static void main(String[] args) {
        List<String> cities=new ArrayList<>();
        cities.add("Miami");
        cities.add("Istanbul");
        cities.add("Kayseri");
        cities.add("Almaty");
        cities.add("Kayseri");
        System.out.println(cities);

        //remove() methodu index ile kullanilirsa indexteki elemani siler.
        //remove() methodu index ile lullanilirsa size sildigi elemani verir
        String n=cities.remove(1);
        System.out.println(n); //Istanbul
        System.out.println(cities);

        //remove() methodu eleman ile kullanilirsa ilk gorunumu siler.
        //remove() methodu eleman ile kullanilirsa size o elemani silip silmedigini ifade eden true ya da false verir.
        //Eger eleman Listte var ise o elemani siler ve size true der
        //Eger eleman Listte yok ise o elemani silemediginden ve size false der.
        boolean p=cities.remove("Kayseri");
        System.out.println(cities);



    }
}
