package LockUse.ReentrantLock.useConditionApplishNotifySome;

/**
 * 类中使用多个Condition唤醒部分线程，这是synchronized不能做到的
 */
public class TestP212 {
    public static void main(String[] args) {
        try {
            MyService myService = new MyService();
            ThreadA threadA = new ThreadA(myService);
            ThreadB threadB = new ThreadB(myService);
            threadA.setName("threadA");
            threadB.setName("threadB");
            threadA.start();
            threadB.start();
            Thread.sleep(3000);
            myService.signalA();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
