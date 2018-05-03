package LockUse.readWriteLock;

import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * 读写锁：读读共享；读写互斥，写读互斥，写写互斥
 */
public class Service {
    private ReentrantReadWriteLock lock = new ReentrantReadWriteLock();
    public void read(){
        try {
            lock.readLock().lock();
            System.out.println("readlock " + Thread.currentThread().getName() + " " + System.currentTimeMillis());
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            lock.readLock().unlock();
        }
    }
    public void write(){
        try {
            lock.writeLock().lock();
            System.out.println("writeLock " + Thread.currentThread().getName() + " " + System.currentTimeMillis());
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            lock.writeLock().unlock();
        }
    }
}
