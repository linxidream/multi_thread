package createThread.threadStop;

/**
 * 总结：interrupted：测试当前线程是否已经是中断状态，执行后将具有状态标志的值清除为false
 *       isInterrupted：测试线程对象是否是中断状态，但不清除状态标识
 */
public class RunTest3 {
    public static void main(String[] args) {
        try {
            Mythread mythread = new Mythread();
            mythread.start();
            Thread.sleep(10);
            mythread.interrupt();
            System.out.println("mythread.isInterrupted = "+mythread.isInterrupted());
            System.out.println("mythread.isInterrupted = "+mythread.isInterrupted());
        } catch (InterruptedException e) {
            System.out.println("main catch");
            e.printStackTrace();
        }
        System.out.println("end");
    }
}
