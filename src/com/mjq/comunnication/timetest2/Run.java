package com.mjq.comunnication.timetest2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class Run {
    public static void main(String[] args) {
        try {
            MyTask task = new MyTask();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String dateString = "2018-10-15 14:13:00";
            Timer timer = new Timer();
            Date dateRef = sdf.parse(dateString);
            System.out.println("字符串时间：" + dateRef.toString() + " 当前时间： " + new Date());
            timer.schedule(task, dateRef, 4000);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    static public class MyTask extends TimerTask {
        /**
         * The action to be performed by this timer task.
         */
        @Override
        public void run() {
            System.out.println("运行了，时间：" + new Date());
        }
    }
}
