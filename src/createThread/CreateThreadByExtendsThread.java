package createThread;

public class CreateThreadByExtendsThread  extends Thread{
    public void run(){
        super.run();
        System.out.println("CreateThreadByExtendsThread");
    }
}
