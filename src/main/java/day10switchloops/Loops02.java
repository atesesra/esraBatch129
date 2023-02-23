package day10switchloops;

public class Loops02 {
    public static void main(String[] args) {

        //Ex1:21 den 180 e kadar hem 4 hem de 6ile bolunebilen tum tam sayilari ekrana yazdiran kodu yaziniz.

        for (int i = 21; i < 181; i++) {
            if (i % 4 == 0 && i % 6 == 0) {
                System.out.print(i + " ");
            }
        }

        //Ex2: Size verilen kucuk hrfle yazilmis Stringin indexi cift sayi olan characterlerini buyuk harf yapiniz.
        //    ankara==>AnKaRa
        String s = "ankara";
        String t = "";
        //Note: Yazdiginiz kod belli senaryolar icin calisiyor tum senaryolar icin calismiyorsa bu codelara "harde-code"
        //denir.hard-code yanlıs yazilmis koddur mutlaka duzeltilmelidir.

        for (int i = 0; i < s.length(); i++) {
            //lenght in 1 eksigi son indexi verir index 0 ile baslar.


            String ch = s.substring(i, i + 1);

            if (i % 2 == 0) {
                System.out.println(ch.toUpperCase());

            }

        }


    }
}
