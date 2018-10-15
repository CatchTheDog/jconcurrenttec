package com.mjq.comunnication.singleton_1;

/**
 * 单例模式
 */
public class MyObject {
    private static MyObject myObject;

    private MyObject() {
    }

    /**
     * 正确写法
     *
     * @return
     */
    public static MyObject getInstance() {
        try {
            Thread.sleep(3000);
            if (null == myObject) {
                synchronized (MyObject.class) {
                    if (null == myObject) {
                        myObject = new MyObject();
                    }
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return myObject;
    }

    /**
     * 错误写法
     *
     * @return
     */
    public static MyObject getInstance_1() {
        try {
            Thread.sleep(3000);
            synchronized (MyObject.class) {
                if (null == myObject) {
                    myObject = new MyObject();
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return myObject;
    }

}
