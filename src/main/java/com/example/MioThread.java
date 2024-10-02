package com.example;

public class MioThread extends Thread {
    private int l;

    public MioThread(int lunghezza){
        l = lunghezza;
    }

    public void run() {
        for (int i = 0; i <= l; i++){
            System.out.println(Thread.currentThread().getName() + " : " + i);
        }
    }
}
