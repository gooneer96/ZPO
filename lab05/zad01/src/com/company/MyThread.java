package com.company;

public class MyThread implements Runnable{
    Thread t;
    MyThread prevThread;
    boolean pause;
    public MyThread(String id,MyThread prevThread, boolean pause)
    {
        t=new Thread(this,id);
        this.prevThread=prevThread;
        this.pause=pause;
        t.start();
    }
    public void run()
    {
            if (pause)
            {
                t.suspend();
            }
            System.out.println("Hello from task " + t.getName() + " " +  t.getId());
            if(prevThread != null)
                prevThread.t.resume();
            try
            {
                Thread.sleep(1000);
            }
            catch(Exception e)
            {
            }
        }
}
