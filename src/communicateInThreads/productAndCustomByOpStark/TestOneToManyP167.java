package communicateInThreads.productAndCustomByOpStark;

public class TestOneToManyP167 {
    public static void main(String[] args) {
        MyStack myStack = new MyStack();
        Product product = new Product(myStack);
        Custom custom1 = new Custom(myStack);
        Custom custom2 = new Custom(myStack);
        Custom custom3 = new Custom(myStack);
        Custom custom4 = new Custom(myStack);
        Custom custom5 = new Custom(myStack);
        Custom custom6 = new Custom(myStack);
        ThreadP threadP = new ThreadP(product);
        threadP.setName("threadP");
        threadP.start();
        ThreadC threadC1 = new ThreadC(custom1);
        ThreadC threadC2 = new ThreadC(custom2);
        ThreadC threadC3 = new ThreadC(custom3);
        ThreadC threadC4 = new ThreadC(custom4);
        ThreadC threadC5 = new ThreadC(custom5);
        ThreadC threadC6 = new ThreadC(custom6);
        threadC1.setName("threadC1");
        threadC2.setName("threadC2");
        threadC3.setName("threadC3");
        threadC4.setName("threadC4");
        threadC5.setName("threadC5");
        threadC6.setName("threadC6");

        threadC1.start();
        threadC2.start();
        threadC3.start();
        threadC4.start();
        threadC5.start();
        threadC6.start();
    }
}
