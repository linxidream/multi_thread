package LockUse.ReentrantLock.useReentrantLockApplishSynchronized2;

public class MyThreadAA extends Thread{
    private MyService myService;
    public MyThreadAA(MyService service){
        super();
        this.myService = service;
    }

    @Override
    public void run() {
        myService.testMethodA();
    }
}
