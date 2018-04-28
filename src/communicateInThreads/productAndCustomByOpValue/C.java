package communicateInThreads.productAndCustomByOpValue;

public class C {
    private String lock;
    public C(String lock){
        super();
        this.lock = lock ;
    }
    public void getValue(){
        try{
            synchronized (lock){
                if(ValueObject.value.equals("")){
                    System.out.println("消费者：" + Thread.currentThread().getName() + " waitting");
                    lock.wait();
                }
//                Thread.sleepAndJoinDiff(100);
                System.out.println("消费者：" + Thread.currentThread().getName() + "get value =" + ValueObject.value);
                ValueObject.value = "";
                lock.notify();
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
