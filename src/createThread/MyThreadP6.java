package createThread;

public class MyThreadP6 extends Thread{
    public void run(){
        try{
            for(int i=0;i<10;i++){
                int time = (int) (Math.random() * 1000);
                Thread.sleep(time);
                System.out.println("current run "+ i + "=" + Thread.currentThread().getName());
            }
        }catch (InterruptedException  e){
            e.printStackTrace();
        }
    }
}