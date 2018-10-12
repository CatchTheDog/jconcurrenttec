package com.mjq.comunnication.wait_notify_insert_test;

public class DS_B {
    private String lock;

    volatile private VariableIdentify variableIdentify;

    public DS_B(String lock,VariableIdentify variableIdentify){
        super();
        this.lock = lock;
        this.variableIdentify = variableIdentify;
    }

    public void trans_data(){
        try{
            synchronized (lock){
                while(!variableIdentify.isA()){
                    lock.wait();
                }
                System.out.println("DS_B trans data!");
                variableIdentify.setA(false);
                lock.notifyAll();
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }

    }
}
