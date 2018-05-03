package LockUse.ReentrantLock.useConditionApplishWaitAndNotify;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyService {
    private Lock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();
    public void await(){
        try {
            lock.lock();
            System.out.println(Thread.currentThread().getName() + " wait start " + System.currentTimeMillis());
            condition.await();
            System.out.println(Thread.currentThread().getName() + " wait end " + System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }
    public void signal(){
        lock.lock();
        System.out.println(Thread.currentThread().getName() + " signal start " + System.currentTimeMillis());
        condition.signal();
        System.out.println(Thread.currentThread().getName() + " signal end " + System.currentTimeMillis());
        lock.unlock();
    }
}
