package day09incrementdecrementternaryswitch;

public class NestedTernary01 {
    public static void main(String[] args) {

      /*
      Ex1 Verilen yilin artik yil(leap year) olup olmadigini kontrol eden kodu yaziniz. INTERVIEW SORUSU
      1.Yil 100 e bolunurse 400 e de blunmelidir
      2.Yil 100 e bolunmuyorsa 4 e bolunmelidir
       */

        int yil=2004;
        String result=(yil%100==0) ?(yil%400 ==0  ? "Leap Year"  : "Not Leap Year")   :(yil%4==0 ? "Leap Year"   :"Not Leap Year");
        System.out.println(result);












    }
}
