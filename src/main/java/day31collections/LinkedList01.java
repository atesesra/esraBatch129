package day31collections;
/*
1)interfacelerden object olusturulamaz cunku interfacelerin constructori yoktur.
2)Abstract Classlardan object olusturulamaz constructorlari vardir ma constructor object olusturmada kullanilamaz
3)interfacelerin constructorlari olmadigindan collection olustururken interface isimleri new keywordunden sona kullanilamaz.
4)class-->class==>extends
  class-->interface==>implements
  interface-->interface==>extends
  interface-->class==>Bu mumkun degildir.

  5)Arraylistlerde eleman silme ve eleman eklemede basarisizdirlar o yuzden eleman silme ve
  ekleme islemleri coklukla yapilacaksa Array List kullanmak tavsiye edilmez.

  6)LinkedList’ler index kullanmadiklarindan eleman silmede ve eklemede re-index yapilmasina gerek yoktur. Bu da
  LinkedList’leri eleman ekleme ve silmede cok basarili hale getirir. Bu yuzden eleman ekleme ve silmenin cok
  yapilmasi gereken durumlarda LinkedList kullanmak tavsiye edilir.
  7)ArrayListlerde search islemi kolay yapilir cunku indexler adres gibidir.
  8)LinkedListlerde search islemi zor yapilir.CunkuLinnkedListler index kullanmaz.
  Index kullanmayinca herhangibir elemani bulmak icin en bastan butun elemanlar kontrol edilir.
  Bu da cok fazla is demektir.
 */

import java.util.LinkedList;
import java.util.List;

public class LinkedList01 {
    public static void main(String[] args) {

        List<String> cityNames=new LinkedList<>(); //List parent bu da yazilabilir.


        LinkedList<String> names= new LinkedList<>();
        names.add("Steve");
        names.add("Ajda");
        names.add("Raj");
        names.add("Megan");
        names.add("Brandon");

        System.out.println(names);

        names.addFirst("Cuneyt");
        System.out.println(names);

        names.addLast("Ajda"); //This method is equivalent to add().
        System.out.println(names);

        names.add(3,"Suleyman");
        //LinkedList hani index kullanmazdi?Evet kullanmaz ama java dev.kolay calismasi icin add
        // methodunun indexli halini eklemis ama arka planda index kullanilmiyor.Yani index gibi gorunuyor ama index degil aslinda.
        System.out.println(names);


        names.remove("Ajda");
        System.out.println(names);
        //MEsela burda denemek icin Carl i Ajda yaptk.2 tane Ajda oldu.Remove ilkini sildi digerine dokunmadi.

        names.remove(4);
        System.out.println(names);

        names.add("Suleyman");
        System.out.println(names);


        String r1=names.remove();//Retrieves and removes the head (first element) of this list.
        System.out.println(r1);
        System.out.println(names);

        names.removeFirstOccurrence("Suleyman"); //ilk gorunumu sil
        System.out.println(names);

        names.removeLastOccurrence("Suleyman");
        System.out.println(names);

        String r2=names.peek();  //remove() siler peek() silmez yani cut paste-copy paste
        System.out.println(r2);
        System.out.println(names);

        names.poll();//remove() bos LListte kullanilirsa hata verir, poll null verir.
        names.pop();//cut+paste remove first ile ayni













    }
}
