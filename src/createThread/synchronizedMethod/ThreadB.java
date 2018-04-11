package createThread.synchronizedMethod;

public class ThreadB extends Thread{
    private Service service;
    public ThreadB(Service service){
        super();
        this.service = service;
    }

    @Override
    public void run() {
        System.out.println("threadB start");
        service.stopMethod();
        System.out.println("threadB end");
    }
}
