package communicateInThreads.threadLocal.InheritableThreadLocal;


public class ThreadB extends Thread{
    @Override
    public void run() {
        try {
            for(int i = 0;i < 10;i++){
                System.out.println("ThreadB get Value = "+Tools.threadLocalExt.get());
                Thread.sleep(100);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
