package supplement.associationThreadGroup.threadDealExceptionTransmit;

public class ObjectUncaughtExceptionHandler implements Thread.UncaughtExceptionHandler{
    public void uncaughtException(Thread t, Throwable e) {
        System.out.println("对象的异常处理");
        e.printStackTrace();
    }
}
