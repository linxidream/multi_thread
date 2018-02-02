package createThread;

public class DataNotShare extends Thread{
    private int count = 5;
    public DataNotShare(String name){
        super();
        this.setName(name); //设置线程名称
    }
    public void run(){
        super.run();
        while(count > 0){
            count--;
            System.out.println("由"+this.currentThread().getName()+"计算得count="+count);
        }
    }
}
