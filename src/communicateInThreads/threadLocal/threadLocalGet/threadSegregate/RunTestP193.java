package communicateInThreads.threadLocal.threadLocalGet.threadSegregate;

public class RunTestP193 {
    public static void main(String[] args) {
        try{
            for(int i = 0;i < 10;i++){
                System.out.println("main 中取值 = " + Tools.threadLocal.get());
                Thread.sleep(100);
            }
            ThreadA threadA = new ThreadA();
            ThreadB threadB = new ThreadB();
            threadA.start();
            threadB.start();
           /* for(int i = 0;i < 100;i++){
                Tools.threadLocal.set("main" + (i+1));
                System.out.println("main get Value = "+Tools.threadLocal.get());
                Thread.sleep(200);
            }*/
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
