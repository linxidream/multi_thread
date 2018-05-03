package LockUse.ReentrantLock.useReentrantLockApplishSynchronized2;

public class MyThreadBB extends Thread{
    private MyService myService;
    public MyThreadBB(MyService service){
        super();
        this.myService = service;
    }

    @Override
    public void run() {
        myService.testMethodB();
    }
}
