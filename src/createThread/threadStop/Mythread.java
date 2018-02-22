package createThread.threadStop;

public class Mythread extends Thread{
    @Override
    public void run() {
        super.run();
        for(int i = 0;i < 1000;i++){
        /*    if(this.isInterrupted()){
                System.out.println("线程已停止");
                break;
            }*/
            System.out.println("i="+(i+1));
        }
      //  System.out.println("线程真的停止了吗");
    }
}
