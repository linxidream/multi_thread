package createThread.isLive;

public class Mythread extends Thread{
    @Override
    public void run() {
        System.out.println("run =" + this.isAlive());
    }
}
