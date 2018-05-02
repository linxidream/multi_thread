package communicateInThreads.threadLocal.threadLocalGet.threadSegregate;

import java.util.Date;

public class ThreadA extends Thread{
    @Override
    public void run() {
        try {
            for(int i = 0;i < 10;i++){
                if(Tools.threadLocal.get() == null){
                    Tools.threadLocal.set(new Date());
                }
//                Tools.threadLocal.set("ThreadA" + (i+1));
                System.out.println("ThreadA "+ (i+1) +" get Value = "+Tools.threadLocal.get());
                Thread.sleep(100);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
