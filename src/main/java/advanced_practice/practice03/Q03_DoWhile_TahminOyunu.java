package advanced_practice.practice03;

import java.util.Scanner;

public class Q03_DoWhile_TahminOyunu {
    //0 ile 100 arasında rastgele numara tahmini yapan bir kod yazın.
    //İpucu: Girdiğiniz numara rastgeleNumara'dan küçükse ==> Daha büyük bir numara giriniz.
    //       Girdiğiniz numara rastgeleNumara'dan büyükse ==> Daha küçük bir numara giriniz.
    //       Girdiğiniz numara rastgeleNumara'ya eşitse ==> Tebrikler!!! ? tahminde sayiyi buldunuz. Puaniniz: ?
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int rastgeleSayi=(int)(Math.random()*101);
        int sayi;
        int sayac=10;
        System.out.println("0-100 arasi(dahil) bir tam sayi giriniz");

        do {
            sayac--;
            sayi=input.nextInt();
            if (sayi<rastgeleSayi){
                System.out.println(sayac+" hakkiniz kaldi");
                System.out.println("Daha buyuk bir sayi giriniz");
            } else if (sayi>rastgeleSayi) {
                System.out.println(sayac+" hakkiniz kaldi");
                System.out.println("Daha kucuk bir sayi giriniz");
            }else System.out.println("Tebrikler!!!"+(10-sayac)+"tahminde bulundunuz");
            System.out.println("Puaniniz: "+((sayac+1)*10));

            if (sayac==0){
                System.out.println("Hakkiniz bitti");
                //Odev yeniden oynama hakki
            }






        }while (sayi!=rastgeleSayi);









    }
}
