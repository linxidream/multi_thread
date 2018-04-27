package communicateInThreads.productAndCustomByOpStark;

public class TestManyToOneP169 {
    public static void main(String[] args) {
        MyStack myStack = new MyStack();
        Product product1 = new Product(myStack);
        Product product2 = new Product(myStack);
        Product product3 = new Product(myStack);
        Product product4 = new Product(myStack);
        Product product5 = new Product(myStack);
        Product product6 = new Product(myStack);
        Custom custom = new Custom(myStack);
        ThreadP threadP1 = new ThreadP(product1);
        ThreadP threadP2 = new ThreadP(product2);
        ThreadP threadP3 = new ThreadP(product3);
        ThreadP threadP4 = new ThreadP(product4);
        ThreadP threadP5 = new ThreadP(product5);
        ThreadP threadP6 = new ThreadP(product6);

        threadP1.setName("threadP1");
        threadP2.setName("threadP2");
        threadP3.setName("threadP3");
        threadP4.setName("threadP4");
        threadP5.setName("threadP5");
        threadP6.setName("threadP6");
        threadP1.start();
        threadP2.start();
        threadP3.start();
        threadP4.start();
        threadP5.start();
        threadP6.start();
        ThreadC threadC = new ThreadC(custom);
        threadC.start();
    }
}
