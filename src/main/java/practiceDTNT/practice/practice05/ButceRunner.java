package practiceDTNT.practice.practice05;

public class ButceRunner {
    public static void main(String[] args) {
        Butce baba=new Butce();
        System.out.println("Maas oncesi butce: "+Butce.butce); //0
        baba.maasAl(3000);
        System.out.println("Maas sonrasi butce: "+Butce.butce);
        baba.harclikAl(100);
        baba.harclikHArca(20);
        baba.butcedenHarca(500);
        System.out.println(baba.harclik);
        System.out.println(Butce.butce);

        Butce anne=new Butce();
        anne.maasAl(5000);
        anne.harclikAl(500);
        anne.harclikHArca(450);
        System.out.println(Butce.butce);
        System.out.println(anne.harclik);

        Butce oglan=new Butce();
        oglan.harclikAl(1000);
        oglan.harclikHArca(30);
        System.out.println(Butce.butce);
        System.out.println(oglan.harclik);








    }//main
}//class
