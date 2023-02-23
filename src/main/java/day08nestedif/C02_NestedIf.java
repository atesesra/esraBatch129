package day08nestedif;

public class C02_NestedIf {

    /*
    Password2un ilk harfi buyuk harf ise
    'A' olursa gecerli password yazdirin degilse gecersiz passwoes yazdirin.
    Passwordun ilk harfi kucuk harf ise
    'z' olursa gecerli password yazdirin degilse gecersiz password yazdirin.
     */

    public static void main(String[] args) {

     String pwd="5xy12!";
     char ilkHarf =pwd.charAt(0);

     if(ilkHarf>='A' && ilkHarf<='Z'){
         if(ilkHarf=='A'){
             System.out.println("Gecerli Password");
         }else {
             System.out.println("Gecersiz Password");
         }

     } else if (ilkHarf>='a' && ilkHarf<='z') {
         if (ilkHarf=='z'){
             System.out.println("Gecerli Password");
         }else {
             System.out.println("Gecersiz Passeord");
         }

     }else{
         System.out.println("İlk Karakter Harf Olmali");
     }


    }//MB



}//CB
