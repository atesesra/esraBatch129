package day09incrementdecrementternaryswitch;

public class IncrementDecrement01 {
    public static void main(String[] args) {

        int a = 5;
        System.out.println(a);
        // Increment 1
        a = a + 2;
        System.out.println(a);

        //Ex1: Bir tane integer veriablle lusturun ve onu iki sekilde 5 arttirin.
        int b=10;
        System.out.println(b);
        b=b+5;
        System.out.println(b);
        b+=5;
        System.out.println(b);

        //Decrement 1
        int c=8;
        System.out.println(c);
        c=c-3;
        System.out.println(c);
        c-=3;                           //c=c-3 ile ayni sey
        System.out.println(c);

        //Increment 2
        int d=6;
        System.out.println(d);
        d=d*2;
        System.out.println(d);
        d*=2;
        System.out.println(d);

        //Decrement 2
        int e=24;
        System.out.println(e);
        e=e/2;
        System.out.println(e);
        e /=2;
        System.out.println(e);
        //"1" ile increment ve decrement
        int f=12;

        //f=f+1;
        //f+=1;
        f++; // BUNU KULLAN 1 ARTTIRIRKEN

        int h=10;
        h--;

        //"Post increment" ve "pre increment"
        int i=10;
        int k=i++; //post-increment cunku increment,veriable'in isminden sonra yazildi.
        System.out.println(k);//10   i arttirilmadan k ya kondugu icin k nin degeri 10 olur
        System.out.println(i);//11   i satir sonunda artirildigi icin i nin degeri 11 olur

        int m=15;
        int n=++m;//pre-increment cunku increment veriable'in isminden once yazildi.
        System.out.println(m);//16      m arttirildiktan sonra n ye konuldugu icin n nin degeri 16 olur
        System.out.println(n);//16      m artirildiktan sonra n ye konuldugu icin n nin degeri 16 olur

        //"Post increment" ve "pre increment"

        int p=17;
        int r=p--;  //p=16 r=17
        System.out.println(p);
        System.out.println(r);

        int s=20;
        int t=--s;  //t=19 s=19
        System.out.println(s);
        System.out.println(t);










    }
}
