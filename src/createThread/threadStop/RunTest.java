package createThread.threadStop;

public class RunTest {
    public static void main(String[] args) {
        try {
//            Mythread mythread = new Mythread();
//            MythreadStop mythread = new MythreadStop();
            MythreadStopInSleep mythread = new MythreadStopInSleep();
            mythread.start();
            Thread.sleep(10);
            mythread.interrupt();
            //测试当前线程是否中断（main）
            System.out.println("thread.interrupted = "+ mythread.interrupted());
            System.out.println("thread.interrupted = "+ mythread.interrupted());
        } catch (InterruptedException e) {

            System.out.println("main catch");
            e.printStackTrace();
        }
        System.out.println("end!");
    }

}
