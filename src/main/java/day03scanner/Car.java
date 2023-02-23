package day03scanner;

public class Car {

    //Class ==> Veriable (Pasif Ozellikler) ==> Object
                //Method ( Aktif Ozellikler)
    public String model="Corolla";
    public int fiyat=200000;

    public static void main(String[] args) {
     //Class ismini yazin  Objeye isim verin    =   new keywordunu kullanin   Class ismini () ile kullan
        Car                  myCorolla          =         new                      Car();


        System.out.println(myCorolla.fiyat);
        System.out.println(myCorolla.model);
        myCorolla.hareket();
        myCorolla.dur();


    }//Main'in bodysi
    public void hareket(){//Aktif ozellikler Methodlar
        System.out.println("Toyota hizli hareket eder...");
    }
    public void dur(){//Aktif ozellikler Methodlar
        System.out.println("Toyota guvenle durur...");
    }






}//Class'in bodysi
