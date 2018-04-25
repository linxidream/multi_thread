package communicateInThreads.productAndCustomManytoMany;

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
