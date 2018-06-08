import demo.RerunnableThread;

public class ThreadDemo extends RerunnableThread {
    private static Object lock = new Object();

    public ThreadDemo() {
        super();
    }
    
    public void run() {
        synchronized (lock) {
            // execute something
            super.waitOnce(lock);
            // execute something
        }
    }

    public void rerun() {
        super.rerun(lock);
    };

    public static Object getLock() {
        return lock;
    }
}