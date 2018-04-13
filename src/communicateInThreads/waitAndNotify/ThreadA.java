package communicateInThreads.waitAndNotify;

public class ThreadA extends Thread{
    private Object lock;
    private MyList list;
    public ThreadA (Object lock,MyList list){
        this.lock = lock ;
        this.list = list ;
    }

    @Override
    public void run() {
        try {
            synchronized (lock){
                if(list.size() != 5){
                    System.out.println(currentThread().getName() + " : wait begin" + System.currentTimeMillis());
                    lock.wait();
                    System.out.println(currentThread().getName() + " : wait end " + System.currentTimeMillis());
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
