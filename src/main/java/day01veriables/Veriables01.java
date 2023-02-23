package day01veriables;

public class Veriables01 {

    public static void main(String[] args) {

        //Variable olusturmak
        //Java cumlesi = Statement
        //Java'da esittir demek "==".
        //Java'da "=" işareti "assignment operator" dir.Sagdaki degeri alır soldaki kutuya koyar.
        //Access Modifier yazmazsaniz "access modifier" "default" demektir.
        //Data Type+Veriable Name==>Veriable Declaration
        //Assignment Operator+Veriable degeri==>Assignment
        //Egere veriable yapar assignment yapmazsaniz java kendi degerlerini(default) koyar.
        //Default degerler sayılar icin sifirdir.
        //Data type yaziniz    Veriable ismi yaziniz   Assignment Operator   Veriable degeri    Ingilizcedeki nokta
              int                      age                   =                     13              ;

        //Ornek 1:Ogrenci ismi icin veriable lusturup deger olarak Ali Can atayiniz.
        //Stringlere verilen degerler çift tirnak içine alinmalidir.
        //Stringler icin "default value" "null" dir.
        String studentName="Ali Can";

        /*
        Java'da temelde iki tip data vardir;
        1)primitive data type
           char:Tek karakterler için kullanilir. A,x,?,5
           boolean:True False icin kullanilir.
           byte:-128 den +127 e kadar tamsayi degerleri icin kullanilir.(1byte)
           short:-32768 ile +32767 arasindaki tam sayilar icin kullanilir.(2byte)
           int:-2,147,483,648 ile 2,147,483,647  arasindaki sayilar icindir.(4byte)
           long:-9,223,372,036,854,775,808 ,ile +-9,223,372,036,854,775,807 arasindaki sayilar icindir.(8byte)
           float:
           double:
        2)non-primtive data type

         */

        //Ornek 2:char data type'inde ilk ismin bas harfi olarak bir veriable olusturunuz ve bir deger atayiniz.
        char isminIlkHarf = 'A';

        //Ornek 3:boolean data tipinde emekli misin için bir veriable olusturun ve false degerini atayin.
        boolean emeklimisin = false;

        //Ornek 4:byte data type da ogrenci yasi icin bir veriable olusturunuz ve deger atayiniz.
        byte studentAge = 23;

        //Ornek 5:Site nufusu icin bir veriable olusturup deger atayiniz.
        short siteNufusu = 1200;

        //Ornek 6:Ulke nufuslari icin bir veriable olusturup deger atamasi yapiniz.
        int countryPopulation = 1864184648;

        //Ornek 7:İnsan vucudundaki hücre sayisi icin veriable olusturup deger atamasi yapiniz.
        //Note: Bir deger long ise sonuna "L" (Tercih edilir.) ve ya "l" konulur.
        long cellNumberInHumanBody = 87654321356788L;

        //Eger long a atadiginiz deger int araliginda ise sonuna L koymaya gerek yok.
        long weightOfSun = 1234567;








    }//main

}//class body
