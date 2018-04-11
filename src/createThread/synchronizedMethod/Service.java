package createThread.synchronizedMethod;

public class Service {
    private boolean isContinueRun = true ;

//    private volatile boolean isContinueRun = true ;
    public void runMethod(){
        while (isContinueRun == true){

        }
        System.out.println("停下来了");
    }
//    String a = new String();
/*    public void runMethod(){
        String a = new String();
        while (isContinueRun == true){
            synchronized (a){

            }
        }
        System.out.println("停下来了");
    }*/

    public void stopMethod(){
        isContinueRun = false ;
    }
}
