package practice_daytime.daytime09;

public class  TekKisilik extends Otel{
    public static void main(String[] args) {
        TekKisilik musteri1=new TekKisilik();
        System.out.println("musteri1 TV ucret,"+musteri1.tv(5)+"$");
    }//main

    @Override
    public void kahvalti() {
        System.out.println("Sadece Sandvic");
    }

    public int tv(int saat){
        return saat*2;
    }

}
