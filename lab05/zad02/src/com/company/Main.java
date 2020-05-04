package com.company;


public class Main {

    public static void main(String[] args) {
        String[] strings = {"aaaa", "bb", "ccccccccccccc", "dddddd"};
        synchronized (strings) {
            MyThread mt = new MyThread(strings[0]);
            MyThread mt1 = new MyThread(strings[1]);
            MyThread mt2 = new MyThread(strings[2]);
            MyThread mt3 = new MyThread(strings[3]);
        }
    }
}
