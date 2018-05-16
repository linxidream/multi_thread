package supplement.associationThreadGroup.ThreadDealException;

public class RunTestP299 {
    public static void main(String[] args) {
        ThreadA.setDefaultUncaughtExceptionHandler(
                new Thread.UncaughtExceptionHandler() {
                    public void uncaughtException(Thread t, Throwable e) {
                        System.out.println(t.getName()+ " 出现了异常");
                        e.printStackTrace();
                    }
                }
        );
        ThreadA threadA = new ThreadA();
        threadA.setName("threadA");
        threadA.start();
        ThreadA threadA1 = new ThreadA();
        threadA1.setName("threadB");
        threadA1.start();
    }
}
