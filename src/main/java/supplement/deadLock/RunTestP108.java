package supplement.deadLock;

public class RunTestP108 {
    public static void main(String[] args) throws InterruptedException {
        DealThread dealThread1 = new DealThread();
        dealThread1.setUsername("a");
        Thread threadA = new Thread(dealThread1);
        threadA.start();
        Thread.sleep(100);
        dealThread1.setUsername("b");
        Thread threadB = new Thread(dealThread1);
        threadB.start();
    }
}
