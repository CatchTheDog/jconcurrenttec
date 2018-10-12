package com.mjq.comunnication.wait_notify_insert_test;

public class DS_A {
    private String lock;

    volatile private VariableIdentify variableIdentify;

    public DS_A(String lock,VariableIdentify variableIdentify){
        super();
        this.lock = lock;
        this.variableIdentify = variableIdentify;
    }

    public void transData(){
        try{
            synchronized (lock){
                while(variableIdentify.isA()){
                    lock.wait();
                }
                System.out.println("DS_A trans data!");
                variableIdentify.setA(true);
                lock.notifyAll();
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
