package com.mjq.comunnication.conditiontest;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyService {
    volatile private int a = 0;
    private Lock lock = new ReentrantLock();
    private Condition conditionA = lock.newCondition();
    private Condition conditionB = lock.newCondition();

    public void producer() {
        try {
            lock.lock();
            while (a > 0) {
                conditionA.await();
            }
            a++;
            System.out.println("生产者:" + Thread.currentThread().getName() + "生产！===" + a);
            conditionB.signalAll();

        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public void consumer() {
        try {
            lock.lock();
            while (a == 0) {
                conditionB.await();
            }
            a--;
            System.out.println("消费者:" + Thread.currentThread().getName() + "消费======！" + a);
            conditionA.signalAll();

        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
}
