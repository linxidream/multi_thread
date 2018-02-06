package createThread.sleep;

import createThread.isLive.Mythread;

public class Run1 {
    public static void main(String[] args) {
        Mythread1 mythread1 = new Mythread1();
        System.out.println("main begin ="+System.currentTimeMillis());
        mythread1.run();
        System.out.println("main end ="+System.currentTimeMillis());
    }
}
