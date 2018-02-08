package createThread.threadStop;

public class RunTest2 {
    public static void main(String[] args) {
        Thread.currentThread().interrupt();
        //当前线程是否中断
        System.out.println("Thread.interrupted ="+Thread.interrupted());
        //线程中断状态由该方法清除，此时已清除中断状态
        System.out.println("Thread.interrupted ="+Thread.interrupted());
        System.out.println("end");
    }
}
