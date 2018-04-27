package communicateInThreads.productAndCustomByOpStark;

public class ThreadC extends Thread {
    private Custom custom;
    public ThreadC(Custom custom){
        super();
        this.custom = custom ;
    }

    @Override
    public void run() {
        while(true){
            custom.popService();
        }
    }
}
