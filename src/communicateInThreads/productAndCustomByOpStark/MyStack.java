package communicateInThreads.productAndCustomByOpStark;

import java.util.ArrayList;
import java.util.List;

public class MyStack {
    private List list = new ArrayList<>();
    synchronized public void push(){
      try{
//          if(list.size() == 1){
          while(list.size() == 1){
              System.out.println("push "+Thread.currentThread().getName()+" is waitting");
              this.wait();
          }
          list.add("list"+Math.random());
//          this.notify();
          this.notifyAll();
          System.out.println("push="+list.size());
      }catch(InterruptedException e){
          e.printStackTrace();
      }
    }
    synchronized public String pop(){
        String returnValue = "";
        try{
//            if(list.size() == 0){
            while(list.size() == 0){
                System.out.println("pop "+Thread.currentThread().getName()+" is waitting");
                this.wait();
            }
            returnValue = "" + list.get(0);
            list.remove(0);
//            this.notify();
            this.notifyAll();
            System.out.println("pop = " + list.size());
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        return returnValue;
    }
}
