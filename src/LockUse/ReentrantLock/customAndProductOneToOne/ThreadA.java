package LockUse.ReentrantLock.customAndProductOneToOne;

public class ThreadA extends Thread{
    private MyService myService;
    public ThreadA(MyService myService){
        super();
        this.myService = myService;
    }

    @Override
    public void run() {
        for (int i = 0 ; i < Integer.MAX_VALUE; i++){
            myService.get();
        }
    }
}
