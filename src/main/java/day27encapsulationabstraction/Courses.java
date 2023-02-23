package day27encapsulationabstraction;

public abstract class Courses {
    /*
    1)Bazen method bodysini yazmak gerekmez.Bu durumlarda bodysiz method olusturmak gerekir.
    Body'si olmayan methodlara "abstrac method" lar denir.
    2)"abstrac method" lar child classlar tarafndan override edilmek zorundadirlar.
    By yuzden, bir fonksiyonun child classlar tarafindan kullanilmasini mecbur kilmak isterseniz
    o methodu abstract yapmak gerekir.
    3)Bir methpdun bodysini silmek o methodun abstract olmasi icin yeterli degildir.Access modifier ile
    return type arasina(public abstract void) abstract keyword koymak gerekir.
    4)"abstrac method" lar siradan classlarin(concrete yani somut gibi anlaminda beton degil) icine yazilamazlar.
    "abstrac method" larin icine yazildigi classlarda abstract olmak zorundadir.
    5)"abstract classlarda hem abstract methodlar hem de concrete methodlarkullanilabilir.
    6)concrete classlar abstract classlarin child i olabilirler.
    abstract methodlarin override edilme zorunlulugu "concrete classlar" icindir.
     */

    public abstract void math();

    public void art(){
        System.out.println("Painting...");
    }
    //final method'lar "override" edilemezler, halbuki "abstract" method'lar override edilmek icin olusturulurlar.
    //Bu celiskidir, bu yuzden Java abstract method'larin final olmasina musaade etmez.
    //public final abstract void science();

        //Concrete Class'lar final oldugunda Child Class'a sahip olamazlar
        //Ama "Abstract Class" lar icin Child Class olmalidir, cunku Child Class'lar abstract parent class'daki abstarct method'lari kullanirlar.
        //Bu yuzden, Java "Abstract Class" larin "final" olmasina musaade etmez.

    //"abstract method"lar "private" olamazlar, cunku Child Class'lar abstract method'lari kullanirlar, private yapinca kullanima kapali olur.
    //Bu celiskidir, bu yuzden Java abstract method'larin "private" olmasina musaade etmez.

    //"abstract method" lar "static" olamazlar, cunku static method'lar override edilemez, halbuki abstract method'lar override edilmek icin olusturulmustur.










}
