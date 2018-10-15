package com.mjq.comunnication.userconditionwaitnotifyok;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyService {
    private Lock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();

    public void await() {
        try {
            lock.lock();
            System.out.println("await前 时间为：" + System.currentTimeMillis());
            condition.await();
            System.out.println("await后 时间为：" + System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public void singnal() {
        try {
            lock.lock();
            System.out.println("singnal前 时间为：" + System.currentTimeMillis());
            condition.signal();
            System.out.println("singnal后 时间为：" + System.currentTimeMillis());
        } finally {
            lock.unlock();
        }
    }
}
