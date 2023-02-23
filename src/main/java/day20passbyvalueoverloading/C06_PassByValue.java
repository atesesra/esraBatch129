package day20passbyvalueoverloading;

public class C06_PassByValue {
    //100 tl ye satilan bir ürüne 2 farkli indirim uygulayan  method olusturalim.
    public static void main(String[] args) {
        int fiyat=100;
        indirimYap25(fiyat);
        System.out.println("main icinde methoddan sonra fiyat = " + fiyat);
        fiyat=indirimYap10(fiyat); //indirimYap10(fiyat); yazarsa atama yapmis olmazsin o zaman 90 degil 100 goruruz
        System.out.println("main icinde methoddan sonra fiyat = " + fiyat);

    }

    private static int indirimYap10(int fiyat) {
        fiyat*=0.90;
        return fiyat;

    }

    private static void indirimYap25(int fiyat) {
        fiyat*=0.75;
        System.out.println("%25 indirimli fiyat = " + fiyat);
    }


}
