package day10switchloops;

public class Loops01 {
    /*
    Code Standarts
    i.Repetition olmamalidir
    ii.Dynamic lmalidir
    iii.
     */
    public static void main(String[] args) {
      //Ex 1 Ekrana 5 kere "Hi" yazdiriniz.
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");
        //2. Yol
        // Ayni adimlar tekrarlanacaksa looplar kullanilir.
        //far-loop,while-loop,do-while-loop,for-each-loop,

        for (int i=1    ;i<6   ; i++ ){
            System.out.println("Hi");

        }

        //Ex 2 11 den 14 e kadar tum tamsayilari ekrana yazdiran kodu yaziniz.
        for (int i=11 ; i<15   ;   i++){
            System.out.println(i);
        }
        //Ex 3 40 dan 23 e kadar tum cıft tamsayilari ekrana yazdirin.

        for (int i=40; i>22; i--   ){
            if (i%2==0){
                System.out.println(i);
            }


        }

        //Ex 4 18 den 56 ya kadar tum tek tam sayilari ekrana yazdiran kodu yaziniz.

        for (int i=18; i<56; i++  ){
            if (i%2!=0){
                System.out.print(i +" ");
            }


        }




    }
}
