import jdk.swing.interop.SwingInterOpUtils;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Ka_len_der {
    public static void main(String[] args) {
        GregorianCalendar cal=new GregorianCalendar();
        System.out.println(cal.getTime());
        System.out.println(" ");
        System.out.println("YEAR             : " +cal.get(Calendar.YEAR));
        System.out.println("MONTH            : " +cal.get(Calendar.MONTH) );
        System.out.println("DATE             : " +cal.get(Calendar.DATE));
        System.out.println("DAY OF THE YEAR  : " +cal.get(Calendar.DAY_OF_YEAR));
        System.out.println("DAY OF THE MONTH : " +cal.get(Calendar.DAY_OF_MONTH));
        System.out.println("DAY OF THE WEEK  : " + cal.get(Calendar.DAY_OF_WEEK));
        System.out.println("WEEK OF THE YEAR : " +cal.get(Calendar.WEEK_OF_YEAR));
        System.out.println("WEEK OF THE MONTH: " +cal.get(Calendar.WEEK_OF_MONTH));
        System.out.println("AM PM            : " +cal.get(Calendar.AM_PM));
    }
}
