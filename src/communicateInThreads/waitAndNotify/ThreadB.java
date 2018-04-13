package communicateInThreads.waitAndNotify;

public class ThreadB extends Thread{
    private Object lock;
    private MyList list;
    public ThreadB(Object lock,MyList list){
        this.lock = lock ;
        this.list = list ;
    }

    @Override
    public void run() {
        synchronized (lock){
            for(int i = 0 ;i <10; i++){
                list.add();
                if(list.size() == 5){
                    lock.notify();
                    System.out.println(currentThread().getName() + " : 发出通知");
                }
                System.out.println("添加了"+(i+1)+"个元素");
            }
        }
    }
}
