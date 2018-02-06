package createThread.thisAndCurrent;

public class test {
    public static void main(String[] args) throws InterruptedException {
        CountOperate countOperate = new CountOperate();
        Thread thread = new Thread(countOperate);
        System.out.println("main begin thread isAlive=" + thread.isAlive());
        thread.setName("AAAA");
        thread.start();
       // Thread.sleep(1000);
        System.out.println("main end thread isAlive=" + thread.isAlive());
    }
}
