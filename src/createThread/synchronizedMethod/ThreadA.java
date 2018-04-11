package createThread.synchronizedMethod;

public class ThreadA extends Thread{
    private Service service;
    public ThreadA(Service service){
        super();
        this.service = service ;
    }

    @Override
    public void run() {
        System.out.println("threadA start");
        service.runMethod();
        System.out.println("threadA end");
    }
}
