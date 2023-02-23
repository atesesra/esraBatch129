package ssStringManipulation;

public class C03_StringManipulation {
    public static void main(String[] args) {
        /* soru 3)Kişi isimleri için 3 String değişken oluşturunuz. Boşluk karakterleri hariç 3 isimdeki
     karakter sayısının toplamını yazdırınız.
      */

        String isim1="Esra";
        String isim2="Uzay Can";
        String isim3="Sonay";


        System.out.println(isim1.replaceAll("\\s","").length()+isim2.replaceAll("\\s","").length()+isim3.replaceAll("\\s","").length());







    }
}
