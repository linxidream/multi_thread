package communicateInThreads.beforeWaitAndNotify;

public class ThreadB extends Thread{

    private MyList list;
    public ThreadB(MyList list){
        super();
        this.list = list;
    }

    @Override
    public void run() {
        System.out.println(currentThread().getName() + list.getSize());
        long i=0;
        try {
            while(true){
                //System.out.println(currentThread().getName() + list.getSize());
//                Thread.sleepAndJoinDiff(1);
                 if(list.getSize() == 5){
                     i++;
                    System.out.println(currentThread().getName() + " >= 5 了，退出. list.size="+ list.getSize());
                    throw  new InterruptedException();
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
