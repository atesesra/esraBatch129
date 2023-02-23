package practice_daytime.daytime02;

public class C02_MethodCreation {
    public static void main(String[] args) {

        //Dikdortgenin alaninin hesaplayan kodu yaziniz ve kullaniniz.

        System.out.println("Dikdortgenin alani: "+dikdortgenAlani(10,5));
        System.out.println("Dikdortgenin cevresii: "+dikdortgenCevresi(10,5));
        kareninAlani(25);

        //Karenin alanini hesaplayan kodu yaziniz.



    }//Main

    public static int dikdortgenAlani(int a,int b){
        return a*b;
    }
    public  static int dikdortgenCevresi(int a, int b){
        return 2*(a+b);

    }
    public static void kareninAlani(int a){
        System.out.println("Karenin Alani : "+(a*a));
    }

}//Class
