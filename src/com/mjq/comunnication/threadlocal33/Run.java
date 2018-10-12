package com.mjq.comunnication.threadlocal33;

public class Run {
    public static void main(String [] args){
        try{
            for(int i = 0;i<10;i++){
                System.out.println("在main线程中取值 = "+Tools.t1.get());
                Thread.sleep(100);
            }
            ThreadA threadA = new ThreadA();
            threadA.start();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
