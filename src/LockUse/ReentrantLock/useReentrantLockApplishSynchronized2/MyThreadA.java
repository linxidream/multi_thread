package LockUse.ReentrantLock.useReentrantLockApplishSynchronized2;

public class MyThreadA extends Thread{
    private MyService myService;
    public MyThreadA(MyService service){
        super();
        this.myService = service;
    }

    @Override
    public void run() {
        myService.testMethodA();
    }
}
