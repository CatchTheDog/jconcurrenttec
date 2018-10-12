package com.mjq.comunnication.p_r_test;

public class ThreadC extends Thread{
    private C r;

    public ThreadC(C r){
        super();
        this.r = r;
    }

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
        while(true){
            r.getValue();
        }
    }
}
