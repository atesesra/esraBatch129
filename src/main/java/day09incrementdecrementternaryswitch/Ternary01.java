package day09incrementdecrementternaryswitch;

public class Ternary01 {
    public static void main(String[] args) {
        //Ex1

        int a=10;
        int b=20;

        int r1=a<b ? a++ : ++b;
        System.out.println(r1);  //10
        System.out.println(a);   //11
        System.out.println(b);   //20


        //Ex2 Verilen bir sayinin mutlak degerini hesaplayan kodu yaziniz.

        int x=-12;
        x=Math.abs(x);
        System.out.println(x);    //Hatirlamak icin ben yazdim bunu 04.12.2022 tarihinde ogrenmistik.

        int c= -4;
        int r2= c<0 ? -1*c :c;
        System.out.println(r2);

        //Ex3 Iki sayinin isareti ayni ise bu sayilari carpan, isaretleri farkli ise "Farkli isaretli sayilari carpamiyorum"
        //mesaji veren kodu yaziniz.

        int m=5;
        int n=6;

        //"Object" Java da butun "Non-Primitive Data Type"(Class) larin ortak "Parent"(Baba) idir.
        //Objectin parenti yoktur.
        //Farkli data typelari icin ortak bir veriableolusturmak istediginizde data type olarak object kullanabilirsiniz.
        //Java da Object insanlik aleminde Hz.Adem e benzer.

        Object r3=(m>0 && n>0) || (m<0 && n<0) ?a*b :"Farkli isaretli sayilari carpamiyorum";
        System.out.println(r3);

        //Ex4 Size verilen sayinin uc basamakli olup olmadigini kontrol eden kodu yaziniz.
        int p=-109;
        int r=Math.abs(p);

        String r4=r>99 && r<1000  ? p+ " Uc basamakli bir sayidir" : p+ " Uc basamakli bir sayi degildir";
        System.out.println(r4);








    }
}
