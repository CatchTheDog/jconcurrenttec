package com.mjq.comunnication.singleton_7_1;

import java.io.Serializable;

public class MyObject implements Serializable {
    private static final long serialVersionUID = 888L;

    private MyObject() {
    }

    public static MyObject getInstance() {
        return MyObjectHandler.myObject;
    }

    private Object readResolve() {
        System.out.println("调用了readResovle方法！");
        return MyObjectHandler.myObject;
    }

    private static class MyObjectHandler {
        private static final MyObject myObject = new MyObject();
    }
}
