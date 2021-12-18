package sitori.helper;

import java.util.Date;
import java.text.SimpleDateFormat;

/**
 *
 * @author lucky
 */
public class DateHelper {
    
    public static String generateTimeStamp() {
        Date date = new Date();
        SimpleDateFormat dateFormater = new SimpleDateFormat("yyyy-MM-dd H:i:s");
        return dateFormater.format(date);
    }
    
}
