package com.mjq.comunnication.threadexceptionmove;

public class MyThreadGroup extends ThreadGroup {
    /**
     * Constructs a new thread group. The parent of this new group is
     * the thread group of the currently running thread.
     * <p>
     * The <code>checkAccess</code> method of the parent thread group is
     * called with no arguments; this may result in a security exception.
     *
     * @param name the name of the new thread group.
     * @throws SecurityException if the current thread cannot create a
     *                           thread in the specified thread group.
     * @see ThreadGroup#checkAccess()
     * @since JDK1.0
     */
    public MyThreadGroup(String name) {
        super(name);
    }

    /**
     * Called by the Java Virtual Machine when a thread in this
     * thread group stops because of an uncaught exception, and the thread
     * does not have a specific {@link Thread.UncaughtExceptionHandler}
     * installed.
     * <p>
     * The <code>uncaughtException</code> method of
     * <code>ThreadGroup</code> does the following:
     * <ul>
     * <li>If this thread group has a parent thread group, the
     * <code>uncaughtException</code> method of that parent is called
     * with the same two arguments.
     * <li>Otherwise, this method checks to see if there is a
     * {@linkplain Thread#getDefaultUncaughtExceptionHandler default
     * uncaught exception handler} installed, and if so, its
     * <code>uncaughtException</code> method is called with the same
     * two arguments.
     * <li>Otherwise, this method determines if the <code>Throwable</code>
     * argument is an instance of {@link ThreadDeath}. If so, nothing
     * special is done. Otherwise, a message containing the
     * thread's name, as returned from the thread's {@link
     * Thread#getName getName} method, and a stack backtrace,
     * using the <code>Throwable</code>'s {@link
     * Throwable#printStackTrace printStackTrace} method, is
     * printed to the {@linkplain System#err standard error stream}.
     * </ul>
     * <p>
     * Applications can override this method in subclasses of
     * <code>ThreadGroup</code> to provide alternative handling of
     * uncaught exceptions.
     *
     * @param t the thread that is about to exit.
     * @param e the uncaught exception.
     * @since JDK1.0
     */
    @Override
    public void uncaughtException(Thread t, Throwable e) {
        super.uncaughtException(t, e);
        System.out.println("线程组的异常处理");
        e.printStackTrace();
    }
}
