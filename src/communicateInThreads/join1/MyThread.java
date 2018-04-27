package communicateInThreads.join1;

public class MyThread extends Thread{
    @Override
    public void run() {
        try {
            int a = (int) (Math.random()*1000);
            System.out.println(a);
            Thread.sleep(a);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
