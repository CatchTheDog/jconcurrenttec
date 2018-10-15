package com.mjq.comunnication.mustusermoreconditons_ok;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyService {
    private Lock lock = new ReentrantLock();
    public Condition condition_A = lock.newCondition();
    public Condition condition_B = lock.newCondition();

    public void awaitA() {
        try {
            lock.lock();
            System.out.println("begin awaitA时间为：" + System.currentTimeMillis() + " ThreadName=" + Thread.currentThread().getName());
            condition_A.await();
            System.out.println("end await时间为：" + System.currentTimeMillis() + " ThreadName=" + Thread.currentThread().getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public void awaitB() {
        try {
            lock.lock();
            System.out.println("begin awaitB 时间为：" + System.currentTimeMillis() + " ThreadName=" + Thread.currentThread().getName());
            condition_B.await();
            System.out.println("end awaitB 时间为：" + System.currentTimeMillis() + " ThreadName=" + Thread.currentThread().getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public void signalAll_A() {
        try {
            lock.lock();
            System.out.println("signalAll_A时间为：" + System.currentTimeMillis() + " ThreadName=" + Thread.currentThread().getName());
            condition_A.signalAll();
        } finally {
            lock.unlock();
        }
    }

    public void signalAll_B() {
        try {
            lock.lock();
            System.out.println("signalAll_B时间为：" + System.currentTimeMillis() + " ThreadName=" + Thread.currentThread().getName());
            condition_B.signalAll();
        } finally {
            lock.unlock();
        }
    }

}
