package createThread.otherTest;

import java.text.DecimalFormat;

public class test {
    public static void main(String[] args) {
       // DecimalFormat df = new DecimalFormat("######0");
        int i = (int) (Math.floor(Math.random()*5));
        int j = (int) (Math.floor(Math.random()*5)+5);

        String[] comment = new String[]{"Nice","Good","I love it","So Amazing"};


        System.out.println(comment[i]);
        //System.out.println(j);

    }
}
