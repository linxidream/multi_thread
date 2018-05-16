package supplement.associationThreadGroup.DateFormatException;

import java.text.SimpleDateFormat;

public class DateToolsThreadLocal {
    private static ThreadLocal<SimpleDateFormat> simpleDateFormatThreadLocal = new ThreadLocal<SimpleDateFormat>();
    public static SimpleDateFormat getSimpleDateFormat(String dateParteen){
        SimpleDateFormat simpleDateFormat = null;
        simpleDateFormat = simpleDateFormatThreadLocal.get();
        if(simpleDateFormat == null){
            simpleDateFormat = new SimpleDateFormat(dateParteen);
            simpleDateFormatThreadLocal.set(simpleDateFormat);
        }
        return simpleDateFormat;
    }
}
