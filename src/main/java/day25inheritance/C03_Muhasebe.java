package day25inheritance;

public class C03_Muhasebe extends C04_Personel {
    protected  int saatUcreti;
    protected String statu;
    protected int calismaSaati=8;

    protected int maasHesapla(){
       int maas=saatUcreti*calismaSaati*30;
       return maas;
    }

}
