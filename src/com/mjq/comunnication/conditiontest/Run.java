package com.mjq.comunnication.conditiontest;

public class Run {
    public static void main(String[] args) {
        MyService myService = new MyService();
        for (int i = 0; i < 100; i++) {
            ThreadB b = new ThreadB(myService);
            ThreadA a = new ThreadA(myService);
            a.start();
            a.setName("A_" + i);
            b.setName("B_" + i);
            b.start();
        }
    }
}
