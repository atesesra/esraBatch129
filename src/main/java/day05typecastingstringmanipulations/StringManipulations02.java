package day05typecastingstringmanipulations;

public class StringManipulations02 {
    public static void main(String[] args) {
     String s="Learn Java earn money";
     //Ex1: "s" Stringinin "money" ile bitip bitmedigini kontrol ediniz.
        boolean isEnd=s.endsWith("money");
        System.out.println(isEnd);
        //Ex2:"s" Stringindeki "money" kelimesini "dollar" kelimesine ceviriniz.
        String newS1=s.replace("money","dollar");
        System.out.println(newS1);
        //Note: Replace methodunda coklu karakter ile calisirsaniz mecbur " " kullanacaksiniz.
        // Ama ' ' calisirsaniz cift tirnak ve ya tek tirnak kullanabilirsiniz.
        String s2=s.replace("earn","win");
        System.out.println(s2);

        String s3=s.replace('a','*');
        System.out.println(s3);
        //Ex5:"s" Stringindeki "n" harflerini "XXX" a ceviriniz.
        String s4=s.replace("n","XXX");
        System.out.println(s4);
        //Ex6:"s" Stringindeki tum "e" harflerini siliniz.
        //Note:Hicbir sey char data type inda yok o yüzden String "" kullanmaliyiz.

        String s5=s.replace("e","");
        System.out.println(s5);

        String t="Ali 13 yasindadir!...";
        //Ex7: "t" Stringindeki tum rakamlari * a ceviriniz.
       //Note: Bir grup datayi degistirmek icin replaceAll() kullanilir.
       String t1=t.replaceAll("[0-9]","*");
       System.out.println(t1);

       /*Meshur Regex(Regular Expressions)'ler
       1.Tum rakamlar==>[0-9]
       2.Tum kucuk harfler ==>[a-z]
       3.Tum buyuk harfler ==>[A-Z]
       4.Tum kucuk harfler ve buyuk harfler ==>[a-zA-Z]
       5.Tum harfler ve rakamlar ==> [a-zA-Z0-9]
       6.Tum noktalama isaretleri==> \\p{Punct}
       7.Tum sesli harfler ==> [aeiouAEIOU]
       x,q,w harfleri==>[xqw]
       8.Kucuk harflerden farkli tum character'ler==>[^]kullanilir==>[^a-z]
       9.Tum harflerden farkli tum characterler==>[^a-zA-Z]
        */

       //Ex8:"t" Stringindeki tum rakamlari ve harfleri "!" e ceviriniz.
       String t2=t.replaceAll("[a-zA-Z0-9]","t");
       System.out.println(t2);
       //Ex9:"t" Stringindeki tum sesli harfleri "?" e ceviriniz.
        String t3=t.replaceAll("[aeiouAEIOU]","?");
        System.out.println(t3);
        //Ex10: "t" Stringindeki kucuk harfler disindaki tum character'leri "<>" ceviriniz.
        String t4=t.replaceAll("[^a-z]","<>");
        System.out.println(t4);
        //Ex11:"t" Stringindeki tum harfler disindaki tum characterleri "+" ceviriniz
        String t5=t.replaceAll("[^a-zA-Z]", "+");
        System.out.println(t5);
        //Ex12:"t" Stringindeki space ler disindaki characterlei "+" ceviriniz
        String t6=t.replaceAll("[^ ]","+");
        System.out.println(t6);
        //Ex13:"t" Stringindeki sesli harfler disindaki tum characterleri "&" cevirniz.
        String t7=t.replaceAll("[aeiouAEIOU]","&");
        System.out.println(t7);





    }


}
