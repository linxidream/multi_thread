package communicateInThreads.threadLocal.threadLocalGet;

public class ThreadLocalP191 {
    public static ThreadLocal threadLocal = new ThreadLocal();

    public static void main(String[] args) {
        if(threadLocal.get() == null){
            System.out.println("没放过值");
            threadLocal.set("刚放旳值");
        }
        System.out.println(threadLocal.get());
        System.out.println(threadLocal.get());
    }
}
