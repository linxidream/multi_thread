package createThread.currentThread;

import createThread.MythreadP7;

public class Run2 {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
       // myThread.start();    //run方法被Thread1调用
        myThread.run();     //run方法被main调用
    }
}
