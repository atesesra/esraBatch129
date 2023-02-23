package day30exceptionsinterface;

public interface Ac {
    //İnterface'lerin icine "concrete" method konulamaz, cunku "concrete method"larda
    // body vardir ve body o method'un isi nasil yapacagini belirtir. İsin nasil yapilacagi bircok detay icerir
    //Ve bu Child class'larda kafa karsiklina sebeb olur . Halbuki sadece yapilmasi gereken isi soyleyip nasil
    //yapilacagini child'e birakip child class'in kafa karisikligini engellemis olursunuz

    //interfacelerdeki tum methodlar otomatik olarak publicdir, abstract dir, static degildir.
    // public void cool(); burdan publici silebilirsin.void cool(); cunku hepsi public.

    //interfaceler concrete method iceremezler,dolayisiyla interface in icindeki hic bir sey istege bagli degildir,
    // her sey child classlar icn mecburidir.Bu yuzden interfacelere TO DO List de denir.
    //interfacedek veriable lar otomatik publictir statictir finaldir.


    void cool();
    void run();
    public static final int price=2000;

    String model="Mitsubishi";


}
