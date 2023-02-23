package day23datetimestringbuilder;

public class StringBuffer01 {
    /*
    String olusturmak icin String Class, StringBuilder Class, ve StringBuffer kullanilabilir.
    1.StringBuffer Java nin string uretmek icin olustudugu ile Classtir.Kava 5 te uretilmistir.
    2.StringBuffer synchronized di, StringBuilder thread safe degildir.
    3.StringBuffer thread safe(multi thread e uygun) dir, String Builder thread safe degildir.
    4.StringBuffer ve StringBuilder ikiside mutable dir.

    Note1: Immutable String lazim oldugunda Sring Class kullaniriz.
    Note2: Mutable String lazim oldugunda StringBuilder verya StringBuffer kullaniriz.
    Note3: StringBuffer "Multithread" ve "Synchronazition" lazim oldugunda tercih edilir.
           StringBuilder "Multithread" ve "Synchronization" gerekmezse tercih edilir.

     */
    public static void main(String[] args) {

        StringBuffer sbf = new StringBuffer("Java");
        System.out.println(sbf);
        System.out.println(sbf.capacity());//20

    }
}
