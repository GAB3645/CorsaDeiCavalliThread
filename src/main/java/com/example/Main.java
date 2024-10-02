package com.example;

public class Main {
    public static void main(String[] args) {
        int l = 100;
        MioThread cavallo1 = new MioThread(l);
        MioThread cavallo2 = new MioThread(l);
        MioThread cavallo3 = new MioThread(l);
        MioThread cavallo4 = new MioThread(l);
        MioThread cavallo5 = new MioThread(l);
        MioThread cavallo6 = new MioThread(l);

        cavallo1.setName("Cavallo 1");
        cavallo2.setName("Cavallo 2");
        cavallo3.setName("Cavallo 3");
        cavallo4.setName("Cavallo 4");
        cavallo5.setName("Cavallo 5");
        cavallo6.setName("Cavallo 6");

        cavallo1.start();
        cavallo2.start();
        cavallo3.start();
        cavallo4.start();
        cavallo5.start();
        cavallo6.start();

    }
}