package com.company;

public class MyThread implements Runnable{
    Thread t;
    String input;
    public static int sth;
    public MyThread(String input)
    {
        t=new Thread(this);
        this.input=input;
        t.start();
    }
    public void run()
    {
        for(int i=0;i<input.length();i++) {
            try {
                wait();
                System.out.print(input.charAt(i));
                notifyAll();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        try
        {
            Thread.sleep(1000);
        }
        catch(Exception e)
        {
        }
    }
}
