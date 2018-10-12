package com.mjq.comunnication.wait_notify_insert_test;

public class TransDataTool {
    private String lock;

    volatile private Boolean isA = false;

    public TransDataTool(String lock) {
        super();
        this.lock = lock;
    }

    public void transDataB() {
        try {
            synchronized (lock) {
                while (!isA) {
                    lock.wait();
                }
                System.out.println("DS_B trans data!");
                isA = false;
                lock.notifyAll();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void transDataA() {
        try {
            synchronized (lock) {
                while (isA) {
                    lock.wait();
                }
                System.out.println("DS_A trans data!");
                isA = true;
                lock.notifyAll();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();

        }
    }
}
