package com.mjq.comunnication.readwritebegin1;

public class ThreadD extends Thread {
    private Service service;

    public ThreadD(Service service) {
        super();
        this.service = service;
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
        service.write_2();
    }
}
