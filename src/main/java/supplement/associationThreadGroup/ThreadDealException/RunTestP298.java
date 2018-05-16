package supplement.associationThreadGroup.ThreadDealException;

public class RunTestP298 {
    public static void main(String[] args) {
        final ThreadA threadA = new ThreadA();
        threadA.setName("threadA");
        threadA.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
            public void uncaughtException(Thread t, Throwable e) {
                System.out.println(threadA.getName()+" 出现了异常");
                e.printStackTrace();
            }
        });
        threadA.start();
        ThreadA threadA1 = new ThreadA();
        threadA1.setName("threadB");
        threadA1.start();
    }
}
