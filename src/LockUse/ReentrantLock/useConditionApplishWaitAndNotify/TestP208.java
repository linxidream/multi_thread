package LockUse.ReentrantLock.useConditionApplishWaitAndNotify;

public class TestP208 {
    public static void main(String[] args) {
        try {
            MyService myService = new MyService();
            ThreadA threadA = new ThreadA(myService);
            ThreadB threadB = new ThreadB(myService);
            threadA.setName("threadA");
            threadB.setName("threadB");
            threadA.start();
            Thread.sleep(3000);
            threadB.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
