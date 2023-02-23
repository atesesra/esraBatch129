package day02datatypesmethodcreation;

public class Odev_Day2 {

  /*
    1)Dikdortgenin alanini hesaplayan methodu olusturunuz ve kullaniniz.
    2)Dikdortgenin cevresini hesaplayan methodu olusturunuz ve kullaniniz.
    3)Dairenin cevresini hesaplayan methodu olusturunuz ve kullaniniz.
    4)Dairenin alanini hesaplayan methodu olusturunuz ve kullaniniz.
   */

    public static void main(String[] args) {

        long dikdortgenAlan=multiply(20,12);
        System.out.println(dikdortgenAlan);
        int dikdortgenCevre=addMultiply(20,12);
        System.out.println(dikdortgenCevre);
        double daireCevre=piMultiply(5);
        System.out.println(daireCevre);
        long daireAlan=piMultiplyArea(5);
        System.out.println(daireAlan);

    }
public static long multiply(long a,long b){

        return (a*b);
}
public static int addMultiply(int a,int b) {

        return 2*(a+b);
}
private static double piMultiply(long r){

        return (2*r*Math.PI);
}
private static long piMultiplyArea(long r){

        return (long) (r*r*Math.PI);
}




}
