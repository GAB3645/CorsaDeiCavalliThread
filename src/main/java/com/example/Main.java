package com.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        int l = 100;

        List<MioThread> cavalli = new ArrayList<MioThread>();
        
        for (int i = 0; i < 6; i++) {
            MioThread cavallo = new MioThread(l);
            cavallo.setName("Cavallo " + (i + 1));
            cavalli.add(cavallo);
            cavallo.start();
        }

        for (MioThread c : cavalli) {
            c.join();
        }

        List<String> classifica = new ArrayList<String>();

        for (MioThread c : cavalli) {
            classifica.add(c.getName() + " - " + c.getPosizione());
        }

        Collections.sort(classifica);
        
        System.out.println("Classifica di arrivo: " + classifica);
    }
}

