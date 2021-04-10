package calander;

import sun.util.resources.cldr.cgg.CalendarData_cgg_UG;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.SimpleTimeZone;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Calendar cal =Calendar.getInstance();
        cal.add(Calendar.DATE,20);
        System.out.println("Time and Date after a days later you entered: "+cal.getTime());
        SimpleDateFormat format1= new SimpleDateFormat("yyyy-mm-dd");
        System.out.println("Date: "+format1.format(cal.getTime()));
        SimpleTimeZone timeZone =new SimpleTimeZone(3600000,
                "Europe/Paris",
                Calendar.MARCH, -1, Calendar.SUNDAY,
                3600000, SimpleTimeZone.UTC_TIME,
                Calendar.OCTOBER, -1, Calendar.SUNDAY,
                3600000, SimpleTimeZone.UTC_TIME,
                3600000);
        System.out.println(timeZone.getDSTSavings());
    }
}
