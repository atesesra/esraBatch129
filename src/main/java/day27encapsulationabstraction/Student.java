package day27encapsulationabstraction;

public class Student {
   private String stdId="AC123";
   private double gpa=3.99;
   private boolean poor=true;

    //***Encapsulation yapilmis datayi okuyabilir miyiz?***
    // get methodlar encapsule edilmis(saklanis) datayi okumamiza yararlar.
    // diger adi getter. Get methodlar her zaman public olurlar.
    //get methodlarin return type i veriable in data type i ile ayni olur.
    //get methodlarin isimleri get +veriable name seklinde olur.
    //veriable boolean ise get method is+verable selinde olur.
    //get methodlar parametre kullanmazlar.))

    public String getStdId() {
        return stdId;
    }

    public double getGpa() {
        return gpa;
    }

    public boolean isPoor() {
        return poor;
    }
    //***Encapsulation yapilmis datalar degistirilebilir mi?***
    //set method'lar (setter) encapsule edilmis datalarin degerlerini update etmemize ( degistirmemize) yarar.
    //set method'lar (setter) her zaman "public" olur.
    //set method'larin (setter) return type'i her zaman void olur.
    //set method'larin (setter) isimleri "set + variable name" seklinde olur.
    //set method'lar (setter) variable ile ayni data type' inda parametre kullanir.
    // getter ve setter == Java Beans



    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public void setPoor(boolean poor) {
        this.poor = poor;
    }

    public void setStdId(String stdId) {
        this.stdId = stdId;
    }
}
