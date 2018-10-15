package com.mjq.comunnication.timetest3;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class Run {
    public static void main(String[] args) {
        MyTask task = new MyTask();
        Timer timer = new Timer();
        System.out.println("当前时间：" + new Date());
        timer.schedule(task, 7000);
    }

    static public class MyTask extends TimerTask {
        /**
         * The action to be performed by this timer task.
         */
        @Override
        public void run() {
            System.out.println("运行了，时间为：" + new Date());
        }
    }

}
