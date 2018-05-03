package LockUse.ReentrantLock.useReentrantLockApplishSynchronized2;

/**
 * ReentrantLock类实现对方法的锁定，释放，是对类的对象上的锁，写在类内
 * 类似于synchronized关键字
 */
public class RunTestP203 {
    public static void main(String[] args) {
        MyService myService = new MyService();
        MyService myService1 = new MyService();
        MyThreadA myThreadA = new MyThreadA(myService);
        MyThreadB mythreadB = new MyThreadB(myService);
        MyThreadAA myThreadAA = new MyThreadAA(myService1);
        MyThreadBB mythreadBB = new MyThreadBB(myService1);
        myThreadA.setName("myThreadA");
        mythreadB.setName("mythreadB");
        myThreadAA.setName("myThreadAA");
        mythreadBB.setName("mythreadBB");
        myThreadA.start();
        mythreadB.start();
        myThreadAA.start();
        mythreadBB.start();
    }
}
