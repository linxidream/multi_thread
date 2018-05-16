package supplement.associationThreadGroup.threadDealExceptionTransmit;

public class RunTestP305 {
    public static void main(String[] args) {
        MyThreadGroup myThreadGroup = new MyThreadGroup("我的线程组");
        MyThread myThread = new MyThread(myThreadGroup,"我的线程");
        //类
        MyThread.setDefaultUncaughtExceptionHandler(new StateUncaughtExceptionHandler());
        myThread.start();
    }
}
