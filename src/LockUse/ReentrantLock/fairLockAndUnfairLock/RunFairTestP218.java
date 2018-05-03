package LockUse.ReentrantLock.fairLockAndUnfairLock;

public class RunFairTestP218 {
    public static void main(String[] args) {
        final Service service = new Service(true);
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("线程" + Thread.currentThread().getName() + " run");
                service.serviceMethod();
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
