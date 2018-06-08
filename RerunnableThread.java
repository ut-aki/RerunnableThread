import java.lang.Thread;

public abstract class RerunnableThread extends Thread {
    private Boolean flag;

    public RerunnableThread(Boolean flag) {
        this.flag = flag;
    }
    
    public RerunnableThread() {
        this(false);
    }

    public void rerun(Object lockObj) {
        this.setTrue();
        synchronized (lockObj) {
            lockObj.notifyAll();
        }
        try {
            Thread.sleep(100);
        } catch (Exception e) {
            e.printStackTrace();
        }
    };

    public abstract void rerun();

    public void waitOnce(Object lockObj) {
        synchronized (lockObj) {
            while (!this.getFlag()) {
                try {
                    lockObj.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    };

    protected void setTrue() {
        flag = true;
    }

    protected void setFalse() {
        flag = false;
    }

    public Boolean getFlag() {
        return flag;
    }
}
