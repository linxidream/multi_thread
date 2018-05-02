package communicateInThreads.threadLocal.threadLocalGet.threadLocalGetNull;

public class ThreadLocalP195 {
    public static ThreadLocalExt threadLocalExt = new ThreadLocalExt();

    public static void main(String[] args) {
        if(threadLocalExt.get() == null){
            System.out.println("没放过值");
            threadLocalExt.set("新放旳值");
        }
        System.out.println(threadLocalExt.get());
        System.out.println(threadLocalExt.get());
    }
}
