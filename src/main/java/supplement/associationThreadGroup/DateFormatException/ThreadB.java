package supplement.associationThreadGroup.DateFormatException;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ThreadB extends Thread{
    private SimpleDateFormat simpleDateFormat;
    private String dateString;
    public ThreadB(SimpleDateFormat simpleDateFormat,String dateString){
        super();
        this.simpleDateFormat = simpleDateFormat;
        this.dateString = dateString;
    }

    @Override
    public void run() {
        try {
            Date date = DateToolsThreadLocal.getSimpleDateFormat("yyyy-MM-dd").parse(dateString);
            String newDateString = DateToolsThreadLocal.getSimpleDateFormat("yyyy-MM-dd").format(date).toString();
            if(!newDateString.equals(dateString)){
                System.out.println("ThreadName "+this.getName() + "报错了，日期字符串："+dateString + "转换后的日期为："+newDateString);
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
