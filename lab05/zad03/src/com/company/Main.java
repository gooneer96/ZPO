package com.company;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class Main {

    public static int went = 0;
    public static int wentDuringFilm = 0;

    public static void main(String[] args) throws InterruptedException {

        double p1 = 0.05; // possibility for going out to cinema
        double p2 = 0.3; // possibility to leave during movie
        int n = 100;
        Per

        Executor executor = Executors.newFixedThreadPool(n);
        for(int i=0; i<n; i++)
            executor.execute(new PersonThread(p1, i));


        System.out.println("Active threads: " + Thread.activeCount());
        Thread.sleep(5000);
        System.out.println("Went: " + went);
        if(went < 5) {
            System.out.println("Sorry, movie will not be played!");
            System.exit(0);
        } else {
            Executor executor1 = Executors.newFixedThreadPool(went);
            for(int i = 0; i< went; i++)
                executor1.execute(new ViewerThread(p2,i));

            Thread.sleep(2100);

            if(went - wentDuringFilm < 5) {
                System.out.println("Stayed: " + (went - wentDuringFilm));
                System.out.println("Movie is cancelled, money from tickets will not be returned!");
                System.out.println(Thread.activeCount());
                System.exit(0);
            } else {
                System.out.println("Stayed: " + (went - wentDuringFilm));
                System.out.println("Movie is playing");
                System.out.println(Thread.activeCount());
                System.exit(0);
            }

        }
    }
}