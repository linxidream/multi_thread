package LockUse.ReentrantLock.useReentrantLockApplishSynchronized;

/**
 * 用ReentrantLock方法实现同步，类似synchronized
 *
 * 也是对象锁
 */
public class RunTestP201 {
    public static void main(String[] args) {
        MyService myService = new MyService();
        MyThread mythread1 = new MyThread(myService);
        MyThread mythread2 = new MyThread(myService);
        MyThread mythread3 = new MyThread(myService);
        MyThread mythread4 = new MyThread(myService);
        mythread1.start();
        mythread2.start();
        mythread3.start();
        mythread4.start();
    }
}
