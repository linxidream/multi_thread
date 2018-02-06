package createThread.isLive;

public class Run {
    public static void main(String[] args) throws InterruptedException {
        Mythread mythread = new Mythread();
        System.out.println("begin ==  " + mythread.isAlive());
        mythread.start();
        Thread.sleep(1000);
        System.out.println("end == " + mythread.isAlive());
    }
}
