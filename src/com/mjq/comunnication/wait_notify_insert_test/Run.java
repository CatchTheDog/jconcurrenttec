package com.mjq.comunnication.wait_notify_insert_test;


public class Run {
    public static void main(String [] args){
        VariableIdentify variableIdentify = new VariableIdentify(false);
        String lock = "LOCK";
        DS_A ds_a = new DS_A(lock,variableIdentify);
        DS_B ds_b = new DS_B(lock,variableIdentify);
        for (int i = 0;i<10;i++){
            ThreadDsa threadDsa = new ThreadDsa(ds_a);
            ThreadDsb threadDsb = new ThreadDsb(ds_b);
            threadDsa.start();
            threadDsb.start();
        }
    }
}
