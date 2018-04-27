package communicateInThreads.productAndCustomByOpStark;

public class Custom {
    private MyStack myStack;
    public Custom(MyStack myStack){
        this.myStack = myStack;
    }
    public void popService(){
        System.out.println("pop="+myStack.pop());
    }
}
