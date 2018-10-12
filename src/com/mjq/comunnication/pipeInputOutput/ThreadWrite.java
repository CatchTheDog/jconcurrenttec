package com.mjq.comunnication.pipeInputOutput;

import java.io.PipedOutputStream;

public class ThreadWrite extends Thread{
    private WriteData writeData;
    private PipedOutputStream outputStream;

    public ThreadWrite(WriteData writeData,PipedOutputStream outputStream){
        super();
        this.writeData = writeData;
        this.outputStream = outputStream;
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
        writeData.writeMethod(outputStream);
    }
}
