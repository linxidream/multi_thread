package supplement.associationThreadGroup.DateFormatException;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ThreadA extends Thread{
    private SimpleDateFormat simpleDateFormat;
    private String dateString;
    public ThreadA(SimpleDateFormat simpleDateFormat,String dateString){
        super();
        this.simpleDateFormat = simpleDateFormat;
        this.dateString = dateString;
    }

    @Override
    public void run() {
        try {
//            Date date = simpleDateFormat.parse(dateString);
//            String dateParse = simpleDateFormat.format(date).toString();
            Date date = DateTools.parse("yyyy-MM-dd",dateString);
            String dateParse = DateTools.format("yyyy-MM-dd",date).toString();
            if(!dateParse.equals(dateString)){
                System.out.println("ThreadName "+this.getName() + "报错了，日期字符串："+dateString + "转换后的日期为："+dateParse);
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
