package com.mjq.comunnication.wait_notify_insert_test;



public class ThreadDsa extends Thread {
    private DS_A ds_a;

    public ThreadDsa(DS_A ds_a){
        super();
        this.ds_a = ds_a;
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
        ds_a.transData();
    }
}
