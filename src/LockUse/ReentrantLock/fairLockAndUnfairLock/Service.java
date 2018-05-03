package LockUse.ReentrantLock.fairLockAndUnfairLock;

import java.util.concurrent.locks.ReentrantLock;

/**
 * 公平锁：线程获取锁是按加锁顺序执行的，FIFO
 *
 * 非公平锁：是一种获取锁的抢占机制，随机获取的
 */
public class Service {
    public ReentrantLock lock;
    public Service(boolean isFair){
        super();
        lock = new ReentrantLock(isFair);
    }
    public void serviceMethod(){
        try {
            lock.lock();
            Thread.sleep(1000);
            System.out.println("threadName = " + Thread.currentThread().getName() + "获取锁定");
            lock.unlock();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
