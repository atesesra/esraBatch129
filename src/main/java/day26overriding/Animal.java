package day26overriding;
/*
        1)Parent Class'da ki method'u Child Class icinde ozellestirerek kullanmaya "Overriding" yapmak denir.
        2)Overriding'de method'un parantezine,method'un ismine dokunulmaz, method'un body'si degistirilir.
        3)@Override ==> Override Annotation: Override kurallarinin Java tarafindan kontrol edilmesini saglar.
        4)Overriding'de Parent Class'daki method'a "Overridden Method" denir, Child Class'daki method'a ise "Overriding Method" denir.
        5)"private" method'lar "override" edilemezler.
        6)Child Class'daki override edilmis method(Overriding Method)'un access modifier'i Parent Class'daki override
        edilmis method(Overridden Method)'un access modifier'indan dar olamaz.
        Overridden Method ==> protected ise Overriding Method ==> protected + public
        Overridden Method ==> default ise Overriding Method ==> default + protected + public
        Overridden Method ==> private ise Overriding Method ==> override olmaz ki access modifier'i olsun. Look 5th.
        7)Child Class'da override edilen method'un(Overriding Method) return type'i method'un return ettigi data type'inin
        aynisi veya o data type'inin parent'i olarak secilir.
        8)Method'un return type'i "primitive" ise,Overriding yaparken return type degistirilemez.Cunku return type ya ayni olur
        ya da parent'dan secilir ama primitive'ler arasinda "parent-child iliskisi" olmadigindan parent'dan secmek mevzu
        bahis olamaz o zaman tek secenek aynisi olmalidir kalir.
        9)Methodun return type i wrapper class ise  overriding yaparken return type degistirilemez.Cunku return type ya
        ayni olur veya parentdan secilir.Ama Java bir wrapper classi digerinin parent'i yapmadigindan parentdan
        secme ihtimali yoktu,geriye sadece aynisi olma ihtimal kalir.
        10)Methodun return typei void ise,Overriding yaparken return type degistirilemez.
        11) Final kelimesini "Variable"larda kullanabilirsiniz.
                    ->final variable ise
                    i) mutlaka değer atanmalıdır
                    ii) ilk atanan değer değiştirilemez

        12)Final kelimesini "Method" larda kullanabilirsiniz.
                     ->method final ise;
                      i)methodun body'si değiştirilemez
                      ii)method body'si değiştirilemeyince override yapmak mümkün olmaz

         13)Final kelimesini "Class"larda kullanabilirsiniz.
                     ->class final ise;
                       i)o class'ın child'ı olamaz
         14)"final" methodlar ve "static" methodlar override edilemezler.
         15)Override yapabilmek icin "Inheritance" sarttir.Baska bir ifadeyle Parent-Child  iliskisi sarttir.
         16)Method Overloading "Compile Time Polymorphism" dir.Method Overriding "Run Time Polymorhphism" dir.

        */

public class Animal {
    public void eat(){
        System.out.println("Animals eat...");
    }
    public void drink(){
        System.out.println("Animals drink...");
    }
    public Animal create(){
        return new Animal();
    }
    public int add(int a, int b){
        return a+b;
    }
    public Integer multiply(int a, int b){
        return a*b;
    }
}
