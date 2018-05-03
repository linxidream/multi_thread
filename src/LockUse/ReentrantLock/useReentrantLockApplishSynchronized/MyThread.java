package LockUse.ReentrantLock.useReentrantLockApplishSynchronized;

public class MyThread extends Thread{
    private MyService myService;
    public MyThread(MyService service){
        super();
        this.myService = service;
    }

    @Override
    public void run() {
        myService.testMethod();
    }
}
