package supplement.associationThreadGroup.DateFormatException;

import java.text.SimpleDateFormat;

public class RunTestP296 {
    public static void main(String[] args) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String[] dateStringArray = new String[]{"2000-01-01","2001-01-01","2002-01-01","2003-01-01","2004-01-01","2005-01-01","2006-01-01","2007-01-01","2008-01-01"};
        ThreadB[] threadB = new ThreadB[dateStringArray.length];
        for (int i = 0 ;i < dateStringArray.length;i++){
            threadB[i] = new ThreadB(simpleDateFormat,dateStringArray[i]);
        }
        for (int i = 0 ;i < dateStringArray.length;i++){
            threadB[i].start();
        }
    }
}
