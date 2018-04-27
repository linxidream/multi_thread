package communicateInThreads.productAndCustomByOpValue;

public class P {
    private String lock;
    public P(String lock){
        super();
        this.lock = lock ;
    }
    public void setValue(){
        try{
            synchronized (lock){
                if(!ValueObject.value.equals("")){
                    System.out.println("生产者："+Thread.currentThread().getName()+" waitting");
                    lock.wait();
                }
//                Thread.sleep(100);
                String value = System.currentTimeMillis() + "_" + System.nanoTime();
                System.out.println("生产者："+Thread.currentThread().getName()+"set value = " + value);
                ValueObject.value = value;
                lock.notify();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}