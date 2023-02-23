package day21overloadingstatic;

public class C03_StaticDepo {

    static String okulIsmi = "EmreOkullari"; //static veriable
    String ogrenciGul="Gul Gecer";  //instance veriable

    public static void staticMethod(){
        System.out.println("Ben static methodum");
    }

    public void staticOlmayanMethod(){
        System.out.println("Ben static olmayan methodum");
    }


}
