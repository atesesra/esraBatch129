package day02datatypesmethodcreation;

public class MethodCreation01 {



    public static void main(String[] args) {
        /*
          Java'da method nasil olusturulur?

          1)main methodun disinda olusturulur.
          2)Access Modifier+Return Type+Method İsmi+()+{}

          Olusturulan methodlar nasil kullanilir?
          1)main method'un icinden kullanilir
          2)method'un ismini + () yazin
          3)islem yapacaginiz sayilari parantez icine koyun
     */

        int sonuc =add(30,20);
        System.out.println(sonuc);
        System.out.println("sonuc = " + sonuc);

        long carpmaSonucu = multiply(3,6);
        System.out.println(carpmaSonucu);
        System.out.println("carpmaSonucu = " + carpmaSonucu);

        System.out.println(multiply(8, 9));
        System.out.println(multiply(8,9));


        int ucluSonuc = firstTwoMultiplyThirdAdd(2,5,8);
        System.out.println(ucluSonuc);

        double sayininKupu = multiplyThreeTimes(9.05);
        System.out.println(sayininKupu);


        }

    public static int add(int a, int b){

        return a+b;
    }

    protected static long multiply(int a, int b){

        return a*b;
    }



    //Ornek 1: Verilen 3 sayidan ilk ikisini carpan ve sonucu ucuncuyle toplayan methodu olusturunuz ve kullaniniz.

    private static int firstTwoMultiplyThirdAdd(int a,int b,int c){
        return (a*b)+c;

    }


    //Ornek 2: Verilen bir ondalık sayinin küpünü hesaplayan methodu olusturup kullaniniz.
    //Note:access modifieri default yapmak icin acces modifieri yazmayiniz.

    static double multiplyThreeTimes(double a){

        return a*a*a;
    }

    //1)Dikdortgenin alanini hesaplayan methodu olusturunuz ve kullaniniz.
    //2)Dikdortgenin cevresini hesaplayan methodu olusturunuz ve kullaniniz.
    //3)Dairenin cevresini hesaplayan methodu olusturunuz ve kullaniniz.
    //4)Dairenin alanini hesaplayan methodu olusturunuz ve kullaniniz.




}
