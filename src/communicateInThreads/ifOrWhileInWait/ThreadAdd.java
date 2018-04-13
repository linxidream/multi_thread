package communicateInThreads.ifOrWhileInWait;

public class ThreadAdd extends Thread{
    private Add a;
    public ThreadAdd(Add a){
        super();
        this.a = a;
    }

    @Override
    public void run() {
        a.add();
    }
}
