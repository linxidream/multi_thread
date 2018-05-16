package supplement.associationThreadGroup.ThreadGroupDealException;

public class ThreadA extends Thread{
    private String num;
    public ThreadA (ThreadGroup threadGroup,String name,String num){
        super(threadGroup,name);
        this.num = num;
    }

    @Override
    public void run() {
        int numInt = Integer.parseInt(num);
/*
        while (true){
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("循环中："+ Thread.currentThread().getName());
        }
*/

        while (this.isInterrupted() == false){
            System.out.println("循环中："+ Thread.currentThread().getName());
        }
    }
}
