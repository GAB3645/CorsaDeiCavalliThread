package com.example;

public class MioThread extends Thread {
    private int l;
    private int posizione;

    public MioThread(int lunghezza){
        l = lunghezza;
    }

    public int getPosizione(){
        return posizione;
    }


    public void run() {
        for (int i = 0; i <= l; i++){
            System.out.println(Thread.currentThread().getName() + " : " + i);
        }
        posizione = l;
    }
}

