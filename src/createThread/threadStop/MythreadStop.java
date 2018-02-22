package createThread.threadStop;

public class MythreadStop extends Thread{
    @Override
    public void run() {
        super.run();
        try{
            for(int i=0;i<500;i++){
                if(this.interrupted()){
                    System.out.println("线程已停止");
                    throw new InterruptedException();
                }
                System.out.println("i="+(i+1));
            }
            System.out.println("线程真的停止了吗");
        }catch (InterruptedException e){
            System.out.println("");
            e.printStackTrace();
        }
    }
}
