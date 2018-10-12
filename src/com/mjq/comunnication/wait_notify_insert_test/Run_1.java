package com.mjq.comunnication.wait_notify_insert_test;

public class Run_1 {
    public static void main(String [] args){
        String lock = "LOCK";
        TransDataTool transDataTool = new TransDataTool(lock);
        for(int i = 0;i<10;i++){
            ThreadDs_A threadDs_a = new ThreadDs_A(transDataTool);
            ThreadDs_B threadDs_b = new ThreadDs_B(transDataTool);
            threadDs_a.start();
            threadDs_b.start();
        }
    }
}
