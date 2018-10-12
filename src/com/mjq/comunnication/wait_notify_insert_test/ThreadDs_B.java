package com.mjq.comunnication.wait_notify_insert_test;

public class ThreadDs_B extends Thread{
    private TransDataTool transDataTool;

    public ThreadDs_B(TransDataTool transDataTool){
        this.transDataTool = transDataTool;
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
        transDataTool.transDataB();
    }
}
