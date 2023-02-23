package day22staticblocksconstructors;

public class StaticBlocks01 {
    //Bir veriable olusturdugunuzda, deger atamazsaniz o veriable i initialize etediniz demektir.
    //static veriable lar static blocklar icinde initialize edilirse o class in icinde herseyden once hazir hale getirilmis olur.
    //Bazen main mmethod calistirilmadn once veriable larin hazır hale getirilmesi gerekir.Bu yüzden static blocklar kullanilir.
    //Note 1:"static block"lar static veriableri initialize etmek icin kullanilir.
    //Note 2: "static block"lar class icinde herseyden once calistirilirlar.
    static double pi;
    static String shape;
    static{
        pi=3.14;
        System.out.println("Static block 1");
    }
    static{
        shape="Circle";
        System.out.println("Static block 2");
    }

    public static void main(String[] args) {
        System.out.println("main method");

    }
}
