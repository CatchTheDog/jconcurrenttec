package com.mjq.comunnication.ThreadLocalTest;

public class ThreadB extends Thread {
    /**
     * If this thread was constructed using a separate
     * <code>Runnable</code> run object, then that
     * <code>Runnable</code> object's <code>run</code> method is called;
     * otherwise, this method does nothing and returns.
     * <p>
     * Subclasses of <code>Thread</code> should override this method.
     *
     * @see #start()
     * @see #stop()
     * @see #Thread(ThreadGroup, Runnable, String)
     */
    @Override
    public void run() {
        try{
            for(int i =0;i<100;i++){
                Tools.t1.set("ThreadB:"+(i+1));
                System.out.println("ThreadB get value:"+Tools.t1.get());
                Thread.sleep(200);
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
