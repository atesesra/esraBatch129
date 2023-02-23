package day04memorykullanimwrapperclassascii;

public class C03_MantikOperatorleri {

/*
    Java uclu karsilastirma kabul etmez.
    Ikili karsilastirma yapip mantik operatorleriyle birlestirmeliyiz.
    && ==ve and  || or operatoru veya demek

    cay ve limon
    +  &&  +     =true
    +  &&  -     =false
    -  &&  +     =false
    -  &&  -     =false

    && ile &
    &&'de boolean sonucta bir tane false bulunca durur
    & ' de ise tum satiri tarar sonra durur.
    bu da && nin & den daha hizli calismasini saglar.

    || ve ya operatoru Polyannacidir.En ufak bir pozitiflikten true doner.

    cay  ve  limon
    +  ||  +      = true
    +  ||  -      = true
    -  ||  +      = true
    -  ||  -      = false


 */
public static void main(String[] args) {
    System.out.println(5+2==8);//false



    boolean sonuc1=5>4 && 7<9 && 6+3==9 && 5+2 !=8;//true
    System.out.println(sonuc1); //true

    boolean sonuc2=5>4 && 7>9 && 6+3==9 && 5+2==8;//false
    System.out.println(sonuc2);

    int sayi1=15;
    System.out.println(10<sayi1    &&    sayi1<20);//true

    int sayi2=5;
    System.out.println(sayi2<10     ||     sayi2>20);//true






}//main body







}
