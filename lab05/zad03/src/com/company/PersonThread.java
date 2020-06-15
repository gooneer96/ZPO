package com.company;

import java.util.Random;

public class PersonThread implements Runnable {

    Random random = new Random();
    Double possibility;
    Boolean choice = false;
    int i;

    PersonThread(Double possibility, int i){
        this.possibility = possibility;
        this.i = i;
    }

    public synchronized void personWent(){
        Main.went += 1;

    }


    @Override
    public void run() {
        Integer waitTime = random.nextInt(4) + 1;
        try {
            Thread.sleep(waitTime*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if(random.nextDouble()< possibility) {
            choice = true;
            System.out.println("*smb going to the cinema*");
            personWent();
        }
        else choice = false;

        Thread.yield(); // thread is not doing anything important, is there any other threads or processes need to be run, they should run, if not current thread is continued

    }
}