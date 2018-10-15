package com.mjq.comunnication.useconditionwaitnotifyerror;

public class Run {
    public static void main(String[] args) {
        MyService myService = new MyService();
        ThreadA a = new ThreadA(myService);
        a.start();
    }
}
