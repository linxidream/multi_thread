package communicateInThreads.beforeWaitAndNotify;

public class ThreadB extends Thread{

    private MyList list;
    public ThreadB(MyList list){
        super();
        this.list = list;
    }

    @Override
    public void run() {
        try {
            while(true){
                System.out.println(currentThread().getName() + list.getSize());
                if(list.getSize() == 5){
                    System.out.println(currentThread().getName() + " == 5 了，退出");
                    throw  new InterruptedException();
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
