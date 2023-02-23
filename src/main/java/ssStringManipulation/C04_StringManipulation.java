package ssStringManipulation;

public class C04_StringManipulation {
    public static void main(String[] args) {
        //Bir String değişkeni oluşturunuz ve String değişkenin konsolda boşluk olmayan son
        //karakteri yazdırınız.

        String degisken="Dunya kucuk ";
        int sonKarakterIndex=degisken.trim().length()-1;
        String sonkarakter= degisken.substring(sonKarakterIndex,sonKarakterIndex +1);
        System.out.println(sonkarakter);




    }
}
