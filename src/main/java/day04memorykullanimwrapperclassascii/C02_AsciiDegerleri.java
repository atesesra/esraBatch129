package day04memorykullanimwrapperclassascii;

public class C02_AsciiDegerleri {
  /*
  ASCII=Amerikan Standart Kodlama Sistemi uluslararasi kabul gormus degerlerdir.
  Klavyemizde kullandigimiz harf ve sembollerin karsiligi char data turunde isleme alinirsa
  o char degerinin Ascii Table'daki karsiligini isleme alir.
  Harf ve sembollere deger atar.
  Karakterlerin cebirsel karsiligini bulmak icin ortaya cikmistir.Cunku bilgisayarda hersey
  0-1 den olusur.Bu yapiya donusturebilmek icin cebirsel karsiligi olusturulur.
  Buyuk harflerin Ascii degeri kucuk harflerin Ascii degerinden daha kucuktur.

   */

    public static void main(String[] args) {
      //Bir tamsayi ile bir harfi toplayiniz
        int deger=20;
        char harf='a';



        //1.Yol
        int sum=deger+harf; //20+97
        System.out.println("Bi tamsayi ile harfin toplami="+sum);

        //2.Yol
        System.out.println("2.Yol Toplam " +(deger+harf));
        
        char rakam1='1';
        System.out.println("rakam1 = " + rakam1);
        char rakam2='2';
        System.out.println("rakam2 = " + rakam2);
        char rakam3='3';
        System.out.println("rakam3 = " + rakam3);
        char rakam4='4';
        System.out.println("rakam4 = " + rakam4);

        System.out.println("rakam1+rakam2+rakam3+rakam4= "+rakam1+rakam2+rakam3+rakam4);

        System.out.println("rakam1+rakam2+rakam3+rakam4  ASCII Toplam= "+(rakam1+rakam2+rakam3+rakam4));

        char kh='a';
        char bh='A';
        System.out.println("a nin ascii degeri= "+(kh+0));
        System.out.println("A nin ascii degeri= "+(bh+0));

        System.out.println("kh>bh ==> "+(kh>bh)); //Karsilastirma islemlerinin sonucu true ya da false doner.

        //Herhangi bir karakterin ascii degerini hesaplatalim.

        //1.YOL
        char space=' ';
        System.out.println("space'in ascii degeri= "+(0+space));

        //2.YOL
        int hrf='m';
        //char data typelarinda java karaktere int deger atanabilir.
        //Cunku char data typeinin bir resim degeri bir de ascii den gelen int degeri vardir.
        //Bu sekilde ascii degerini bulabiliriz.

        System.out.println("int harfin ascii degeri "+hrf);

        //******ASCII degerlerinden yararlanarak karsilastirma yapabiliriz******

        byte b=125;
        float f=2.45648f;
        long l=54565125511144L;
        char ch='h';
        System.out.println(l>ch); //true
        System.out.println(b<f);  //false
        System.out.println(b<ch); //false






    }//Main body


}//class body
