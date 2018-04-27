package communicateInThreads.join2;

public class ThreadA extends Thread{
    @Override
    public void run() {
        for(int i = 0 ; i < Integer.MAX_VALUE ; i++){
            String newString = new String();
            Math.random();
            System.out.println(Thread.currentThread().getState()+"  "+ Thread.currentThread().getName());
        }
    }
}
