package communicateInThreads.productAndCustomByOpStark;

public class ThreadP extends Thread {
    private Product product;
    public ThreadP(Product product){
        super();
        this.product = product;
    }

    @Override
    public void run() {
        while(true){
            product.pushService();
        }
    }
}
