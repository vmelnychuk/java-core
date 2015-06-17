package runner;

import threads.MyThread;

/**
 * Created by Vasyl_Melnychuk on 6/17/2015.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, App!");
        MyThread myThread = new MyThread();
        myThread.start();
    }
}
