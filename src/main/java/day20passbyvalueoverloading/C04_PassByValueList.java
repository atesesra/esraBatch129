package day20passbyvalueoverloading;

import java.util.ArrayList;
import java.util.List;

public class C04_PassByValueList {
    public static void main(String[] args) {
        /*
       bir list oluşturalım.
       sonra list elemanlarını degiştir methodu yazıp orada
       list elemanlarından bazılarını degiştirelim.
       method void olsun.
       main methoda döndükten sonra yeniden listi yazdıralım
       */

        List<String> harfler=new ArrayList<>();
        harfler.add("A");
        harfler.add("B");
        harfler.add("C");
        harfler.add("D");

        listElemanlariniDegistir(harfler);
        System.out.println("main icindeki methoddan sonra harfler = " + harfler); // R B C D
        //Listemize icindeki elemnlardan bir ya da birkacini degistirdigimizde
        // Listeyi degistirmis olmuyoruz.Pass By Value Array ve Listlerde aynen gecerlidir.
        //Ama listenin kendisini degstirmis olmuyoruz.
        listDegistir(harfler);

    }

    private static void listDegistir(List<String> harfler) {
        harfler=new ArrayList<>();
        System.out.println("methodda yeni list harfler = " + harfler);
    }

    private static void listElemanlariniDegistir(List<String> harfler) {
        harfler.set(0,"R");
        System.out.println("method icindeki harfler = " + harfler);


    }




}
