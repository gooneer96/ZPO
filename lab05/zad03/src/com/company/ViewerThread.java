package com.company;

import java.util.Random;

public class ViewerThread implements Runnable {

    Double possibility;
    int i;
    Random random = new Random();
    Boolean choice;

    ViewerThread(Double possibility, int i){
        this.possibility = possibility;
        this.i = i;
    }

    public synchronized void viewerWentDuringMovie(){
        Main.wentDuringFilm += 1;
    }

    @Override
    public void run() {

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if(random.nextDouble()< possibility) {
            choice = true;
            System.out.println("*smb went out*");
            viewerWentDuringMovie();
        }
        else choice = false;

        Thread.yield(); // thread is not doing anything important, is there any other threads or processes need to be run, they should run, if not current thread is continued
    }
}