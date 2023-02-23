package day23datetimestringbuilder;

public class StringBuilder01 {
    /*
    Java'da String,string class kullanilarak veya StringBuilder kullanilarak olusturabilir.
    String Class kullanarak urettiginiz Stringler Immutable(Degstirilemez) dir.
    StringBuilder Class kullanarak urettiginiz Stringler Mutable(Degistirilebilir) dir.
     */
    public static void main(String[] args) {
        //Immutable
        String s="Java";
        String t=s + "!";
        String w=t+"?";

        //Stringi degistirdikten sonra ayni Stringe assign ederseniz,Java yine yeni bir container olusturur,
        // degismis degeri bu yeni containerin icine koyar ve eski containeri gosteren oku yeni cntainer a yonlendirir.
        //Dolayısıyla eski container adressiz kalır ve garbage collector adressiz kalan contaner lari siler.
        String a="Money";
        a=a+"More";

        //Mutable

        //StringBuilder kullanaak String uretmenin 1.Yolu:
        StringBuilder sb1=new StringBuilder("Python");
        System.out.println(sb1);
        sb1.append("!").append("?").append(".");
        System.out.println(sb1);

        //StringBuilder kullanaak String uretmenin 2.Yolu:
        //String Builder kullandiginizda baslangic kapasitesi 16 dir.
        //Kapasite asildiginda varolan kapasitenin 2 fazlasi kadar ekleme yapar.
        StringBuilder sb2=new StringBuilder();
        System.out.println(sb2.length()); //0
        System.out.println(sb2.capacity()); //16

        sb2.append("Java");
        System.out.println(sb2.length()); //4
        System.out.println(sb2.capacity()); //16

        sb2.append("xxxxxxxxxxxxxxx");
        System.out.println(sb2.length()); //19
        System.out.println(sb2.capacity()); //34

        sb2.append("yyyyyyyyyyyyyyyy");
        System.out.println(sb2.length()); //35
        System.out.println(sb2.capacity()); //70

        //StringBuilder kullanaak String uretmenin 3.Yolu:
        StringBuilder sb3=new StringBuilder(2);

        sb3.append("Flo");
        System.out.println(sb3.length()); //3
        System.out.println(sb3.capacity());//6

        sb3.insert(2,"XXXXXX");
        System.out.println(sb3.length());
        System.out.println(sb3);

        //toString() methodu StringBuilder i Stringe cevirir.
        //String Cass da var olan ama StringBuilder Class var olmayan split() method gibi
        //methodlara ihtiyac duydugumuzda toString() metodu kullanarak String Class gecer ve o metodlari kullaniriz.
        sb3.toString().split("l");
        sb3.reverse();
        System.out.println(sb3);
        //Interwievde ters cevirme sorarlarsa sende deki reversle mi yapiyim for loopla mi?Genelde foor loop derler.

        StringBuilder sb4=new StringBuilder(sb3); // Stringi tekrar StringBuilder a cevirme

        //deleteCharAt(1) ;index1 deki characteri siler.
        sb3.deleteCharAt(1);
        System.out.println(sb3);

        //delete(1,6) ; index 1 deki characterden index 5(6 dahil olmadigi icin 5 yazdim)
        // deki charactere kadar tum characterleri siler.
        sb3.delete(1,6);
        System.out.println(sb3);

        StringBuilder sb5=new StringBuilder("Java");
        StringBuilder sb6=new StringBuilder("Kava");

        System.out.println(sb5.compareTo(sb6));//-1 ilki ikinciden 1 gei demek lava yarasaniz
        // -2 olur.ondeki lava sondaki java olursa +2 olur.

        //setCharAt(2,'m'); index 2 deki characteri 'm'ye cevirir
        sb6.setCharAt(2,'m');
        System.out.println(sb6);

        sb6.replace(1,3,"xyz");
        System.out.println(sb6);

        //StringBuilder Classda kullanmamiza izin verilen substring() method gibi bazi String Class methodlari  vardir,
        // bu methodlari StringBuilder ustunde kullaninca SB in orjinal degeri degismez.
        String s7=sb6.substring(1,3);
        System.out.println(s7);
        System.out.println(sb6);

    }
}
