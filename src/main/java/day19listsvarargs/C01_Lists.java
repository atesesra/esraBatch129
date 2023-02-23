package day19listsvarargs;

import java.util.ArrayList;
import java.util.List;

public class C01_Lists {
    public static void main(String[] args) {

        List<String> names=new ArrayList<>();
        names.add("Hakan");
        names.add("Yunus");
        names.add("Ayse");
        names.add("Zisan");
        names.add("Sevcan");
        names.add("Omer");

        List<String> males=new ArrayList<>();
        males.add("Hakan");
        males.add("Yumus");
        males.add("Ali");

        names.retainAll(males);
        System.out.println("names = " + names);
        System.out.println("males = " + males);

        List<String> sanatci=new ArrayList<>();
        sanatci.add("Ajda");
        sanatci.add("Cuneyt");
        sanatci.add("Mahsun");
        sanatci.add("Muslum");
        sanatci.add("Orhan");

        sanatci.subList(1,3); //listeden belirli bir araliktaki datalari getirme

        System.out.println(sanatci.subList(1,3));







    }
}
