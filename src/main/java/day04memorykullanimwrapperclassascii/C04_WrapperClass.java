package day04memorykullanimwrapperclassascii;

public class C04_WrapperClass {

    /*
    Non-Primitive data türleri sadece data barindirmak için değil ayni zamanda methodlarda bulundurur.
    Primitive Data türleri ise sadece deger saklar.
    Java bu durumu bir cozum uretmistir.
    Her primitive data turunu non-primitive olarak kullanabilmek icin ozel classlar olusturmustur.
    Oracle firmasinin urunu olan Java primitivlere method ekleyerek olusturdukları bu yeni yapiya wrapper
    class adini vermistir.

    Primitive            Wrapper
     byte                  Byte
     short                 Short
     int                   Integer   ****
     long                  Long
     float                 Float
     double                Double
     boolean               Boolean
     char                  Character ****


     */

    public static void main(String[] args) {

    byte primitiveByte=12; //primitive data typlerainda primitiveByte. (nokta koyunca) hic bir method gelmez.
    Byte wrapperByte=12; //wrapper classlarda wrapperByte.(nokta koyunca) bir cok method gelir.






            //Ex:byte data type in en kucuk ve en buyuk degerini ekrana yazdirin.



        System.out.println(Byte.MIN_VALUE);
        System.out.println(Byte.MAX_VALUE);

        //short int long data typelarin max min degerlerini hesaplatan kodu yaziniz.

        System.out.println(Short.MIN_VALUE);
        System.out.println(Short.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Long.MIN_VALUE);
        System.out.println(Long.MAX_VALUE);

        //******Primitiveler wrapper classlara nasil cevrilir******(autoboxing)

        float f1=13.99F; // kucuk kutu primitive
        Float wrapperF1=f1;

        //********Wrappe Classlari primitive data typelarina nasil cevrilir****(unboxing)

        Character w1= 's';
        char primitiveW1=w1;
        //Note:Autoboxing ve unboxing java tarafindan otomatik yapilir.
        //extra kod yazmaya gerek yoktur.

        //Ex: Verilen iki String datanin toplamini veren kodu yaziniz.
        String str1="12345";
        String str2="6789";
        System.out.println(str1+str2); //123456789 yan yana yazdirdi
        System.out.println(Integer.valueOf(str1)+Integer.valueOf(str2));







    }


}
