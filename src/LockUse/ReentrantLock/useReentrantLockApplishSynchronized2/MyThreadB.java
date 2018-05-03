package LockUse.ReentrantLock.useReentrantLockApplishSynchronized2;

public class MyThreadB extends Thread{
    private MyService myService;
    public MyThreadB(MyService service){
        super();
        this.myService = service;
    }

    @Override
    public void run() {
        myService.testMethodB();
    }
}
