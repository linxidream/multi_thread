package LockUse.ReentrantLock.useConditionApplishNotifySome;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyService {
    private Lock lock = new ReentrantLock();
    private Condition conditionA = lock.newCondition();
    private Condition conditionB = lock.newCondition();

    public void awaitA(){
        try {
            lock.lock();
            System.out.println(Thread.currentThread().getName() + " awaitA start " + System.currentTimeMillis());
            conditionA.await();
            System.out.println(Thread.currentThread().getName() + " awaitA end " + System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }
    public void awaitB(){
        try {
            lock.lock();
            System.out.println(Thread.currentThread().getName() + " awaitB start " + System.currentTimeMillis());
            conditionB.await();
            System.out.println(Thread.currentThread().getName() + " awaitB end " + System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }
    public void signalA(){
        lock.lock();
        System.out.println(Thread.currentThread().getName() + " signalA start " + System.currentTimeMillis());
        conditionA.signal();
        System.out.println(Thread.currentThread().getName() + " signalA end " + System.currentTimeMillis());
        lock.unlock();
    }

    public void signalB(){
        lock.lock();
        System.out.println(Thread.currentThread().getName() + " signalB start " + System.currentTimeMillis());
        conditionB.signal();
        System.out.println(Thread.currentThread().getName() + " signalB end " + System.currentTimeMillis());
        lock.unlock();
    }
}
