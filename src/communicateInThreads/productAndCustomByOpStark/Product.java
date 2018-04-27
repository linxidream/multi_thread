package communicateInThreads.productAndCustomByOpStark;

public class Product {
    private MyStack myStack;
    public Product(MyStack myStack){
        super();
        this.myStack = myStack;
    }
    public void pushService(){
        myStack.push();
    }
}
