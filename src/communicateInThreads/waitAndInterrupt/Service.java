package communicateInThreads.waitAndInterrupt;

public class Service {
    public void testMethod(Object lock){
        try{
            synchronized (lock){
                System.out.println("begin");
                lock.wait();
                System.out.println("end");
            }
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("出现异常，线程被interrupt了");
        }
    }
}
