package practice_daytime.daytime06;

public class C02_Varargs {
    public static void main(String[] args) {
        //Verilen sayilardan ilki haric tum sayilari
       // toplayip ilk sayiyla carpan bir method olusturunuz (Varargs kullanarak)
        int sayi1=5;
        int sayi2=7;
        int sayi3=2;
        int sayi4=4;
        int sayi5=9;

        sonuc(sayi1,sayi2,sayi3,sayi4,sayi5);


    }

    private static void sonuc(int sayi1,int ...toplanacakSayi) {
        int toplam=0;

        for (int w:toplanacakSayi
             ) {
            toplam+=w;

        }
        System.out.println(toplam);
        int sonuc=toplam*sayi1;
        System.out.println("sonuc = " + sonuc);
    }

}
