package day12loops;

public class C04_WhileLoop {
    public static void main(String[] args) {
        // 3'den 10'a kadar tamsayilari ayni satira yazdiran kodu yaziniz.

        //1.YOL

        for (int i = 3; i <11 ; i++) {
            System.out.print(i+" ");
        }

        //2.YOL
        System.out.println();


        int j=3;                      //baslangc degeri
        while (j<11){                 //bitis degeri
            System.out.print(j+" ");
            j++;
        }

        //17 den 4 e kadar tum cıft sayilari yazin
        System.out.println();

        int a=17;
        while(a>3){
            if (a%2==0){
                System.out.print(a+" ");
            }
            a--;

        }


        //Day 13 Suleyman Hoca
        int b=684;
        int toplam=0;
        for (int m = b; m >0 ; m/=10){
            toplam=toplam+m%10;


        }
        System.out.println(toplam);








    }
}
