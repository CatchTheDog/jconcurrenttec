package com.mjq.comunnication.readwritebegin1;

public class Run {
    public static void main(String[] args) {
        Service service = new Service();
        ThreadA a = new ThreadA(service);
        ThreadB b = new ThreadB(service);
        ThreadC c = new ThreadC(service);
        ThreadD d = new ThreadD(service);
        a.setName("A");
        b.setName("B");
        c.setName("C");
        d.setName("D");
        a.start();
        b.start();
        c.start();
        d.start();
    }
}
