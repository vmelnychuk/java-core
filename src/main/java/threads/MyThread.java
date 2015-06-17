package threads;

/**
 * Created by Vasyl_Melnychuk on 6/17/2015.
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("run from " + Thread.currentThread().getName());
    }
}
