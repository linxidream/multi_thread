package supplement.associationThreadGroup.DateFormatException;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 重写parse和format方法
 */
public class DateTools {
    public static Date parse(String formatPattern, String dateString) throws ParseException{
        return new SimpleDateFormat(formatPattern).parse(dateString);
    }
    public static String format(String formatPattern, Date dateString) throws ParseException{
        return new SimpleDateFormat(formatPattern).format(dateString).toString();
    }
}
