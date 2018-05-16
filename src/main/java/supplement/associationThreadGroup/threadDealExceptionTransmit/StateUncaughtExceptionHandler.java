package supplement.associationThreadGroup.threadDealExceptionTransmit;

public class StateUncaughtExceptionHandler implements Thread.UncaughtExceptionHandler{
    public void uncaughtException(Thread t, Throwable e) {
        System.out.println("静态的异常处理");
        e.printStackTrace();
    }
}
