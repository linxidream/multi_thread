package communicateInThreads.threadLocal.InheritableThreadLocal;
//莫名bug
// https://stackoverflow.com/questions/40864705/error-jdwp-unable-to-get-jni-1-2-environment-jvm-getenv-return-code-2-jd
public class RunTestP198 {
    public static void main(String[] args) {
        try{
            for(int i = 0;i < 10;i++){
                System.out.println("main 中取值 = " + Tools.threadLocalExt.get());
                Thread.sleep(100);
            }
            Thread.sleep(1000);
            ThreadA threadA = new ThreadA();
            threadA.start();
//            Thread.sleep(1000);
            ThreadB threadB = new ThreadB();
            threadB.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
