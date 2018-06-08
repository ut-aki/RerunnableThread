import demo.RerunnableThread;

public class DemoController {

    public static void main(String[] args) {
        RerunnableThread t1 = new ThreadDemo();
        RerunnableThread t2 = new ThreadDemo();
        RerunnableThread t3 = new ThreadDemo();
        RerunnableThread t4 = new ThreadDemo();
        RerunnableThread t5 = new ThreadDemo();

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

        try {
            Thread.sleep(500);            
            t1.rerun();
            t2.rerun();
            t3.rerun();
            t4.rerun();
            t5.rerun();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        try {
            t1.join();
            t2.join();
            t3.join();
            t4.join();
            t5.join();
            System.out.println("All Done!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}