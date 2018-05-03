package LockUse.ReentrantLock.useReentrantLockApplishSynchronized2;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyService {
    private Lock lock = new ReentrantLock();
    public void testMethodA(){
        try {
            lock.lock();
            System.out.println("methodA " + Thread.currentThread().getName() + " start ");
            Thread.sleep(2000);
            System.out.println("methodA " + Thread.currentThread().getName() + " end ");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }
    public void testMethodB(){
        try {
            lock.lock();
            System.out.println("methodB " + Thread.currentThread().getName() + " start ");
            Thread.sleep(2000);
            System.out.println("methodB" + Thread.currentThread().getName() + " end ");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }
}
