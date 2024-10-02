package com.example;

public class Main {
    public static void main(String[] args) {
        int l = 15;
        MioThread t1 = new MioThread(l);
        t1.start();
        MioThread t2 = new MioThread(l);
        t2.start();
    }
}