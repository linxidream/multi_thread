package communicateInThreads.productAndCustomByOpStark;

public class TestOneToOneP166 {
    public static void main(String[] args) {
        MyStack myStack = new MyStack();
        Product product = new Product(myStack);
        Custom custom = new Custom(myStack);
        ThreadP threadP = new ThreadP(product);
        ThreadC threadC = new ThreadC(custom);
        threadP.start();
        threadC.start();
    }

}
