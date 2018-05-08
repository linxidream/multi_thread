package supplement.deadLock;

public class DealThread implements Runnable{
    public Object object1 = new Object();
    public Object object2 = new Object();
    public String username;
    public void setUsername(String username){
        this.username = username;
    }
    public void run() {
        if(username.equals("a")){
            synchronized (object1){
                try {
                    System.out.println(Thread.currentThread().getName()+ " " + System.currentTimeMillis());
                    Thread.sleep(4000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (object2){
                    System.out.println("a " + Thread.currentThread().getName()+ " " + System.currentTimeMillis());
                }
            }
        }
        if(username.equals("b")){
            synchronized (object2){
                try {
                    System.out.println(Thread.currentThread().getName()+ " " + System.currentTimeMillis());
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (object1){
                    System.out.println("b " + Thread.currentThread().getName()+ " " + System.currentTimeMillis());
                }
            }
        }
    }
}
