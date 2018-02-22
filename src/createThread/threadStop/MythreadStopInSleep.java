package createThread.threadStop;

public class MythreadStopInSleep extends Thread{
    @Override
    public void run() {
        super.run();
        try {
            System.out.println("run begin");
            Thread.sleep(500);
            System.out.println("run end");
        } catch (InterruptedException e) {
            System.out.println("在沉睡中停止！进入catch!"+this.isInterrupted());
            e.printStackTrace();
        }
    }
}
