package createThread;

public class MythreadP7 extends Thread{
    private int i;
    public MythreadP7(int i){
        super();
        this.i = i;
    }
    public void run(){
        System.out.println(i);
    }
}
