package communicateInThreads.productAndCustomByOpStark;

/**
 * 最开始取值报错是因为另外的线程运行时没有判断条件，if条件已经执行过了，把if换成while即可（满足条件再进入唤醒状态）
 * 线程进入假死状态是因为没有唤醒所有等待中的线程
 * 线程sleep是不释放锁，wait时释放锁
 */
public class TestManyToManyP170 {
    public static void main(String[] args) {
        MyStack myStack = new MyStack();
        Product product1 = new Product(myStack);
        Product product2 = new Product(myStack);
        Product product3 = new Product(myStack);
        Product product4 = new Product(myStack);
        Product product5 = new Product(myStack);
        Product product6 = new Product(myStack);
        Custom custom1 = new Custom(myStack);
        Custom custom2 = new Custom(myStack);
        Custom custom3 = new Custom(myStack);
        Custom custom4 = new Custom(myStack);
        Custom custom5 = new Custom(myStack);
        Custom custom6 = new Custom(myStack);
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
