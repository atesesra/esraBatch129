package day25inheritance;

public class C01_Memur extends C03_Muhasebe {

    @Override

    /*
    Nesnenin dize gösterimini döndürür. Genel olarak, toString yöntemi,
    bu nesneyi "metinsel olarak temsil eden" bir dize döndürür. Sonuç,
    bir kişinin okuması kolay, kısa ama bilgilendirici bir sunum olmalıdır.
    Tüm alt sınıfların bu yöntemi geçersiz kılması önerilir.
    Object sınıfı için toString yöntemi, nesnenin bir örneği olduğu
    sınıfın adından, at-sign karakteri @ 'den ve nesnenin karma kodunun
    işaretsiz onaltılık gösteriminden oluşan bir dize döndürür.
    Başka bir deyişle, bu yöntem şu değere eşit bir dize döndürür:
     */
    public String toString() {
        return "C01_Memur{" +
                "saatUcreti=" + saatUcreti +
                ", statu='" + statu + '\'' +
                ", calismaSaati=" + calismaSaati +
                ", isim='" + isim + '\'' +
                ", soyIsim='" + soyIsim + '\'' +
                ", adres='" + adres + '\'' +
                ", telNo='" + telNo + '\'' +
                ", personelNo=" + personelNo +
                '}';
    }

    public static void main(String[] args) {


    C01_Memur memur1=new C01_Memur();

    memur1.isim="Osman";
    memur1.soyIsim="Sagir";
    memur1.adres="Izmir";
    memur1.telNo="053335664646";

    memur1.personelNo=1001;
    memur1.calismaSaati=8;
    memur1.statu="Memur";
        System.out.println(memur1);





    }
}
