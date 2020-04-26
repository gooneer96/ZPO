package com.company;
public class Main {

    public static void main(String[] args) {
        MyThread mt=new MyThread(Integer.toString(0),null,true);
        MyThread mt1=new MyThread(Integer.toString(1),mt,true);
        MyThread mt2=new MyThread(Integer.toString(2),mt1,true);
        MyThread mt3=new MyThread(Integer.toString(3),mt2,true);
        MyThread mt4=new MyThread(Integer.toString(4),mt3,true);
        MyThread mt5=new MyThread(Integer.toString(5),mt4,true);
        MyThread mt6=new MyThread(Integer.toString(6),mt5,true);
        MyThread mt7=new MyThread(Integer.toString(7),mt6,true);
        MyThread mt8=new MyThread(Integer.toString(8),mt7,true);
        MyThread mt9=new MyThread(Integer.toString(9),mt8,false);



    }
}
