package com.mjq.comunnication.threadgroup2;

public class Run {
    public static void main(String[] args) {
        MyThreadGroup group = new MyThreadGroup("我的线程组");
        MyThread[] myThreads = new MyThread[10];
        for (int i = 0; i < myThreads.length; i++) {
            myThreads[i] = new MyThread(group, "线程" + (i + 1), "1");
            myThreads[i].start();
        }
        MyThread newThread = new MyThread(group, "=========================报错线程", "a");
        newThread.start();
    }
}
