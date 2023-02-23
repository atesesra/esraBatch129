package day05typecastingstringmanipulations;

public class StringManipulations01 {
     //String bir non-primitive data type'dir ve ayni zamanda bir class'tir.
    public static void main(String[] args) {

        String s="Java is easy";
        //Ex1: "s" Stringindeki tum karakterleri buyuk harf yapiniz.
        String sUpper=s.toUpperCase();
        System.out.println(sUpper);
        System.out.println(s.toUpperCase());
        //Ex2: "s" Stringindeki tum karakterleri kucuk harf yapiniz.
        String sLower=s.toLowerCase();
        System.out.println(sLower);
        //Ex3:"s" Stringindeki ilk karakteri aliniz.
        char firstChar=s.charAt(0);
        System.out.println(firstChar);
        //Ex4:"s" Stringindeki ikinci ve sondan ikinci karakteri aliniz ve yanyana yazdiriniz.
        char secondChar=s.charAt(1);
        char finalSecondChar=s.charAt(10);
        System.out.print(secondChar);     //1.Yol
        System.out.println(finalSecondChar);

        System.out.println("" +secondChar+finalSecondChar);  //2.Yol
        //Ex5:"s" Stringinde kullanilan character sayisini bulunuz.
        int sLenght =s.length();
        System.out.println(sLenght);
        //Ex6: "s" Stringindeki ilk 4 karakteri aliniz.
        String sub1=s.substring(0,4);
        System.out.println(sub1); //Substring(0,4)==> 0 dahil 4 haric. [0,4)
        //Ex7:"s" Stringindeki "is" kelimesini aliniz.
        String sub2=s.substring(5,7);
        System.out.println(sub2);
        //Ex8:"s" Stringindeki "easy" kelimesini aliniz.
        String sub3=s.substring(8,12);
        System.out.println(sub3);
        //Bir characterden baslayip String'in sonuna kadar almak isterseniz ikinciyi yazmayip sadece basladigini yaziniz.
        String sub4=s.substring(8);
        System.out.println(sub4);
        //Ex9:"s" Stringinde money kelimesinin var olup olmadigini kontrol ediniz.
        boolean isExist=s.contains("money");
        System.out.println(isExist);


        /*
        Bir method'u ogrenirken uc seyi mutlaka ogrenin;
        1.Bu method ne is yapar?
        2.Bu method'un farki kullanimlari nasildir?
        3.Bu method size ne return eder?
         */

        //Ex10: "s" Stringinin belli bir harf ile baslayip baslamadigini kontol ediniz.
        boolean isStart=s.startsWith("Java");
        System.out.println(isStart);
        //Ex11:"s" Stringinin 6. characterden itibaren belli bir harf ile baslayip baslamadigini kontrol ediniz.
        boolean isBegin=s.startsWith("i",5); //cope attiigin karakter sayisi
        System.out.println(isBegin);







    }

}
