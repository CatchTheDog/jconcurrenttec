package com.mjq.comunnication.p_r_test;

public class C {
    private String lock;

    public C(String lock){
        super();
        this.lock = lock;
    }

    public void getValue(){
        try{
            synchronized (lock){
                if(ValueObject.value.equals("")){
                    lock.wait();
                }
                System.out.println("GET的值是：" + ValueObject.value);
                ValueObject.value = "";
                lock.notify();
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }

    }
}
