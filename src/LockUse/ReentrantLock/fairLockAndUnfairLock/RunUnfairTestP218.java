package LockUse.ReentrantLock.fairLockAndUnfairLock;

/**
 * 非公平锁并没有出现随机获得锁的现象
 */
public class RunUnfairTestP218 {
    public static void main(String[] args) {
        final Service service = new Service(false);
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("线程" + Thread.currentThread().getName() + " run");
                service.serviceMethod();
                /*try {
                    System.out.println("线程" + Thread.currentThread().getName() + " run");
                    Thread.sleep(2000);
                    service.serviceMethod();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }*/
            }
        };
        Thread[] threads = new Thread[10];
        for (int i = 0; i < threads.length ; i++){
            threads[i] = new Thread(runnable);
        }
        for (int i = 0; i < threads.length ; i++){
            threads[i].start();
        }
    }
}
