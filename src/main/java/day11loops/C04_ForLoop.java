package day11loops;

public class C04_ForLoop {
    public static void main(String[] args) {

        //1 den 100 e kadar 6 ile bolunenler haric tum tamsayilari ekrana yazdiriniz.

        for (int i = 1; i <101 ; i++) {

            if (i%6==0){
                continue;  //bosver
            }
            System.out.print(i+ " ");

        }//fb
        //INTERVIEW SORUSU
        //Size verilen bir Stringi ters ceviren kodu yaziniz

        String str="Esra";
        String ters=""; // yeni bir conteyner olusturduk.

        for (int i = str.length()-1; i >-1 ; i--) {
            char harf=str.charAt(i);
            //ters=ters+harf
            ters+=harf;

        }
        System.out.println();
        System.out.println(ters);












    }
}
