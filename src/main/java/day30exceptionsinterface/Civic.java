package day30exceptionsinterface;
/*
1)Bir interfae is bir cassin parenti yapmak icin implements keywordunu kullaniniz.Extends classlar icin kullanilir.
2)Java parentlar class oldugunda multiple oarent a musade etmez.Ama biz bazen multiple parent a ihtiyac duyariz.
Bu ihtiyaci gidermek icin java interface ismini verdigi yeni bir yapi olusturdu.
Bu yapi sayesinde bir class icin coklu interface parent olusturabiliriz.
3)Coklu interface parentlarin her birinin icine ayni isimli methodlar koyabiliriz.
MEsela Ac,Engine,Securitynin icine run koyduk.

 */

public class Civic implements Ac,Engine,Security {


    @Override
    public void cool() {
        System.out.println("Civic cools perfectly");
    }

    @Override
    public void run() {

    }
}
